import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		String[] numberStrings=scanner.nextLine().split(" ");
		
		int start=Integer.parseInt(numberStrings[0]);
		
		int end=Integer.parseInt(numberStrings[1]);
		
		int len=numberStrings[1].length();
		
		for(int i=start;i<=end;i++)
		{
			String numString=""+String.valueOf(i);
			
			for(int j=1;j<len;j++)
			{
				if(numString.length()==len)
				{
					break;
				}
				else
				{
					numString="0"+numString;
				}
				
			}
			
			System.out.print(numString+ " ");
		}
		
		scanner.close();

	}

}
