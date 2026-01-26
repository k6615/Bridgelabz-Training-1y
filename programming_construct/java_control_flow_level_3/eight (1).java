import java.util.Scanner;
public class eight {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;
        while(n != 0){
            int digit = n%10;
            sum = sum + digit;
            n = n/10;
        }
        if(original%sum == 0){
            System.out.println("the number is harshad number");
        }
        else{
            System.out.println("the number not harshad number");
        }
    }
}
