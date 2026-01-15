import java.util.Scanner;
class VolOfEarth
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius in Km:");
		double R = input.nextDouble();
		double Vol = 4*3.14*R*R*R/3;
		double r = R*1.6;
		double Vol2 = 4*3.14*r*r*r/3;
		System.out.println("The volume of earth in cubic kilometers is "+Vol+"and in cubic miles is  " +Vol2);
		
	}
}