package Queue;

import java.util.PriorityQueue;

public class practice {
    public static void main(String[] args){
        PriorityQueue<String> q = new PriorityQueue<>();
        q.add("golu");
        q.add("kallu");
        q.add("pintu");
        q.add("chintu");

        System.out.println(q);

        q.offer("kittu");
        System.out.println(q);

        System.out.println(q.element());
        System.out.println(q.peek());

        q.poll();
        System.out.println(q);





    }
}
