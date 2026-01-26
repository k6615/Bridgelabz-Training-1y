import java.util.Scanner;
Class Grade
{
	public staic void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your marks ");
		int marks = input.nextInt();
		if(marks<50)
		{
			System.out.println("fail");
		}
		esle if (marks>=50 && marks<60)
		{
			System.out.println("D garde");
		}
		esle if (marks>=60 && marks<70)
		{
			System.out.println("c garde");
		}
		esle if (marks>=70 && marks<80)
		{
			System.out.println("B garde");
		}
		esle if (marks>=80 && marks<90)
		{
			System.out.println("A garde");
		}
		esle if (marks>=90 && marks<100)
		{
			System.out.println("o garde");
		}
		esle 
		{
			System.out.println("Invalid marks");
		}
	}
}