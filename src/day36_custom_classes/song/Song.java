package day36_custom_classes.song;

public class Song {

    String name;
    double length;
    String artist;
    String genre;

    // constructors can be overloaded
    public Song(String name, double length){

        this.name = name;
        this.length = length;
    }

    public Song(String name, double length, String artist, String genre){

        // assigning instance variables to local variables
        this.name = name;
        this.length = length;
        this.artist = artist;
        this.genre = genre;

    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
