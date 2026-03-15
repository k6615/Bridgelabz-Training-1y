import java.util.Scanner;

class MaxNoOfHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of student: ");
        int n = input.nextInt();
        numberOfHandshakes(n);
    }
    public static void numberOfHandshakes(int n) {
        int result = (n*(n-1))/2;
        System.out.println("number of possible handshakes "+result);
    }


}