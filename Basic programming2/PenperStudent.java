import java.util.Scanner;
class Penperstudent
{
	public static void main(String agrs[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter No of pen:");
		int pen = input.nextInt();
		System.out.print("Enter no of student:");
		int student = input.nextInt();
		int PenPerStudent = pen/student;
        System.out.print("PemPerStudent:"+PenPerStudent);
        int remainPen = pen%student ;
        System.out.print("remainigPen "+remainPen);
	}
}	
		