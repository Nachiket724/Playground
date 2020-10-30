import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner scanner=new Scanner(System.in);
    
    int num=scanner.nextInt();
    
    double res=Math.pow(num,0.5);
    System.out.printf("%.2f",res);
    
    scanner.close();
  }
}