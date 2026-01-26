import java.util.Scanner;

public class fifth {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        int original2 = n;
        int n2 = n;
        int count = 0;
        int sum =0;

        while(n != 0){
            int digit = n%10;
            n = n/10;
            count++;
        }
        while(n2 != 0){
            int digit = n2%10;
            Math.pow(digit,count);
            sum = sum + (int)Math.pow(digit,count);
            n2 = n2/10;
        }
        if(sum == original2){
            System.out.println("your number is amstrong number");
        }
        else{
            System.out.println("your number is not amstrong number");
        }
       
}
}
