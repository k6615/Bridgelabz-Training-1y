import java.util.Scanner;
class CheckNo
{
	public static void main(String args[])
	{
	   Scanner input = new Scanner(System.in);
	   System.out.println("Enter the number ");
	   int n = input.nextInt();
	   if(n>0)
	   {
		   System.out.println("positive number ");
	   }
	   else if(n<0)
	   {
		   System.out.println("negative number ");
	   }
	   else{
		   System.out.println("zero");
	   }
	}
}

		