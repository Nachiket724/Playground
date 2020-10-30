
import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner scanner=new Scanner(System.in);
    
    int n=scanner.nextInt();
    scanner.nextLine();
    
    String[] songs=scanner.nextLine().split("");
    
    int result=findLast(songs,n);
    
    System.out.println(result);
    
    scanner.close();
  }
  
  public static int findLast(String[] songs, int n)
  {
    List<Boolean> list=new ArrayList<>();
    
    for(int i=0;i<n;i++)
    {
      list.add(true);
    }
    
    int count=n;
    int mem=0;
    
    while(count!=1)
    {
      for(int i=0;i<songs.length;i++)
      {
        if(count==1)
        {
          break;
        }
        else
        {
          if(songs[i].equals("x"))
          {
            mem=whatNext(list, mem, n);
          }
          else if(songs[i].equals("y"))
          {
            list.set(mem,false);
            mem=whatNext(list,mem,n);
            count--;
          }
        }
      }
      
    }
    
    int pos=list.indexOf(true);
    
    return pos+1;
  }
  
  public static int whatNext(List<Boolean> list,int mem, int n)
  {
    int temp=0;
    if(list.get((mem+1)%n)==false)
    {
    	mem=(mem+2)%n;
    	if(list.get(mem)==false)
    	{
	      for(int i=(mem);i<list.size();i++)
	      {
	        if(list.get(i)==true)
	        {
	          mem=i;
	          break;
	        }
	        else
	        {
	          mem=-8;
	        }
	      }
	      if(mem==-8)
	      {
	        for(int i=0;i<list.size();i++)
	      	{
	        	if(list.get(i)==true)
	        	{
	          		mem=i;
	          		break;
	        	}
	      	}
	      }
    	}
    }
    else
    {
      mem=(++mem)%n;
    }
    
    return mem;
  }
}