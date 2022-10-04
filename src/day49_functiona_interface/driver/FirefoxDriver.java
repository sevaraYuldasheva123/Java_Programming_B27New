package day49_functiona_interface.driver;

public class FirefoxDriver implements WebDriver {

    @Override
    public void get() {
        System.out.println("opening in firefox");
    }

    @Override
    public void findElement() {
        System.out.println("finding elements in firefox");
    }
}
