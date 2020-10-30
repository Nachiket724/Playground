import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner scanner=new Scanner(System.in);
    
    int n1=scanner.nextInt();
    
    int n2=scanner.nextInt();
    
    List<Integer> primeNumbers=new ArrayList<>();
    
    for(int i=n1;i<=n2;i++)
    {
      if(isPrime(i))
      {
        primeNumbers.add(i);
      }
    }
    
    int result=primePairs(primeNumbers);
    
    if(result>0)
    {
      System.out.println(result);
    }
    else
    {
      System.out.println("No Prime Pairs");
    }
    
    scanner.close();
  }
  
  public static boolean isPrime(int n)
  {
    if(n<=1)
    {
      return false;
    }
    
    for(int i=2;i<=Math.sqrt(n);i++)
    {
      if(n%i==0)
      {
        return false;
      }
    }
    
    return true;
  }
  
  public static int primePairs(List<Integer> list)
  {
    int count=0;
    
    for(int i=0;i<list.size()-1;i++)
    {
      for(int j=i+1;j<list.size();j++)
      {
        if(Math.abs(list.get(i)-list.get(j))==6)
        {
          count++;
        }
      }
    }
    return count;
  }
}