import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner scanner=new Scanner(System.in);
    
    int testCases=scanner.nextInt();
    scanner.nextLine();
    
    while(testCases-->0)
    {
      String[] num=scanner.nextLine().split(" ");
      
      int[] numbers=new int[num.length];
      
      for(int i=0;i<num.length;i++)
      {
        numbers[i]=Integer.parseInt(num[i]);
      }
      
      int result=largePrime(numbers);
      
      System.out.println(result);
    }
    
    scanner.close();
  }
  
  private static int largePrime(int[] numbers)
  {
    int n=numbers[0];
    int p=numbers[1];
  
    int ans=0;
    
    while(n>0)
    {
      n/=p;
      ans+=n;
    }
    
    return ans;
  }
}