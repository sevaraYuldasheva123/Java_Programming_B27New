package day21_nested_loops;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        /*
        given a string determine how many times a character is in the String
        java
        j -1
        a - 2
        v - 1
         */

        String str = "infinity";
        String checked = "";

        for (int i = 0; i < str.length(); i++){ // outer loop is iterating one character at a time

            int count = 0; // count should reset to 0  for each character, thats why it is inside the loop
            //check if
        //j   j == j        a   a == j      v   v == j
            //j == a            a == a          v == a
            //j == v            a == v          v == v
            //j == a            a == a          a == a

            if (!checked.contains(""+ str.charAt(i))) { // only run the counting and inner loop if the character does not already been checked


                for (int j = 0; j < str.length(); j++) { // inner: compare the characters we are looking at index i with each other char in the String

                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }
                System.out.println(str.charAt(i) + " - " + count);
                checked += str.charAt(i);

            }

        }
    }
}
