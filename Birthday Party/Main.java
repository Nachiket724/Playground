import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner scanner=new Scanner(System.in);
    
    int test=scanner.nextInt();
    
    while(test-->0)
    {
      long result=gift(scanner.nextInt());
      
      System.out.println(result);
    }
  }
  
  public static long gift(int n)
  {
    return ((n*(2*n-1))%(int)(Math.pow(10,9)+7));
  }
}