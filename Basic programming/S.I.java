import java.util.Scanner;
class Interest
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the principal:");
		double p = intput.nextDouble();
		System.out.println("Enter the rate:");
		double R = input.nextDouble();
		System.out.println("Enter the time:");
		double T = input.nextDouble();
		double SimpleInterest = (P*R*T)/100;
		System.out.println("Simple Interest:"+SimpleInterest);