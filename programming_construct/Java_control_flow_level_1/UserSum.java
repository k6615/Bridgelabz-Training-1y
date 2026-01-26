import java.util.Scanner;
class Sum
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value for add to sum ");
		int a = input.nextInt();
		int sum =0;
		while(a!=0)
		{
			sum = sum + a;
			System.out.println("Enter the value for add to sum ");
		    a = input.nextInt();
		}
		System.out.println("sum is "+sum);
	}
}

			