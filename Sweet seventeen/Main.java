import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		HashMap<Character, Integer> hMap=new HashMap<Character,Integer>();
		
		hMap.put('A', 10);
		hMap.put('B', 11);
		hMap.put('C', 12);
		hMap.put('D', 13);
		hMap.put('E', 14);
		hMap.put('F', 15);
		hMap.put('G', 16);
		
		hMap.put('a', 10);
		hMap.put('b', 11);
		hMap.put('c', 12);
		hMap.put('d', 13);
		hMap.put('e', 14);
		hMap.put('f', 15);
		hMap.put('g', 16);
		
		//System.out.println(hMap);
		
		Scanner scanner=new Scanner(System.in);
		
		String string=scanner.nextLine();
		
		int num=0, p=0;
		
		for(int i=string.length()-1;i>-1;i--)
		{
			//System.out.println(hMap.get(string.charAt(i)));
			if((string.charAt(i)>='A' && string.charAt(i)<='Z') || (string.charAt(i)>='a' && string.charAt(i)<='z') )
			{
				num = num + hMap.get(string.charAt(i))*(int)Math.pow(17,p++);
			}
			else
			{
				num=num+((string.charAt(i)-'0')*(int)Math.pow(17, p++));
			}
		}
		
		System.out.println(num);
		scanner.close();
	}

}
