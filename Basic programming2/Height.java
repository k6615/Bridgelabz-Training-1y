import java.util.Scanner;
class Height
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the height in cm:");
		double h = input.nextDouble();
		double Inch = 2.54*h;
		double foot = 12*Inch;
		System.out.println("your height is "+foot);
		
		
	}
}