import java.util.Scanner;
class Calculator
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first no :");
		int a = input.nextInt();
		System.out.println("Enter the second no :");
		int b = input.nextInt();
		int sum = a+b;
        int mul = a*b;
	    int sub = a-b;
	    int div = a/b;
        System.out.println("Addition of two Number :"+sum);
	    System.out.println("subtract of two Number :"+sub);
	    system.out.println("multiply of two Number :"+mul);
	    System.out.println("divition of two Number :"+div);
  }
}

		
		
	