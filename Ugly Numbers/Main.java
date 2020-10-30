import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int test=scanner.nextInt();
		
		while(test-->0)
		{
			int result=checker(scanner.nextInt());
			
			System.out.println(result);
		}
		
		scanner.close();
	}
	
	public static boolean ugly(int n) {
		
		if(n==1)
		{
			return true;
		}
		else
		{
			if(n%2==0)
			{
				return ugly(n/2);
			}
			else if(n%3==0)
			{
				return ugly(n/3);
			}
			else if (n%5==0) {
				return ugly(n/5);
			}
			return false;
		}
		
	}

	public static int checker(int n) 
	{
		
		int count=1;
		
		int i=1;
		
		while(n>count)
		{
			i++;
			if(ugly(i))
			{
				count++;
			}
		}
		
		return i;
		
	}
}
