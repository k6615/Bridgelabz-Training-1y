import java.util.Scanner;
class fizzBuzz 
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive number ");
		int n = input.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println("FizzBuzz");
			}
			else if(i%5==0)
			{
				System.out.println("Buzz");
			}
			else if(i%3==0)
			{
				System.out.println("Fizz");
			}
			else 
			{
				System.out.println("positive integer "+i);
			}
		}
	}
}

				
				
