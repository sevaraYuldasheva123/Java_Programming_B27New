package day39_inheritance.library;

public class Library {

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.author = "James Clear";
        book1.title = "Atomic habits";

        System.out.println();

        AudioBook book2 = new AudioBook();
        book2.duration = 45.20;
        book2.narrator = "James Bond";
        book2.hasMovie = true;


        EBook book3 = new EBook();
        book3.size = 24.12;
        book3.onKindle = true;


    }
}
