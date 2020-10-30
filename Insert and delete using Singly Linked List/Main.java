import java.util.*;

class Main
{
  public static void main(String args[])
  {

	Scanner scanner=new Scanner(System.in);
	
	LinkedList<Integer> linkedList=new LinkedList<>();
    
	while(true)
	{
		int n=scanner.nextInt();
		
		switch(n)
		{
			case 1:
				System.out.println("Enter value of element ");
				linkedList.addFirst(scanner.nextInt());
				break;
			case 2:
				System.out.println("Enter value of element ");
				linkedList.addLast(scanner.nextInt());
				break;
			case 3:
				if(linkedList.isEmpty())
				{
					System.out.println("Linked list is empty.");
				}
				else
				{
					for(Integer in: linkedList)
					{
						System.out.print(in+" ");
					}
                  System.out.println();
				}
				break;
			case 4:
				if(linkedList.isEmpty())
				{
					System.out.println("Linked list is empty.");
				}
				else
                {
					int num=linkedList.removeFirst();
					System.out.println(num+ " deleted from beginning successfully.");
                }
				break;
			case 5:
				if(linkedList.isEmpty())
				{
					System.out.println("Linked list is empty.");
				}
				
				else
                {
            		int num1=linkedList.removeLast();
					System.out.println(num1+ " deleted from end successfully.");
                }
				break;
			case 6:
				System.exit(0);
				scanner.close();
				break;
		}
			
	}
	
   }
  
}