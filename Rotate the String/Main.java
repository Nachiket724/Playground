import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner scanner=new Scanner(System.in);
    
    String a=scanner.nextLine();
    
    int rotation=scanner.nextInt();
    
    char leftRight=scanner.next().charAt(0);
    
    String result=rotate(a,rotation,leftRight);
    
    System.out.println(result);
    
    scanner.close();
    
  }
  
  private static String rotate(String a, int rotation, char leftRight)
  {
    String result="";
    
    rotation=rotation%a.length();
    
    Character c1=leftRight;
    
    if(a.length()==1)
    {
      result+=a;
    }
    else
    {
      if(c1.equals('L'))
      {
        result+=a.substring(rotation)+a.substring(0,rotation);
      }
      else if(c1.equals('R'))
      {
        result+=a.substring(a.length()-rotation)+a.substring(0,a.length()-rotation);
      }
    }
   	return result;
  }
}