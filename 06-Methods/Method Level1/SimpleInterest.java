import java.util.Scanner;

class SimpleInterest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your principal: ");
        double P = input.nextDouble();
        System.out.print("Enter the rate: ");
        double R = input.nextDouble();
        System.out.print("Enter the time: ");
        double T = input.nextDouble();
        SimpleInterest(P,R,T);

    }
    public static void SimpleInterest(double P,double R,double T){
        double SI = P*R*T/100;
        System.out.println("the simple Interest is "+SI+" for principal "+P+" rate of Interest "+R+" and Time "+T);
    }



}