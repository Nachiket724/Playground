import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		LinkedHashSet<Character> myHashSet=new LinkedHashSet<>();
		
		String inputString=scanner.nextLine();
		
		for(int i=0;i<inputString.length();i++)
		{
			myHashSet.add(inputString.charAt(i));
		}
		
		String tempString="";
		
		for(Character in: myHashSet)
		{
			tempString=in+tempString;
		}
		System.out.println(tempString);
		
		scanner.close();
	}

}
