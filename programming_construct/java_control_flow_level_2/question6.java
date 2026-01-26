import java.util.Scanner;
class Age 
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter amar age ");
		int age1 = input.nextInt();
		System.out.println("Enter amar height ");
		int h1 = input.nextInt();
		System.out.println("Enter akbar age ");
		int age2 = input.nextInt();
		System.out.println("Enter akbar height ");
		int h2 = input.nextInt();
		System.out.println("Enter anthony age ");
		int age3 = input.nextInt();
		System.out.println("Enter anthony height ");
		int h3 = input.nextInt();
		
		if(age1<age2)
		{
			if(age2<age3)
			{
				System.out.println("amar is younger ");
			}
			else(age3<age1)
			{
				System.out.println("anthony is younger ");
			}
		}
		else
		{
			System.out.println("akbar is younger ");
		}
		
		if(h1>h2)
		{
			if(h2>h3)
			{
				System.out.println("amar is taller ");
			}
			else(h3>h1)
			{
				System.out.println("anthony is taller ");
			}
		}
		else
		{
			System.out.println("akbar is taller ");
		}
	}
}

		
		