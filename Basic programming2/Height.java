import java.util.Scanner;
class Height
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the height in cm:");
		double h = input.nextDouble();
		double Inch = h/2.54;
		double foot = Inch/12;
		System.out.println("your height in feet "+foot);
		System.out.println("your height in inches "+Inch);
		System.out.println("your height in cm "+h);
		
		
	}
}