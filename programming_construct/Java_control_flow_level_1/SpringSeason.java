import java.util.Scanner;
class SpringSeason
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter  month ");
		int month = input.nextInt();
		System.out.println("Enter day ");
		int day = input.nextInt();
		if(month==3 && day>=20 || month==4 || month==5 || month==6 && day<=20)
		{
			System.out.println("Its a Spring season ");
		}
		else
		{
			System.out.println("Not a Spring Season ");
		}
	}
}
