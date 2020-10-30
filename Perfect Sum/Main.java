import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int testCases=scanner.nextInt();
		
		while(testCases-->0)
		{
			int n=scanner.nextInt();
			scanner.nextLine();
			
			int[] arr=new int[n];
			
			String[] strings=scanner.nextLine().split(" ");
			
			for(int i=0;i<n;i++)
			{
				arr[i]=Integer.parseInt(strings[i]);
			}
			
			int sum=scanner.nextInt();
			
			
			System.out.println(subSets(arr,n,0,sum,0));
		}
		
		scanner.close();
	}

	private static int subSets(int[] arr,int n, int i, int sum, int count)
	{
		if(i==n)
		{
			if(sum==0)
			{
				count++;
			}
			return count;
		}
		
		count=subSets(arr, n, i+1, sum-arr[i], count);
		count=subSets(arr, n, i+1, sum, count);
		
		return count;
	}
	
}
