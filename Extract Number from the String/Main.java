import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner scanner=new Scanner(System.in);
    
    int n=scanner.nextInt();
    scanner.nextLine();
    
    for(int i=0;i<n;i++)
    {
      long result=findMax(scanner.nextLine());
      System.out.println(result);
    }
    
    scanner.close();
  }
  
  public static long findMax(String s)
  {
    s=s.replaceAll("[^\\d]"," ");
    s=s.replaceAll("[0-9]*9+[0-9]*"," ");
    s=s.trim();
    s=s.replaceAll(" +"," ");
    long temp=0;
    if(s.equals("") || s.length()==0)
    {
      temp=-1;
    }
    else
    {
      String s1[]=s.split(" ");
      temp=Long.parseLong(s1[0]);
      
      for(int i=1;i<s1.length;i++)
      {
        if(Long.parseLong(s1[i])>temp)
        {
          temp=Long.parseLong(s1[i]);
        }
      }
    }
    
    return temp;
    
    
  }
}