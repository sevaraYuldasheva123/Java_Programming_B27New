package day49_functiona_interface.driver;

import day49_functiona_interface.ConfigReader;

public class Driver {

    private Driver(){//constructor--> to create the object
        //private means no object can be created outside of the class
    }

    private static WebDriver driver;
    //private: cannot access from outside of the class
    //static: dont need an object to use
    //default value is null

    public static WebDriver getDriver(){
    if (driver == null){
        switch (ConfigReader.getProperties("browser")){
            case "chrome":
                driver = new ChromeDriver();
                //rest of the code goes here --> like maximizing the window and putting waits
                break;
            case "firefox":
                driver = new FirefoxDriver();
                //rest of the code goes here --> like maximizing the window and putting waits
                break;
        }
    }


        return driver;
    }






}
