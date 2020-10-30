import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner scanner=new Scanner(System.in);
    
    List<Integer> list=new ArrayList<>();
    
    while(true)
    {
      int n=scanner.nextInt();
      if(n>0)
      {
        list.add(n);
      }
      else
      {
        break;
      }
    }
    
    if(list.isEmpty())
    {
      System.out.println("List is empty");
    }
    else
    {
      List<Integer> result=pairWise(list);
      
      for(Integer in: result)
      {
        System.out.println(in);
      }
    }
    
    scanner.close();
  }
  
  private static List<Integer> pairWise(List<Integer> list)
  {
    int size=(list.size())%2;
  
    List<Integer> result=new ArrayList<>();
    
    if(size==0)
    {
      for(int i=0;i<list.size();i++)
      {
        result.add(1);
      }
    }
    else
    {
      for(int i=0;i<list.size()-1;i++)
      {
        result.add(1);
      }
    }
    if(size==0)
    {
      for(int i=0;i<list.size();i=i+2)
      {
        int temp=list.get(i+1);
        result.set(i+1,list.get(i));
        result.set(i,temp);  
      }
    }
    else
    {
      for(int i=0;i<list.size()-1;i=i+2)
      {
        int temp=list.get(i+1);
        result.set(i+1,list.get(i));
        result.set(i,temp);  
      }
      
      result.add(list.size()-1,list.get(list.size()-1));
      
    }
    
    return result;
  }
}