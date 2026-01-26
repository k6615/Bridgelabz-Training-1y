import java.util.Scanner;

public class sixth {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        int count = 0;
        while(n != 0){
            int digit = n%10;
            n = n/10;
            count++;
        }
        System.out.println("your number has "+count+" numeber");
}
}
