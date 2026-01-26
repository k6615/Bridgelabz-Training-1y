import java.util.Scanner;
class Counter
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no ");
		int num = input.nextInt();
		while(num>0)
		{
			System.out.println(num);
			num--;
		}
	}
}
