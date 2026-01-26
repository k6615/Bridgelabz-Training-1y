import java.util.Scanner;
public class third {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your math marks");
        double math = sc.nextInt();
        System.out.println("enter your physics marks");
        double physics = sc.nextInt();
        System.out.println("enter your chemistry marks");
        double chem = sc.nextInt();

        double sum = math + physics +chem;
        double persentage = sum/3;
        System.out.println("your persentage is: "+persentage);

        if(persentage <= 39){
            System.out.println("you are below the stadards");
        }
        else if(40 <= persentage && persentage <= 49){
            System.out.println("level 1, grade E");
        }
        else if(50 <= persentage && persentage <= 59){
            System.out.println("level1, grade D");
        }
        else if(60 <= persentage && persentage <=69){
            System.out.println("level2,grade C");
        }
        else if(70 <= persentage && persentage <= 79){
            System.out.println("level3, grade B");
        }
        else if(80 >= persentage ){
            System.out.println("level4,grade A");
        }
        else{
            System.out.println("invalid marks");
        }

    }
}
