import java.util.Scanner;
class OddEvenArray
{
	public static void main(String agrs[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
        int n = sc.nextInt();
        if(n<1)
		{
			System.out.println("Error");
			return;
		}
		int size = n/2 + 1;
		int[] arr1 = new int[size];
		int[] arr2 = new int[size];
		
		int oddindex = 0;
		int evenindex = 0;
		
		for(int i=1;i<=n;i++)
		{
			if(i%2==0){
				arr1[evenindex] = i;
				evenindex++;
			}
			else{
				arr2[oddindex] = i;
				oddindex++;
			}
		}
		int E=evenindex;
		int O = oddindex;
		
		System.out.println("Even Array");
		for(evenindex=0;evenindex<E;evenindex++)
		{
			System.out.print(arr1[evenindex]+" ");
		}
		
		System.out.println("\n Odd Array");
		for(oddindex=0;oddindex<O;oddindex++)
		{
	    	System.out.print(arr2[oddindex]+" ");
		}
		
	}
}

			
	   		   
		