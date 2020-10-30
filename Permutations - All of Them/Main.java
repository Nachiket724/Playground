import java.util.*;

class Main
{
  static List<String> list=new ArrayList<>();
  
  public static void main(String args[])
  {
    Scanner scanner=new Scanner(System.in);
    
    permutations(scanner.nextLine(),"");
    
    Collections.sort(list);
    
    for(String in: list)
    {
      System.out.println(in);
    }
    
    scanner.close();
  }
  
  private static void permutations(String s, String ans)
  {
    if(s.length()==0)
    {
      list.add(ans);
      return;
    }
    
    for(int i=0;i<s.length();i++)
    {
      char ch=s.charAt(i);
      
      String ros=s.substring(0,i)+s.substring(i+1);
      
      permutations(ros, ans+ch);
    }
  }
}