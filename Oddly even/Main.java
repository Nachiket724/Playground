import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		String[] numStrings=scanner.nextLine().split("");
		
		int num[]=new int[numStrings.length];
		
		for(int i=0;i<numStrings.length;i++)
		{
			num[i]=Integer.parseInt(numStrings[i]);
		}
		
		int sumOdd=0, sumEven=0;
		
		for(int i=0;i<num.length;i=i+2)
		{
			sumOdd+=num[i];
		}
		for(int i=1;i<num.length;i=i+2)
		{
			sumEven+=num[i];
		}
		
		int ans=sumOdd-sumEven;
		
		System.out.println(Math.abs(ans));
		
		scanner.close();

	}

}
