package day49_functiona_interface;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties = new Properties();
    //private accessible within the class only
    //static access by class name instead of creating object
    //Properties : we are creating an object of this class to connect to properties

    //static block will run the code 1 in the beginning , and will create the connection
    static {
        //we are making a connection , with the specified class
        try {
            //creates the file object , allows us to connect
            FileInputStream file = new FileInputStream("test.properties");
            //loads the files into the properties object
            properties.load(file);
        } catch (IOException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

    }

    public static String getProperties(String key){
        return properties.getProperty(key);
    }
}
