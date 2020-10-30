import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int number=scanner.nextInt();
		
		List<Integer> myIntegers=new ArrayList<>();
		
		int sum=0;
		
		for(int i=1;i<number;i++)
		{
			if(number%i==0)
			{
				myIntegers.add(i);
			}
		}
		
		for(Integer in:myIntegers)
		{
			sum+=in;
		}
		
		if(sum==number)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
		scanner.close();

	}

}
