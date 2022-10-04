package day49_functiona_interface.driver;

public class ChromeDriver  implements WebDriver {

    @Override
    public void get() {
        System.out.println("opening in chrome");
    }

    @Override
    public void findElement() {
        System.out.println("finding the elements in chrome");
    }
}
