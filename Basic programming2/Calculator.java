import java.util.Scanner;
class Calculator
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first value :");
		float a = input.nextFloat();
		System.out.println("Enter the second value :");
		float b = input.nextFloat();
		double sum = a+b;
		double sub = a-b;
		double mul = a*b;
		double div = a/b;
		System.out.println("sum of digit :"+sum);
		System.out.println("sub of digit :"+sub);
		System.out.println("mul of digit :"+mul);
		System.out.println("div of digit :"+div);
	}
}
		