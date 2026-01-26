import java.util.Scanner;
class Sum
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = input.nextInt();
		int sum =0;
		for(int i=0;i<=n;i++)
		{
			sum +=i;
		}
			System.out.println("Total sum is :"+sum);
		
	}
}
