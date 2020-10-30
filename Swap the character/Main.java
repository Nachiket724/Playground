import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		String ansString="";
		
		String first=scanner.nextLine().trim();
		
		for(int i=0;i<first.length();i++)
		{
			char ch=first.toLowerCase().charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				ansString+='$';
			}
			else
			{
				ansString+=first.charAt(i);
			}
		}
		
		String second=scanner.nextLine().trim();
		
		for(int i=0;i<second.length();i++)
		{
			char ch=second.toLowerCase().charAt(i);
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				ansString+=second.charAt(i);
			}
			else
			{
				ansString+='#';
			}
			
		}
		
		String third=scanner.nextLine().trim();
		
		ansString+=third.toUpperCase();
		
		System.out.println(ansString);
		
		scanner.close();

	}

}
