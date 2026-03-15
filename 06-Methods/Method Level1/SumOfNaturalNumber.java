import java.util.Scanner;

class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        int sum = sum(n);
        System.out.println("sum of "+n+" natural number is "+sum);
    }
    public static int sum(int n){
        int sum = 0;
        for(int i=0;i<=n;i++) {
            sum +=i;
        }
        return sum;


    }
}