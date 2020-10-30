import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		List<String> keywordStrings=new ArrayList<>();
		
		keywordStrings.add("break");
		keywordStrings.add("case");
		keywordStrings.add("continue");
		keywordStrings.add("default");
		keywordStrings.add("defer");
		keywordStrings.add("else");
		keywordStrings.add("for");
		keywordStrings.add("func");
		keywordStrings.add("goto");
		keywordStrings.add("if");
		keywordStrings.add("map");
		keywordStrings.add("range");
		keywordStrings.add("return");
		keywordStrings.add("struct");
		keywordStrings.add("type");
		keywordStrings.add("var");
		
		String string=scanner.nextLine();
		
		if(keywordStrings.contains(string))
		{
			System.out.println(string+" is a keyword");
		}
		else
		{
			System.out.println(string+" is not a keyword");
		}

		scanner.close();
	}

}
