import java.util.Scanner;
class Fahrenheit
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the temp. in celsius:");
		double c = input.nextDouble();
		double f = (c*9/5)+32;
		System.out.println("Fahrenheit code"+f);
	}
}
