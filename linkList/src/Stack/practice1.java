package Stack;


import java.util.Stack;

public class practice1 {
    public static void main(String[] args){
        Stack<Integer> s1 = new Stack<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        s1.add(5);
        s1.add(6);

        System.out.println(s1);

        s1.pop();
        System.out.println(s1);

        s1.push(7);
        System.out.println(s1);

    }
}
