package uy.gub.agesic.pge.core.config;

//import org.picketlink.identity.federation.core.util.StringUtil;
import uy.gub.agesic.pge.exceptions.ConfigurationException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class PGEConfiguration {
    private static final Pattern EXPANSION_PATTERN = Pattern.compile("(\\$\\{([^}]+?)\\})", 8);
    private final PGEConfig config;
    private final Map<String, String> stsValues = new HashMap<String, String>();
    private final Map<String, String> authValues = new HashMap<String, String>();

    public PGEConfiguration(String configFile) throws ConfigurationException {
        try {
            configFile = resolveEnvVars(configFile);
            JAXBContext context = JAXBContext.newInstance(new Class[]{PGEConfig.class});
            InputStream inputStream = getConfigStream(configFile);
            this.config = (PGEConfig) context.createUnmarshaller().unmarshal(inputStream);

            List<PGEConfig.KeyStore.Auth> authTypes = this.config.getKeyStore().getAuth();
            for (PGEConfig.KeyStore.Auth authType : authTypes) {
                this.authValues.put(authType.getKey(), authType.getValue());
            }

            List<PGEConfig.STSConfig.Property> propertyTypes = this.config.getSTSConfig().getProperty();
            for (PGEConfig.STSConfig.Property propertyType : propertyTypes) {
                this.stsValues.put(propertyType.getKey(), propertyType.getValue());
            }
        }
        catch (JAXBException e) {
            throw new ConfigurationException(e.getMessage(), e);
        }
    }

    public String getSTSURL() {
        return this.config.getSTSConfig().getUrl();
    }

    public String getKeyStoreAuthValue(String key) throws ConfigurationException {
        String value = this.authValues.get(key);
        if (value.startsWith("MASK-")) {
            String salt = this.authValues.get("salt");
            int iterationCount = Integer.parseInt(this.authValues.get("iterationCount"));
            try {
                //TODO: Fix this
                return "Not implemented yet";//StringUtil.decode(value, salt, iterationCount);
            } catch (Exception e) {
                throw new ConfigurationException(e);
            }
        }

        return resolveEnvVars(value);
    }

    public String getSTSPropValue(String key) {
        return this.stsValues.get(key);
    }

    public Long getSTSLongPropValue(String key) {
        if (this.stsValues.get(key) != null) {
            return Long.parseLong(this.stsValues.get(key));
        }

        return null;
    }

    private String resolveEnvVars(String input) {
        if (input == null) return null;

        Map<?, ?> props = System.getProperties();
        Matcher matcher = EXPANSION_PATTERN.matcher(input);
        StringBuffer expanded = new StringBuffer(input.length());
        while (matcher.find()) {
            String propName = matcher.group(2);
            String value = (String) props.get(propName);
            if (value == null) value = matcher.group(0);
            matcher.appendReplacement(expanded, "");
            expanded.append(value);
        }
        matcher.appendTail(expanded);

        return expanded.toString();
    }

    private InputStream getConfigStream(String configPath) {
        InputStream is = null;
        try {
            File file = new File(configPath);
            return new FileInputStream(file);
        } catch (Exception e) {
            URL url;
            try {
                url = new URL(configPath);
                return url.openStream();
            } catch (Exception ex) {
                url = SecurityActions.loadResource(PGEConfiguration.class, configPath);
                if (url != null) {
                    try {
                        return url.openStream();
                    } catch (IOException e1) {
                    }
                }
            } finally {
                if (is != null) {
                    try {
                        is.close();
                    } catch (IOException e1) {
                    }
                }
            }
            throw new RuntimeException("Config file not located: " + configPath);
        }
    }
}