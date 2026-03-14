import java.util.Scanner;
class VowelConsonant {
    static String check(char ch){
        if(ch>='A'&&ch<='Z')
            ch=(char)(ch+32);

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            return "Vowel";
        else if(ch>='a' && ch<='z')
            return "Consonant";
        else
            return "Not Letter";
    }
    static int[] countVC(String s){
        int v=0,c=0;

        for(int i=0;i<s.length();i++){
            String r=check(s.charAt(i));

            if(r.equals("Vowel"))
                v++;
            else if(r.equals("Consonant"))
                c++;
        }
        return new int[]{v,c};
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String text=input.nextLine();
        int[] res=countVC(text);
        System.out.println("Vowels: "+res[0]);
        System.out.println("Consonants: "+res[1]);
    }
}