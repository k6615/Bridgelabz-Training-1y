import java.util.Scanner;
class Factors
{
	public static void main(String agrs[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
        int n = sc.nextInt();
		int maxFactor = 10;
		
		int[] arr = new int[maxFactor];
		int index =0;
		
		for(int i=1;i<=n;i++){
			if(n%i==0){
				arr[index]=i;
				index++;
				if(index == maxFactor){
					maxFactor*=2;
					int[]temp = new int[maxFactor];  
					for(int k=0;k<arr.length;k++){
						
					    temp[k] = arr[k];
					}
					arr = temp;
				}
				
			}
			
		}
		int j=index;
		
		System.out.println("Factors Array");
		for(index=0;index<j;index++)
		{
			System.out.print(arr[index]+" ");
		}
		
		
	}
}

			