import java.util.Scanner;
public class frequency1{
    static String[] frequency(String s){
        char[] ch = s.toCharArray();
        int[] freq = new int[ch.length];

        for(int i=0;i<ch.length;i++){
            freq[i]=1;

            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    freq[i]++;
                    ch[j]='0';
                }
            }
        }

        String[] result = new String[ch.length];
        int k=0;

        for(int i=0;i<ch.length;i++){
            if(ch[i]!='0'){
                result[k++] = ch[i] + " " + freq[i];
            }
        }

        return result;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        String[] res = frequency(text);

        for(int i=0;i<res.length;i++){
            if(res[i]!=null)
                System.out.println(res[i]);
        }
    }
}