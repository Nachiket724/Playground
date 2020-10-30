import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		
		int num=scanner.nextInt();
		scanner.nextLine();
		
		String[] numStrings=scanner.nextLine().split(" ");
		
		int[] numbers=new int[num];
		
		for(int i=0;i<num;i++)
		{
			numbers[i]=Integer.parseInt(numStrings[i]);
		}
		
		int result=longestIncreasing(numbers,0,num,Integer.MIN_VALUE);
		
		System.out.println(result);
		
		scanner.close();
	}

	private static int longestIncreasing(int[] numbers,int i, int num, int prev) 
	{
		if(i==num)
			return 0;
		
		int exc=longestIncreasing(numbers, i+1, num, prev);
		
		
		int incl=0;
		
		if(numbers[i]>prev)
		{
			incl=1+longestIncreasing(numbers, i+1, num, numbers[i]);
		}
		
		return Integer.max(incl, exc);
	}
	
}
