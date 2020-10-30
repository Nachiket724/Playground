import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int num=scanner.nextInt();
		
		int res=0;
		
		if(num%2==0)
		{
			res=cal(num/2,3);
		}
		else
		{
			res=cal((num+1)/2,2);
		}

		System.out.println(res);
		
		scanner.close();
	}

	private static int cal(int n,int mul)
	{
		int count=1;
		
		int sum=1;
		
		while(count<n)
		{
			sum=sum*mul;
			count++;
		}
		
		return sum;
	}
}
