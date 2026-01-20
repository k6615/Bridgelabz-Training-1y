import java.util.Scanner;
class Average
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your math's marks:");
		int m1= input.nextInt();
		System.out.print("Enter your physics's marks:");
		int m2 = input.nextInt();
		System.out.print("Enter your chemistry's marks:");
		int m3 = input.nextInt();
		double avg = (m1+m2+m3)/3;
		System.out.print("Average of No:"+avg);
	}
}

		
		
		
		