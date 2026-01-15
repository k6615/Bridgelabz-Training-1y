import java.util.Scanner;
class Volume 
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius:");
		int r = input.nextInt();
		System.out.print("Enter the height:");
		int h = input.nextInt();
		double vol = 3.14*r*r*h;
		System.out.println("volume of cylinder:"+ vol);
	}
}