import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		int num=scanner.nextInt();
		
		int x=0,y=0;
		
		char ch='R';
		
		while(num>0)
		{
			switch(ch)
			{
				case 'R':
					x=Math.abs(x)+10;
					y=Math.abs(y);
					ch='U';
					break;
				case 'U':
					y=Math.abs(y)+20;
					ch='L';
					break;
				case 'L':
					x=-(x+10);
					ch='D';
					break;
				case 'D':
					y=-(y);
					ch='R';
					break;
			}
			
			num--;
		}
		
		System.out.println(x+" "+y);

		scanner.close();
		
	}
	
	
}
