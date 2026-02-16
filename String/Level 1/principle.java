import java.util.Scanner;
class Principle{
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		double P = sc.nextDouble();
		double R = sc.nextDouble();
		double T = sc.nextDouble();
		
		double SI = SI(P,R,T);
		System.out.println(SI);
	}
	
	public static double SI(double principle,double rate,double time){
		return principle*rate*time/100;
	}
}

		
	

