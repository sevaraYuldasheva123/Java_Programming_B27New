package day46_collections;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        //LIFO --> Last in First out
        Stack<String> stack = new Stack<>();
        stack.push("a"); //add
        stack.push("b");
        stack.push("c");

        System.out.println(stack);
        stack.pop(); //removes the last thing that was added
        System.out.println(stack);

        System.out.println("What is the last thing: "+stack.peek());

        stack.push("d");
        System.out.println(stack);


    }
}
