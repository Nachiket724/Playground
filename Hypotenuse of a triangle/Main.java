import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		double num1=scanner.nextDouble();
		
		double num2=scanner.nextDouble();
		
		double add=Math.pow(num1, 2) + Math.pow(num2, 2);
		
		double ans=Math.sqrt(add);
		
		System.out.printf("%.2f",ans);
		
		scanner.close();

	}

}
