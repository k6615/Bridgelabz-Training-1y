import java.util.Arrays;
class Array_1
{
	public static void main(String args[])
	{
		int arr[] = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		System.out.println("size of Array :"+arr.length);
		System.out.println("printing array with to string :");
		System.out.println(Arrays.toString (arr));
		System.out.println("printing array using for loop ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("printing array using for each loop ");
		for(int i:arr)
		{
			System.out.println(i);
			
		}
		
		System.out.println(" Reverse of an array ");
		for(int i= arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Linear search ");
		int target = 30;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				System.out.println(i);
			}
			else 
			{
				System.out.println("Not found");
			}
			
		}
		
		System.out.println("max no in an Array ");
		int max = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		