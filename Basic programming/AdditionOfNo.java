import java.util.Scanner;
class Addition 
{
  public static void main(String agrs[] )
  {
	Scanner input = new Scanner(System.in);
    System.out.println("enter the first num :");
	int a = input.nextInt();
	System.out.println("Enter the second num :");
	int b = input.nextInt();
	int sum = a+b;
	System.out.println("Addition of no :"+sum);
  }
}