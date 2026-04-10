package LinkedList;

import java.util.LinkedList;

public class List1 {
    public static void main(String[] args){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);

        System.out.println(ll);

        int num = ll.get(4);
        System.out.println(num);

        boolean num2 = ll.contains(6);
        System.out.println(num2);

        int num3 = ll.set(0, 8);
        System.out.println(ll);

        ll.addFirst(0);
        System.out.println(ll);


    }


}
