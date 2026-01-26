import java.util.Scanner;

public class twelth {
       public static void main(String args[]){

        System.out.println("enter your number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int power = sc.nextInt();

        int result = 1;
        if(n>0){
            for(int i=0;i<=power;i++){
                result *= n;
                System.out.println(result);

            }
        }
}
}
