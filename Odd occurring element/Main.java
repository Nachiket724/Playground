import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int num=scanner.nextInt();
		
		scanner.nextLine();
		
		String[] numberStrings=scanner.nextLine().split(" ");
		
		int[] arr=new int[num];
		
		for(int i=0;i<num;i++)
		{
			arr[i]=Integer.parseInt(numberStrings[i]);
		}
		
		int result=oddOccuring(arr);
		
		System.out.println(result);
		
		scanner.close();

	}
	
	private static int oddOccuring(int[] arr)
	{
		Map<Integer, Integer> mySetMap=new HashMap<>();
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(mySetMap.containsKey(arr[i]))
			{
				int val=mySetMap.get(arr[i]);
				val++;
				mySetMap.put(arr[i], val);				
			}
			else
			{
				mySetMap.put(arr[i], 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> in: mySetMap.entrySet())
		{
			if(in.getValue()%2!=0)
			{
				return in.getKey();
			}
		}
		
		return -1;
		
	}

}
