import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		String inputString=scanner.nextLine();
		
		char ch=inputString.charAt(0);
		
		if(ch>='A' && ch<='Z')
		{
			ch=(char)(ch+32);
			System.out.println(ch);
		}
		else
		{
			ch=(char)(ch-32);
			System.out.println(ch);
		}
		
		scanner.close();
	}

}
