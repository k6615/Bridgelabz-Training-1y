import java.util.Scanner;
public class WordLength{
    static String[] splitWords(String s){
        int count=1;
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)==' ')
                count++;

        String[] w=new String[count];
        int start=0,k=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                w[k++]=s.substring(start,i);
                start=i+1;
            }
        }
        w[k]=s.substring(start);
        return w;
    }

    static int len(String s){
        int c=0;
        for(char ch:s.toCharArray())
            c++;
        return c;
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        String text=input.nextLine();

        String[] words=splitWords(text);
        String[][] arr=new String[words.length][2];

        for(int i=0;i<words.length;i++){
            arr[i][0]=words[i];
            arr[i][1]=String.valueOf(len(words[i]));
        }

        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i][0]+" "+arr[i][1]);
    }
}