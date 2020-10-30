import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		String[] mintStrings=scanner.nextLine().split(" ");
		
		int first=Integer.parseInt(mintStrings[0]);
		
		int que=Integer.parseInt(mintStrings[1]);
		
		List<Integer> countIntegers=new ArrayList<>();
		
		countIntegers.add(first);
		
		int sum=0;
		
		while(que-->1)
		{
			for(int i=0;i<countIntegers.size();i++)
			{
				sum+=countIntegers.get(i);
			}
			
			sum--;
			
			countIntegers.add(sum);
			
			sum=0;
		}
		
		int count=0;
		
		for(Integer in:countIntegers)
		{
			count+=in;
		}
		
		System.out.println(count);
		
		scanner.close();
	}

}
