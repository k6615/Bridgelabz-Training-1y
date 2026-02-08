import java.util.Scanner;
class Mean
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		double[] heights = new double[11];
		int sum = 0;
		for(int i=0;i<11;i++)
		{
			heights[i]=input.nextDouble();
			sum+=heights[i];
		}
		int mean = sum/11;
		System.out.println("Mean height of football team is :"+mean);
		
	}
}

		