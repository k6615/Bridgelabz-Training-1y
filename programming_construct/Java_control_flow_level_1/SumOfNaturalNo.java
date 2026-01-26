import java.util.Scanner;
class sum
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no ");
		int n = input.nextInt();
	    int sum = n*(n+1)/2;
		System.out.println("sum of "+n+" natural no is "+sum);
	}
}
