import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner scanner=new Scanner(System.in);
    
    String result=parenthesis(scanner.nextLine());
    
    System.out.println(result);
    
    scanner.close();
    
  }
  
  private static String parenthesis(String s)
  {
    Stack<Character> parent=new Stack<Character>();
    
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{')
      {
        parent.push(s.charAt(i));
      }
      else
      {
        if(parent.isEmpty())
        {
          return "Not Balanced";
        }
        else
        {
          char popValue=parent.pop();
          if(s.charAt(i)==')' && popValue!='(')
          {
            return "Not Balanced";
          }
          else if(s.charAt(i)==']' && popValue!='[')
          {
            return "Not Balanced";
          }
          else if(s.charAt(i)=='}' && popValue!='{')
          {
            return "Not Balanced";
          }
        }
      }
    }
    
    if(parent.isEmpty())
    {
      return "Balanced";
    }
    else
    {
      return "Not Balanced";
    }
  }
}