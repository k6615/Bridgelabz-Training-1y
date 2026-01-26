import java.util.Scanner;
class Counter 
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = input.nextInt();
		for(int i= num;i>=1;i--)
		{
			System.out.println(i);
		}
	}
}

