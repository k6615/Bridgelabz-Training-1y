import java.util.Scanner;

public class tenth {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your number1");
        double n1 = sc.nextInt();
        System.out.println("enter your number2");
        double n2 = sc.nextInt();
         System.out.println("enter your operator");
        String op = sc.next();

        switch(op){
            case "+" : System.out.println("plus is :"+(n1 + n2));
            break;

            case "-" : System.out.println("your subtraction is :"+(n1 - n2));
            break;

            case "*" : System.out.println("your multiplication is :"+(n1*n2));
            break;

            case "/" : System.out.println("your division is :"+(n1/n2));
            break;

            default :  System.out.println("not in the programm");
        }
}
}
