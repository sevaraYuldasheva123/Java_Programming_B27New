package day46_collections;

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
    }
}
