import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner scanner=new Scanner(System.in);
    
    int test=scanner.nextInt();
    
    scanner.nextLine();
    
    List<List<Integer>> list=new ArrayList<>();
    
    
      for(int j=0;j<test;j++)
      {
        List<Integer> li=new ArrayList<>();
        
        String[] s1=scanner.nextLine().split(" ");
        
        for(int k=0;k<test;k++)
        {
          li.add(Integer.parseInt(s1[k]));
        }
        
        list.add(j,li);
      }
    
    List<Integer> resultIntegers=spiral(list,test);
    
    if(test%2!=0)
    {
    	resultIntegers.remove(resultIntegers.size()-1);
    }
    
    for(Integer in: resultIntegers)
    {
    	System.out.print(in+" ");
    }
    
    scanner.close();
  }
  
  private static List<Integer> spiral(List<List<Integer>> list,int test) {
	  
	  List<Integer> returnList=new ArrayList<>();
	  
	  for(int i=0;i<test;i++)
	  {
	  
		  List<Integer> firstIntegers=firstIntegers(list.get(i),i);
		  
		  for(Integer in: firstIntegers)
		  {
			  returnList.add(in);
		  }
		  
		  List<Integer> rightLastIntegers=rightLastElements(list,i);
		  
		  for(Integer in: rightLastIntegers)
		  {
			  returnList.add(in);
		  }
		  
		  List<Integer> lastRowElements=lastRow(list,i);
		  
		  for(Integer in: lastRowElements)
		  {
			  returnList.add(in);
		  }
		  
		  List<Integer> firstRowIntegers=firstRowElements(list,i);
		  
		  for(Integer in: firstRowIntegers)
		  {
			  returnList.add(in);
		  }
	  }
	  
	  return returnList;
	
  }
  
  private static List<Integer> firstIntegers(List<Integer> list,int i) {
	  
	List<Integer> returnIntegers=new ArrayList<>();
	
	for(int j=i;j<list.size()-i;j++)
	{
		returnIntegers.add(list.get(j));
	}
	
	return returnIntegers;
  }
  
  private static List<Integer> rightLastElements(List<List<Integer>> list,int j) {
	  
	  List<Integer> reIntegers=new ArrayList<>();
	  
	  for(int i=1+j;i<list.size()-1-j;i++)
	  {
		  int num=list.get(i).get(list.get(i).size()-1-j);
		  reIntegers.add(num);
	  }
	  
	  return reIntegers;
	
  }

  private static List<Integer> lastRow(List<List<Integer>> list,int j) {

	  List<Integer> reIntegers=new ArrayList<>(list.get(list.size()-1-j));
	  
	  List<Integer> returnIntegers=new ArrayList<>();
	  
	  for(int i=j;i<reIntegers.size()-j;i++)
	  {
		  returnIntegers.add(reIntegers.get(i));
	  }
	  
	  Collections.reverse(returnIntegers);
	  
	  return returnIntegers;
	
  }
  
  private static List<Integer> firstRowElements(List<List<Integer>> list,int j) {
	  
	  List<Integer> reIntegers=new ArrayList<>();
	  
	  
	  for(int i=list.size()-2-j;i>j;i--)
	  {
		  int num=list.get(i).get(j);
		  
		  reIntegers.add(num);
	  }
	  
	  return reIntegers;
	
  }
}