import java.util.Scanner;
class AreaofTriangle
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the height value :");
		float h = input.nextFloat();
		System.out.println("Enter the base value :");
		float b = input.nextFloat();
		float Area = b*h/2;
		
		System.out.println("Area of triangle :"+Area);
	}
}
		