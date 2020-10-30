import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		int testCases=scanner.nextInt();
		
		while(testCases-->0)
		{
			int result=nearestPrime(scanner.nextInt());
			
			System.out.println(result);
		}

		scanner.close();
	}

	public static int nearestPrime(int n) {
		
		if(isPrime(n))
		{
			return n;
		}
		else
		{
			int beforePrime=0;
			int afterPrime=0;
			
			int countBefore=0;
			int countAfter=0;
			
			for(int i=n-1;i>0;i--)
			{
				countBefore++;
				
				if(isPrime(i))
				{
					beforePrime=i;
					break;
				}
			}
			
			for(int i=n+1;i<(Math.pow(10, 6));i++)
			{
				
				countAfter++;
				
				if(isPrime(i))
				{
					afterPrime=i;
					break;
				}
			}
			
			if(countAfter<countBefore)
			{
				return afterPrime;
			}
			else if(countAfter>countBefore)
			{
				return beforePrime;
			}
			else {
				return (afterPrime<beforePrime) ? afterPrime:beforePrime;
			}
		}
	}
	
	public static boolean isPrime(int n) {
		
		if(n<=1)
		{
			return false;
		}
		
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		
		return true;
	}
}
