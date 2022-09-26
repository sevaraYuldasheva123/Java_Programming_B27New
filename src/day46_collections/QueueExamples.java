package day46_collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {

    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(3);
        queue.add(10);
        queue.add(8);
        queue.add(2);

        System.out.println(queue);
        System.out.println(queue.peek()); //shows what was first
        queue.poll(); // will remove what was first in the prioritized queue
        System.out.println(queue);

        System.out.println("----------------------------");

        ArrayDeque<String> queue2 = new ArrayDeque<>();
        queue2.offer("java"); // adds elements to thr deque
        queue2.offer("tuesday");
        queue2.offer("soft skills");
        queue2.offer("automation");
        System.out.println(queue2);
        System.out.println( queue2.peek()); // sto see what in the beginning

        queue2.poll(); // removes first --> "java" out
        System.out.println(queue2);

        queue2.offerFirst("API"); // adds new value to the first index
        queue2.offerLast("Database"); // add value to the last index
        System.out.println(queue2);


    }
}
