import java.util.Scanner;
class Sum
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number ");
		int a = input.nextInt();
		int sum = 0;
		while(a>0)
		{
			sum = sum + a;
			System.out.println("Enter the number ");
			a = input.nextInt();
			if(a<=0)
			{
				System.out.println("total sum is :"+ sum);
				break;
			}
		}
	}
}
