import java.util.Scanner;

public class thirteen {
    public static void main(String args[]){

        System.out.println("enter your number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>0 && n<100){
            int counter = n - 1;
            int i=0;
            while(counter > 1){
                if(n%counter == 0){
                    System.out.println(counter);
                }
                counter--;
            }
        }
        
    }
}