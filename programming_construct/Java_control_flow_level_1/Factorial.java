import java.util.Scanner;
class Factorial
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = input.nextInt();
		int fac = 1;
		for(int i=1;i<=n;i++)
		{
			fac = fac*i;
			
		}
		System.out.println("factorial of "+n+" is :"+fac);
	}
}

			