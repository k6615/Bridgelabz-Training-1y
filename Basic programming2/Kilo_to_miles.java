import java.util.Scanner;
class Kilo_to_miles
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Km:");
		double Km = input.nextDouble();
		double miles = Km*1.6;
		System.out.println("The distance "+Km+"km in miles is " +miles);
	}
}