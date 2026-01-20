import java.util.Scanner;
class Harry
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the birthyear:");
		int birthYear = input.nextInt();
		System.out.println("Enter the currentYear:");
		int currentYear = input.nextInt();
		int year = currentYear - birthYear;
		System.out.println("your age is :"+year);
	}
}