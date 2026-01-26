import java.util.Scanner;

public class eleventh {
     public static void main(String args[]){

        System.out.println("enter your number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>0 && n<100){
            for(int i=n;i>=1;i--){
                if(n%i == 0){
                    System.out.println(i);
                }

            }
        }
        else{
            System.out.println("plese enter the positive and less than 100 number");
        }
}
}
