import java.util.Scanner;
class Profit_loss
{
	public static void main(String agrs[])
	{ 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter cost price:");
		int cp = input.nextInt();
		System.out.print("Enter selling price:");
		int sp = input.nextInt();
		int profit = (sp-cp);
		System.out.println("profit:"+profit);
		int profitPercentage = profit/cp*100;
		System.out.println("profitPercentage:"+profitPercentage);
	}
}