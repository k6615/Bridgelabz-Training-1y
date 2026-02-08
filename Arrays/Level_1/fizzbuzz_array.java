import java.util.Scanner;
class FizzBuzz
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = input.nextInt();
		if(n<0)
		{
			System.out.println("Invalid");
			return;
		}
		String arr[]=new String[n];
		for(int i=1;i<n;i++)
		{
			if(i%3==0 && i%5==0)
			{
				arr[i] = "FizzBuzz";
			}
			else if(i%3==0)
			{
				arr[i] = "Fizz";
			}
			else if(i%5==0)
			{
				arr[i] = "Buzz";
			}
			else
			{
				arr[i] = String value;
			}
		}
		System.out.println(arr[i]);
		
	}
}

	
			
				
		
		 