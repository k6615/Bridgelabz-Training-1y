import java.util.Scanner;

class SmallestAndLargest {
    public static void main(String[] args) {
        System.out.println("Enter the 3 number");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        System.out.print("Enter the third number: ");
        int c = input.nextInt();
        SmallestLargest(a,b,c);
    }
    public static void SmallestLargest(int a,int b,int c) {
        int smallest = a;
        int largest = a;

        if (b < smallest) {
            smallest = b;
        }
        if (c < smallest) {
            smallest = c;
        }

        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}
