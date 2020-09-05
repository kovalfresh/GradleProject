package other;

import utils.FileUtils;

import java.io.InputStream;

public class RunConfig {

    public static String readFromConfig(String stringProp) {
        InputStream input = FileUtils.getInputStream( "src/main/resources/system.properties" );
        return FileUtils.load( input ).getProperty(stringProp);
    }

    public static String getStartURL() {
        return readFromConfig( "basicURL" );
    }
}
