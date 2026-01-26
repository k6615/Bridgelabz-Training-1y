import java.util.Scanner;
public class secoond{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your year");
        int year = sc.nextInt();
        
        if((year%480 ==0) || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("this year is a leap year");
        }
        else{
            System.out.println("this year is not leap year");
        }
        
    }
}