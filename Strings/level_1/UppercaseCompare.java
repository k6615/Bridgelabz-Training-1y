import java.util.Scanner;
    class UppercaseCompare {
    public static String convertToUpper(String text) {
        String result = "";

        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);

            if (ch>='a'&&ch<='z') {
                ch=(char)(ch-32);   
            }
            result=result+ch;
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {

        if(s1.length()!=s2.length()) {
            return false;
        }

        for (int i =0; i<s1.length();i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the text:");
        String text = input.nextLine();
        String myUpper = convertToUpper(text);
        String builtInUpper = text.toUpperCase();
        boolean result = compareStrings(myUpper, builtInUpper);
        System.out.println("Uppercase using ASCII method: " + myUpper);
        System.out.println("Uppercase using toUpperCase(): " + builtInUpper);
        System.out.println("Are both results same? " + result);
        input.close();
    }
}