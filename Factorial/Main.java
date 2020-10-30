import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int num=scanner.nextInt();
		
		System.out.println(factorial(num));
		
		scanner.close();
	}
	
	private static long factorial(int num)
	{
		long fact=1;
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		
		return fact;
	}

}
