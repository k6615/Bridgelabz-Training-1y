import java.util.Scanner;

class NegativePositiveAndZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        int result = check(n);
        System.out.println(result);

    }

   public static int check(int num) {
        if(num>0){
            return 1;
        }
        else if(num<0){
            return -1;
        }
        return 0;

   }
}
