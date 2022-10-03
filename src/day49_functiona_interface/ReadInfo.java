package day49_functiona_interface;

public class ReadInfo {

    public static void main(String[] args) {

        System.out.println(ConfigReader.getProperties("day"));

        System.out.println(ConfigReader.getProperties("browser"));

        System.out.println(ConfigReader.getProperties("topic"));

    }
}
