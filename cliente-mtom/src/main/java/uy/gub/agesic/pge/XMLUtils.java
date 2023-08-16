package uy.gub.agesic.pge;

import java.io.*;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import uy.gub.agesic.pge.exceptions.MarshalException;
import uy.gub.agesic.pge.exceptions.RequestSecurityTokenException;

public class XMLUtils {

    /**
     * Creates a string representation of a {@link Node} instance. This method
     * does not introduce any character to the string representation of the
     * {@link Node} (eg. \n or \r characters)
     *
     * @param node
     *            A {@link Node} instance
     * @return A string representation of the node instance
     * @throws RequestSecurityTokenException
     */
    public static String xmlToString(final Node node) throws MarshalException {
        try {
            final Source source = new DOMSource(node);
            final StringWriter stringWriter = new StringWriter();
            final Result result = new StreamResult(stringWriter);
            final TransformerFactory factory = TransformerFactory.newInstance();
            final Transformer transformer = factory.newTransformer();
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            transformer.transform(source, result);
            return stringWriter.getBuffer().toString();

        } catch (final TransformerConfigurationException e) {
            e.printStackTrace();
            throw new MarshalException("Cannot build a string representation of the assertion.");
        } catch (final TransformerException e) {
            e.printStackTrace();
            throw new MarshalException("Cannot build a string representation of the assertion.");
        }
    }

    /**
     * @param string
     *            Creates a {@link Document} from a string.
     * @return A {@link Document} representation of the string.
     * @throws ParserConfigurationException
     *             if a DocumentBuilder cannot be created which satisfies the
     *             configuration requested
     * @throws SAXException
     *             if any parse errors occur
     * @throws IOException
     *             if any IO errors occur.
     */
    public static Document stringToXml(final String string)
            throws ParserConfigurationException, SAXException, IOException {
        final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        final DocumentBuilder builder = factory.newDocumentBuilder();
        final InputSource is = new InputSource(new StringReader(string));
        if (builder.isNamespaceAware()) {
            System.out.println("#######################3Is aware");
        } else {
            System.out.println("#######################Not aware");
        }
        return builder.parse(is);
    }

    public static KeyStore prepareKeystore(final String keystorePath, final String keystorePassword)
            throws KeyStoreException, IOException, RequestSecurityTokenException {
        System.out.println("STS - SSL config: keystorePath=" + keystorePath + ", keystorePassword=" + keystorePassword);
        //log.debug("STS - SSL config: keystorePath=" + keystorePath + ", keystorePassword=" + keystorePassword);

        final KeyStore keystore = KeyStore.getInstance(KeyStore.getDefaultType());
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(new File(keystorePath));
            keystore.load(inputStream, keystorePassword.toCharArray());
            return keystore;
        } catch (final NoSuchAlgorithmException exception) {
            System.out.println(exception.getMessage());
            //log.error(exception.getMessage(), exception);
            throw new RequestSecurityTokenException(exception, Integer.valueOf(902));
        } catch (final CertificateException exception) {
            System.out.println(exception.getMessage());
            //log.error(exception.getMessage(), exception);
            throw new RequestSecurityTokenException(exception, Integer.valueOf(900));
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (final Exception exception) {
                System.out.println("Error al cerrar el stream al leer el keystore " + keystorePath);
                //log.error("Error al cerrar el stream al leer el keystore " + keystorePath);
            }
        }
    }
}

