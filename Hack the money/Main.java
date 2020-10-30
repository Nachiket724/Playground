import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner scanner=new Scanner(System.in);
    
    int test=scanner.nextInt();
    
    while(test-->0)
    {
      boolean result=hack(scanner.nextInt(),1);
      
      if(result)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }
    
    scanner.close();
  }
  
  public static boolean hack(int target, int current)
  {
    if(target==current)
    {
      return true;
    }
    else if(target<current)
    {
      return false;
    }
    else
    {
      if(hack(target,current*10))
      {
        return true;
      }
      else if(hack(target,current*20))
      {
        return true;
      }
    }
    
    return false;
  }
}