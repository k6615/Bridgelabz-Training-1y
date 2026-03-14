import java.util.Scanner;

public class UniqueChar {

    static int len(String s){
        int c=0;
        for(char ch : s.toCharArray())
            c++;
        return c;
    }

    static char[] unique(String s){
        int n=len(s);
        char[] temp=new char[n];
        int k=0;

        for(int i=0;i<n;i++){
            boolean u=true;

            for(int j=0;j<i;j++){
                if(s.charAt(i)==s.charAt(j)){
                    u=false;
                    break;
                }
            }

            if(u){
			temp[k++]=s.charAt(i);
			}
        }

        char[] res=new char[k];
        for(int i=0;i<k;i++){
            res[i]=temp[i];
		}
        return res;
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        String text=input.nextLine();

        char[] r=unique(text);

        for(int i=0;i<r.length;i++){
		System.out.print(r[i]+" ");
		}
    }
}