import java.util.Scanner;
class Factors
{
	public static void main(String agrs[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row");
		int r = sc.nextInt();
		System.out.println("Enter the number of col");
		int c = sc.nextInt();
		int[][]arr = new int[r][c];
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		int index =0 ;
		int[] array = new int[r*c];
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				array[index]=arr[i][j];
				index++;
			}
		}
		System.out.println();
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
}

		
		
				