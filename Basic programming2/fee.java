import java.util.Scanner;
class Fee
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your fee ");
		int fee = input.nextInt();
		System.out.println("Enter your discount percentage ");
		int disCPer = input.nextInt();
		int discount = disCPer*fee/100;
		int discountedFee = fee-discount;
		System.out.println("discount "+discount);
		System.out.print("discountedFee "+discountedFee);
	}
}
		