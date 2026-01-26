import java.util.Scanner;
class OddEven
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = input.nextInt();
		for(int i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				System.out.println("even number ");
				
			}
			else
			{
				System.out.println(i);
				System.out.println("odd number ");
				
			}
		}
	}
}
