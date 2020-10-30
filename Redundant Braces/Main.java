import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		String string=scanner.nextLine();
		
		String resultString=redundant(string);
		
		System.out.println(resultString);
		
		scanner.close();

	}
	
	private static String redundant(String string) {
		
		Stack<Character> stack=new Stack<>();
		
		char[] str=string.toCharArray();
		
		for(char ch: str)
		{
			if(ch==')')
			{
				char top=stack.peek();
				
				stack.pop();
				
				boolean flag=true;
				
				while(top!='(')
				{
					if(top=='+' || top =='-' || top=='*' || top=='/')
					{
						flag=false;
					}
					
					top=stack.peek();
					stack.pop();
				}
				
				if(flag)
				{
					return "Yes";
				}
			}
			else
			{
				stack.push(ch);
			}
		}
		
		return "No";
	}

}
