package uy.gub.agesic.pge.core.config;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"stsConfig", "keyStore"})
@XmlRootElement(name = "PGEConfig")
public class PGEConfig {
    @XmlElement(name = "STSConfig", required = true)
    protected STSConfig stsConfig;

    @XmlElement(name = "KeyStore", required = true)
    protected KeyStore keyStore;

    public STSConfig getSTSConfig() {
        return this.stsConfig;
    }

    public void setSTSConfig(STSConfig value) {
        this.stsConfig = value;
    }

    public KeyStore getKeyStore() {
        return this.keyStore;
    }

    public void setKeyStore(KeyStore value) {
        this.keyStore = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"auth"})
    public static class KeyStore {
        @XmlElement(name = "Auth")
        protected List<Auth> auth;

        public List<Auth> getAuth() {
            if (this.auth == null) {
                this.auth = new ArrayList<Auth>();
            }
            return this.auth;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Auth {
            @XmlAttribute(name = "Key")
            protected String key;

            @XmlAttribute(name = "Value")
            protected String value;

            public String getKey() {
                return this.key;
            }

            public void setKey(String value) {
                this.key = value;
            }

            public String getValue() {
                return this.value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"property"})
    public static class STSConfig {
        @XmlElement(name = "Property")
        protected List<Property> property;

        @XmlAttribute
        protected String url;

        public List<Property> getProperty() {
            if (this.property == null) {
                this.property = new ArrayList<Property>();
            }
            return this.property;
        }

        public String getUrl() {
            return this.url;
        }

        public void setUrl(String value) {
            this.url = value;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Property {
            @XmlAttribute(name = "Key")
            protected String key;

            @XmlAttribute(name = "Value")
            protected String value;

            public String getKey() {
                return this.key;
            }

            public void setKey(String value) {
                this.key = value;
            }

            public String getValue() {
                return this.value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }
    }
}