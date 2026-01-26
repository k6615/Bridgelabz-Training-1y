import java.util.Scanner;
class Voting 
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the your age ");
		int age = input.nextInt();
		if(age>=18)
		{
			System.out.println("person can vote ");
		}
		else
		{
			System.out.println("person can not vote ");
		}
	}
}
