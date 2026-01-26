import java.util.Scanner;

public class eight {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your number");
        int n = sc.nextInt();

        if(n>=0){
            int i=1;
            while(i<=n){
                if(n%i == 0){
                    System.out.println(i);
                }
                i++;
            }

    }
    else{
         System.out.println("plese enter positive integer");
    }
}
}
