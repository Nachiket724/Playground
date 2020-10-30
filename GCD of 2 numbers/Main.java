import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int n1=scanner.nextInt();
		int n2=scanner.nextInt();
		
		int res=gcd(n1,n2);
		System.out.println(res);
		
		scanner.close();

	}
	
	private static int gcd(int n1,int n2)
	{
		int g=0;
		
		for(int i=1;i<=n1 && i<=n2;i++)
		{
			if(n1 % i==0 && n2%i==0)
			{
				g=i;
			}
		}
		
		
		return g;
	}

}
