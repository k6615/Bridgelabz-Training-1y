import java.util.Scanner;
class Smallest
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first no.");
		int a = input.nextInt();
		System.out.println("Enter the Second no.");
		int b = input.nextInt();
		System.out.println("Enter the third no.");
		int c = input.nextInt();
		if(a<b && a<c)
		{
			System.out.println("yes a is smallest ");
		}
		
	}
}
		