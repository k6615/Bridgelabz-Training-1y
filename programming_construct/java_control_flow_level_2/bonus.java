import java.util.Scanner;
class Bonus
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your salary ");
		double n = input.nextDouble();
		System.out.println("Enter your years of service ");
		int y = input.nextInt();
		if(y>=5)
		{
			double bonus = n + 5*n/100;
			System.out.print("Your bonus salary is "+bonus);
		}
		else
		{
			System.out.println("your salary is "+n);
		}
	}
}

			
		