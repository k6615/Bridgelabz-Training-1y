import java.util.Scanner;
class Yard
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the distance in feet :");
		double feet = input.nextDouble();
		double yard = 3*feet;
		double miles = 1760*yard;
		double inches = 12*feet;
		double cm = 2.54*inches;

		System.out.println("distance in feet :"+feet);
		System.out.println("distance in inches :"+inches);
		System.out.println("distance in cm :"+cm);
		
	}
}
		