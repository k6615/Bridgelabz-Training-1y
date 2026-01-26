import java.util.Scanner;
class Table 
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = input.nextInt();
		for(int i =6;i<10;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}
}
