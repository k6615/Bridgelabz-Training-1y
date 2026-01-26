import java.util.Scanner;

public class ninth {
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;
        for(int i=1;i<n;i++){
            if(n%i == 0){
                sum = sum + i;
            }
        }
        if(sum > original){
            System.out.println("your number is abundant number");
        }
        else{
            System.out.println("your number is not abundant number");
        }

 

}
}
