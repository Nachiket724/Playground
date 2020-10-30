import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner scanner=new Scanner(System.in);
    
    int test=scanner.nextInt();
    
    while(test-->0)
    {
      int n=scanner.nextInt();
      scanner.nextLine();
      String[] numbers=scanner.nextLine().split(" ");
      List<Integer> list=new ArrayList<>();
      
      for(int i=0;i<n;i++)
      {
        list.add(Integer.parseInt(numbers[i]));
      }
      
      int result= pali(list,n);
      
      System.out.println(result);
    }
    
    scanner.close();
  }
  
  public static int pali(List<Integer> list,int n)
  {
    int count=0, start=0, end=n-1;
   
    while(start<end)
    {
    	if(list.get(start)==list.get(end))
    	{
    		start++;
    		end--;
    	}
    	
    	else if(list.get(start)<list.get(end))
    	{
    		list.set(start+1,list.get(start)+list.get(start+1));
    		count++;
    		start++;
    	}
    	else if(list.get(start)>list.get(end))
    	{
    		list.set(end-1,list.get(end)+list.get(end-1));
    		count++;
    		end--;
    		
    	}
    }
    
    return count;
  }
}