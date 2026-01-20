import java.util.Scanner;
class Handshake
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of student :");
		int n = input.nextInt();
		int combination = (n*(n-1))/2;
		
		System.out.println("number of Handshake "+combination);
		
		
	}
}
