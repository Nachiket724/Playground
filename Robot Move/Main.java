import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner scanner=new Scanner(System.in);
    
    int m=scanner.nextInt();
    
    int n=scanner.nextInt();
    
    int result=robotMoves(0,0,m-1,n-1);
    
    System.out.println(result);
    
    scanner.close();
  }
  
  public static int robotMoves(int cr,int cc, int r,int c)
  {
    if(cr==r && cc==c)
      return 1;
    if(cr>r || cc>c)
      return 0;
    
    
    return robotMoves(cr,cc+1, r,c) + robotMoves(cr+1,cc,r,c);
    
  }
}