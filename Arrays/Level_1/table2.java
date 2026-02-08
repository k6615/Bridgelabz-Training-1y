import java.util.Scanner;
class Table2 
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = input.nextInt();
		int arr[] = new int[4];
		for(int i=6;i<=9;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
		}
		for(int i=6;i<=9;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}
