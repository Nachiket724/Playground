import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner scanner=new Scanner(System.in);
    
    boolean flag=true;
    
    String s1=scanner.nextLine();
    String s2=scanner.nextLine();
    
    char[] sc1=s1.toLowerCase().toCharArray();
    char[] sc2=s2.toLowerCase().toCharArray();
    
    int l1=s1.length();
    int l2=s2.length();
    
    if(l1!=l2)
    {
      System.out.println("Not anagrams");
    }
    else
    {
      for(int i=0;i<l1-1;i++)
      {
        for(int j=i+1;j<l1;j++)
        {
          if(sc1[i]>sc1[j])
          {
            char temp=sc1[i];
            sc1[i]=sc1[j];
            sc1[j]=temp;
          }
          if(sc2[i]>sc2[j])
          {
            char temp=sc2[i];
            sc2[i]=sc2[j];
            sc2[j]=temp;
          }
        }
      }
      
      
      for(int i=0;i<l1;i++)
      {
          if(sc1[i]!=sc2[i])
          {
            System.out.println("Not anagrams");
            flag=false;
            break;
          }
          if(!flag)
          {
            break;
          }
        
        
      }
      
      if(flag)
      {
        System.out.println("Anagram");
      }
      
    }
  }
}