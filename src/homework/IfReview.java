package homework;

public class IfReview {

    public static String name;

    static {
        //name = "heyo";
    }

    public static void main(String[] args) {

        IfReview ifReview = new IfReview();
        //ifReview.name = "yoyo";

        IfReview newReview = new IfReview();
        //newReview.name = "nono";

        IfReview lastIfReview = new IfReview();
        System.out.println(lastIfReview.name);

    }
}
