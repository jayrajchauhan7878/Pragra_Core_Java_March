package may04_generics.practice;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        System.out.println("Size at beginning "+pq);

        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);

        System.out.println("Added values "+pq);
        System.out.println("Size after values "+pq.size());

        System.out.println("Peek top most "+pq.peek());

        System.out.println("Removing First In and out"+pq.poll());

        System.out.println("After removing "+pq);

        System.out.println("Size afer removing"+pq.size());
    }
}
