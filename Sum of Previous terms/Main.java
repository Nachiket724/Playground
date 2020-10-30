import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		
		int num=scanner.nextInt();
		
		int res=0;
		
		if(num>30)
		{
			System.out.println("Invalid Input");
		}
		else
		{
			res=fib(num+1);
			System.out.println(res);
		}
		scanner.close();
	}
	
	static int fib(int n) 
	{ 
		int a = 0, b = 1, c; 
		if (n == 0) 
			return a; 
		for (int i = 2; i <= n; i++) 
		{ 
			c = a + b; 
			a = b; 
			b = c; 
		} 
		return b; 
	} 

}
