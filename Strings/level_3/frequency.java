import java.util.Scanner;
public class frequency{
    static char[] uniqueChars(String s){
        char[] temp=new char[s.length()];
        int k=0;

        for(int i=0;i<s.length();i++){
            boolean unique=true;

            for(int j=0;j<i;j++){
                if(s.charAt(i)==s.charAt(j)){
                    unique=false;
                    break;
                }
            }

            if(unique){
			temp[k++]=s.charAt(i);
			}
        }

        char[] res=new char[k];
        for(int i=0;i<k;i++){
            res[i]=temp[i];
		}
        return res;
    }

    static String[][] frequency(String s){
        int[] freq=new int[256];

        for(int i=0;i<s.length();i++)
            freq[s.charAt(i)]++;

        char[] u=uniqueChars(s);

        String[][] arr=new String[u.length][2];

        for(int i=0;i<u.length;i++){
            arr[i][0]=String.valueOf(u[i]);
            arr[i][1]=String.valueOf(freq[u[i]]);
        }

        return arr;
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        String text=input.nextLine();

        String[][] result=frequency(text);

        for(int i=0;i<result.length;i++){
		System.out.println(result[i][0]+" "+result[i][1]);
		}
    }
}