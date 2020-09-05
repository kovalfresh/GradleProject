package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FileUtils {

    public static InputStream getInputStream(String path) {
        InputStream input = null;
        try {
            input = new FileInputStream( path);
        } catch ( FileNotFoundException e ) {
            e.printStackTrace();
        }
        return input;
    }

    public static Properties load( InputStream input ) {
        Properties prop = new Properties();
        try {
            assert input != null: "System props are null. No point to run the tests";
            prop.load( input);
        } catch ( IOException e ) {
            e.printStackTrace();
        }
        return prop;
    }
}
