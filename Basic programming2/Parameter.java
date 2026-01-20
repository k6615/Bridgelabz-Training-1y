import java.util.Scanner;
class Prameter
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the parameter :");
		double p = input.nextDouble();
		double side = p/4;
		
		System.out.println("Length of the side is "+side);
		
		
	}
}