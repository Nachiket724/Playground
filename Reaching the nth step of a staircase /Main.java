import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int result=staircase(scanner.nextInt()+1);
		
		System.out.println(result);
		
		scanner.close();

	}
	
	private static int staircase(int n)
	{
		int[] arr=new int[n+2];
		
		arr[0]=0;
		arr[1]=1;
		
		for(int i=2;i<=n;i++)
		{
			arr[i]=arr[i-1]+arr[i-2];
		}
		
		return arr[n];
	}

}
