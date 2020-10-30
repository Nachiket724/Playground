import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner scanner=new Scanner(System.in);
    
    LinkedList<Integer> li=new LinkedList<>();
    
    int num=scanner.nextInt();
    scanner.nextLine();
    String[] numbers=scanner.nextLine().split(" ");
    
    for(int i=0;i<num;i++)
    {
      li.addFirst(Integer.parseInt(numbers[i]));
    }
    
    int searchItem=scanner.nextInt();
    
    if(searchItem>num)
    {
      System.out.println("No node found");
    }
    else
    {
      	System.out.println(li.get(num-searchItem));
    }
    
  }
}