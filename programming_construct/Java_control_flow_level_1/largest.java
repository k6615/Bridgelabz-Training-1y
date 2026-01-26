import java.util.Scanner;
class Largest
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first no.");
		int a = input.nextInt();
		System.out.println("Enter the Second no.");
		int b = input.nextInt();
		System.out.println("Enter the third no.");
		int c = input.nextInt();
		if(a>b && a>c)
		{
			System.out.println("first number is largest ");
		}
		else if (b>a && b>c)
		{
			System.out.println("second number is largest ");
		}
		else 
		{
			System.out.println("third number is largest ");
		}
	}
}

			
		
			