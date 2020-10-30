import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		String inputString=scanner.nextLine();
		
		char ch='A';
		
		int count=1;
		
		if(inputString.length()>20)
		{
			System.out.println("Invalid Input");
		}
		else
		{
			for(int i=0;i<inputString.length()-1;i++)
			{
				if(inputString.charAt(i)==inputString.charAt(i+1))
				{
					ch=inputString.charAt(i);
					count++;
				}
				else if(count>1)
				{
					
					System.out.print(ch);
					System.out.print(count);
					count=1;
				}
				else
				{
					System.out.print(inputString.charAt(i));
					System.out.print(count);
					ch=inputString.charAt(i+1);
					count=1;
				}
			}
			System.out.print(ch);
			System.out.print(count);
		}
		
		scanner.close();
	}

}
