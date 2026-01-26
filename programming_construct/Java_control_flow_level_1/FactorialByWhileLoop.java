import java.util.Scanner;
class Factorial
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number ");
		int n = input.nextInt();
		int fact = 1;
		int i=1;
		while(i<=n)
		{
			fact = fact*i;
			i++;
		}
		System.out.println("Total Factorial is :"+fact);
	}
}
