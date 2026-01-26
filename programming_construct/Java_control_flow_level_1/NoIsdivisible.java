import java.util.Scanner;
class Divisible
{
  public static void main(String args[])
  {
    Scanner input = new Scanner(System.in);
	System.out.println("Enter your number");
	int a = input.nextInt();
	if(a%5==0)
	{
		System.out.println("number is divisible by 5 ");
	}
	else
	{
		System.out.println("number is not divisible by 5");
	}
	
	
  }
}