import java.util.Scanner;
public class ninth {
    public static void main(String args[]){

        System.out.println("enter your number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int greatest = 0;
        for(int i=n-1;i>=1;i--){
            if(n%i ==0){
              greatest = i;
                break; 
    }
        }
        System.out.println(greatest);
    }
}
