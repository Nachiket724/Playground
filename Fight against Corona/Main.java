import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner scanner=new Scanner(System.in);
    
    String[] time=scanner.nextLine().split(":");
    
    int result=corona(time);
    
    System.out.println(result);
    
    scanner.close();
  }
  
  private static int corona(String[] time)
  {
    int hh=Integer.parseInt(time[0]);
    int mm=Integer.parseInt(time[1]);
    
    int requiredTime=0;
    
    while(hh%10!= mm/10 || hh/10!=mm%10)
    {
      ++mm;
      
      if(mm==60)
      {
        ++hh;
        mm=0;
      }
      if(hh==24)
      {
        hh=0;
      }
      
      requiredTime++;
    }
    
    return requiredTime;
  }
}