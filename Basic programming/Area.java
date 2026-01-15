import java.util.Scanner;
class Area
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of r :");
		int r = input.nextInt();
		double area = 3.14*r*r;
		System.out.println("Area of circle :"+area);
	}
}