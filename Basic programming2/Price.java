import java.util.Scanner;
class item
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the price of item :");
		float p = input.nextFloat();
		System.out.println("Enter the quantity of item :");
		int q = input.nextInt();
		float Total = p*q;
		
		
		System.out.println("Total price of item: "+Total);
		System.out.println("quantity of item :"+q);
		System.out.println("uint price of item :"+p);
		
		
	}
}