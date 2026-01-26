import java.util.Scanner;

public class seventh {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your weight");
        double weight = sc.nextInt();
        System.out.println("enter your height");
        double heaight = sc.nextInt(); //this is in cm

        double hinm = heaight/100;
        double bmi = weight/(hinm*hinm);

        System.out.println("your BMI is :"+bmi);

        if(bmi <= 18.4){
            System.out.println("underweight");
        }
        else if(bmi >= 18.5 && bmi<= 24.9){
            System.out.println("normal");
        }
        else if(bmi >= 25.0 && bmi <= 39.9){
            System.out.println("overweight");
        }
        else{
             System.out.println("obese");
        }
}
}
