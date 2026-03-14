import java.util.Scanner;
	public class BMI{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double[][] data = new double[10][2];

        for(int i=0;i<10;i++){
            System.out.print("Enter Weight(kg): ");
            data[i][0] = input.nextDouble();

            System.out.print("Enter Height(cm): ");
            data[i][1] = input.nextDouble();
        }

        System.out.println("Height Weight BMI Status");

        for(int i=0;i<10;i++){
            double weight = data[i][0];
            double height = data[i][1] / 100.0;

            double bmi = weight / (height * height);

            String status;

            if(bmi <= 18.4){
				status = "Underweight";
			}
            else if(bmi <= 24.9){ 
				status = "Normal";
			}
            else if(bmi <= 39.9){ 
			status = "Overweight";
			}
            else{
				status = "Obese";
			}
            System.out.println(data[i][1] + " " + data[i][0] + " " + bmi + " " + status);
        }
    }
}