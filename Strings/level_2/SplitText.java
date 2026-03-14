import java.util.Scanner;
class SplitText {

    static String[] mySplit(String s) {
        int count = 1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')
                count++;
        }

        String[] words = new String[count];
        int start=0,k=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                words[k++] = s.substring(start,i);
                start = i+1;
            }
        }

        words[k] = s.substring(start);
        return words;
    }

    static boolean compare(String[] a,String[] b){
        if(a.length!=b.length) return false;

        for(int i=0;i<a.length;i++){
            if(!a[i].equals(b[i]))
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        String text=input.nextLine();

        String[] a=mySplit(text);
        String[] b=text.split(" ");

        System.out.println(compare(a,b));
    }
}