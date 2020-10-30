import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner scanner=new Scanner(System.in);
    
    int n1=scanner.nextInt();
    
    int n2=scanner.nextInt();
    
    int result=uniqueNo(n1,n2);
    
    if(result>0)
    	System.out.println(result);
    else
      	System.out.println("No Unique Number");
    scanner.close();
  }
  
  public static int uniqueNo(int n1,int n2)
  {
    List<Integer> list=new ArrayList<>();
    
    for(int i=n1;i<=n2;i++)
    {
      list.add(i);
    }
    
    int count=0;
    boolean flag=true;
    List<Integer> uni=new ArrayList<>();
    for(int i=0;i<list.size();i++)
    {
      int temp=list.get(i);
      uni.clear();
      while(temp>0)
      {
        int k=temp%10;
        if(!uni.contains(k))
        {
          uni.add(k);
        }
        else
        {
          flag=false;
        }
        temp=temp/10; 
      }
      if(flag)
      {
        count++;
      }
      flag=true;
    }
    
    return count;
  }
}