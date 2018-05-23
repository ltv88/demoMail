import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class PropertyReader {

    private Properties sdkProperties;

    /**
     * Creates a property reader that deserializes the property file from a jar
     *
     * @param sdkPropertiesPath
     */
    public PropertyReader(final String sdkPropertiesPath) {
        sdkProperties = readProperties(sdkPropertiesPath);
    }

    /**
     * @param propertiesPath
     * @return Properties
     */
    private Properties readProperties(final String propertiesPath) {
        Properties properties = null;
        InputStream inputStream = null;
        try {
            // load the jar's properties files
            inputStream = PropertyReader.class.getClassLoader().getResourceAsStream(propertiesPath);
            // if there is an inputstream, execute the following
            properties = new Properties();
            properties.load(inputStream);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return properties;
    }

    /**
     * Get the URL for the given class name.
     *
     * @param className
     * @return the URL path property
     */
    public String getRestUrl(String className) {
        return sdkProperties.getProperty("rest" + className + "Path");
    }

    public String getSimpleProperty(String key, String def) {
        return sdkProperties.getProperty(key, def);
    }
}
