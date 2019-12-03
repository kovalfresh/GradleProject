import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class RunConfig {

    public static String readFromConfig(String stringProp) throws IOException {
        Properties prop = new Properties();
        InputStream input = new FileInputStream("src/main/resources/system.properties");
        prop.load(input);
        return prop.getProperty(stringProp);
    }

    public static String getStartURL() {
        try {
            Properties prop = new Properties();
            InputStream input = new FileInputStream("src/main/resources/system.properties");
            prop.load(input);
            return prop.getProperty("basicURL");
        }  catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
