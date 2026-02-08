import java.util.Scanner;
class Age
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		int arr[] = new int[4];
		System.out.println("Enter the age of 4 student");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Age of student "+(i+1));
			arr[i] = input.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				System.out.println("Invalid number ");
			}
			else if(arr[i]>=18)
			{
				System.out.println("Student with the age "+arr[i]+" can vote");
			}
			else 
			{
				System.out.println("student can not vote");
			}
		}
	}
}