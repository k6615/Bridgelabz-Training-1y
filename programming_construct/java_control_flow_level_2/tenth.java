import java.util.Scanner;

public class tenth {
    public static void main(String args[]){
         System.out.println("enter your number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = n-1;
        int greatest = 0;
        while(i>=1){
            if(n%i==0){
                greatest = i;
                break;
            }
            i--;
        }
        System.out.println(greatest);
    }
}
