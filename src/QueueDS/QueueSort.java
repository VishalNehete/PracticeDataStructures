package QueueDS;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class QueueSort {


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
        System.out.println("****************************");
        //reverse the queue
        reverseQueue(queue);
        for (int q:queue){
            System.out.println(q);
        }
    }

    private static void reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }
    }
}
