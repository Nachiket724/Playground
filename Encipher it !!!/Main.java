import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	static HashMap<Character, Integer> myHashMap=new HashMap<Character, Integer>();

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		for(int i=65,j=0;i<=90;i++,j++)
		{
			char c=(char)i;
			
			myHashMap.put(c, j);
			
		}
		
		char ch=scanner.nextLine().charAt(0);
		
		int num=scanner.nextInt();
		
		char n=Character.toUpperCase(ch);
		
		int val=myHashMap.get(n);
		
		int sum=(num+val)%26;
		
		char c='A';
		
		for(Map.Entry<Character, Integer> myEntry: myHashMap.entrySet())
		{
			if(myEntry.getValue().equals(sum))
			{
				c=myEntry.getKey();
			}
		}
		
		if(Character.isUpperCase(ch))
		{
			System.out.println(c);
		}
		else
		{
			System.out.println(Character.toLowerCase(c));
		}
		
		scanner.close();

	}

}
