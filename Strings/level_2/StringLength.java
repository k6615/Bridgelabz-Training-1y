import java.util.Scanner;
    class StringLength {
    static int findLength(String s) {
        int count=0;

        for(char c : s.toCharArray()) { 
            count++;
        }
        return count;
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.next();

        int len1 = findLength(str);   
        int len2 = str.length();      

        System.out.println("Length without length(): " + len1);
        System.out.println("Length using length(): " + len2);
    }
}