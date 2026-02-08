import java.util.Scanner;
class multiplesvalue {

    public static void main(String agrs[]) {
        Scanner input = new Scanner(System.in);
		System.out.println("Enter the number ");
        double arr[] = new double[10];
        double total = 0;
        int i = 0;
        while (true) {
            double n = input.nextDouble();
            if (n <= 0) {
                break;
            }
            if (i == 10) {
                break;
            }
            arr[i] = n;
            i++;
        }
        for (int j = 0; j < i; j++) {
            System.out.println(arr[i]);
            total += arr[j];
        }
        System.out.println("Total : "+total);
    }
}				
		
		