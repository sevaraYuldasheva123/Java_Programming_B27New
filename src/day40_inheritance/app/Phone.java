package day40_inheritance.app;

public class Phone {

    public static void main(String[] args) {

        Phone phone = new Phone();

        Youtube youtube = new Youtube(3.2);

        System.out.println(youtube.name);
        System.out.println(youtube.version);
        youtube.watchVideo();
        youtube.download();

    }
}
