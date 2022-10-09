package QueueDS;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueUsingArrayDeque {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        //In-built enQueue operation
        queue.add(12);
        queue.add(23);
        queue.add(54);
        queue.add(32);
        queue.add(2);
        queue.add(6);

        //Inbuilt deQueue operation
        queue.remove();
        queue.remove();

        //remove specific element
        queue.remove(32);

        for (int q:queue){
            System.out.println(q);
        }
    }




}
