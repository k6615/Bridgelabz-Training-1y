import java.util.Scanner;

class AthleteRounds {
    public static void main(String[] args) {
        System.out.println("Enter the Triangle sides");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first side: ");
        int a = input.nextInt();
        System.out.print("Enter the second side: ");
        int b = input.nextInt();
        System.out.print("Enter the third side: ");
        int c = input.nextInt();
        int dis = 5000;
        numberOfRounds(a,b,c,dis);
    }

    public static void numberOfRounds(int a,int b,int c,int distance) {
        int peri = a+b+c;

        int NoOfRounds = distance/peri;
        System.out.println("Number of rounds is "+NoOfRounds);
    }

}