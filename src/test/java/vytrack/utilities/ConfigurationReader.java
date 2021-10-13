package vytrack.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //In this class we will implement the repeated steps of reading
    // from configuration.properties file
    //#1- Create the object of Properties
    private static Properties properties = new Properties();

    //#2 using static block to only load it one time.
    static {
        //#3- Get the path and open the file
        try {
            FileInputStream in = new FileInputStream("configuration.properties");

            //#4- Load the opened file into properties object
            properties.load(in);

            //closing the file in JVM Memory
            in.close();

        } catch (IOException e) {
            System.out.println("Error occurred while reading configuration.properties " + e.getMessage()) ;
        }
    }

    //#5- Use the object to read from the configuration.properties file
    public static String read(String key) {
        return properties.getProperty(key);
    }
}
