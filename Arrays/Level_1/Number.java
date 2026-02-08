import java.util.Scanner;
class Number 
{
	public static void main(String agrs[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter the number ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				System.out.println("zero");
			}
			else if(arr[i]<0)
			{
				System.out.println("Negative");
			}
			else if(arr[i]>0)
			{
				if(arr[i]%2==0)
				{
					System.out.println("Even ");
				}
				else
				{
					System.out.println("odd");
				}
			}
		}
		if(arr[0]==arr[4])
		{
			System.out.println("Equal");
		}
		else if(arr[0]>arr[4])
		{
			System.out.println("Greater");
		}
		else{
			System.out.println(arr[0]+"-"+arr[4]+"Less");
		}
		
	}
}
