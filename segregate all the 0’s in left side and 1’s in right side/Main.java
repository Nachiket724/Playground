import java.util.*;

class Main
{
  public static void main(String args[])
  {
    Scanner scanner=new Scanner(System.in);
    
    int n=scanner.nextInt();
    scanner.nextLine();
    String[] s=scanner.nextLine().split(" ");
    
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=Integer.parseInt(s[i]);
    }
    
    int[] result=output(arr,n);
    
    for(Integer in: result)
    {
      System.out.print(in+"");
    }
  }
  
  public static int[] output(int[] arr, int n)
  {
    String zero="";
    String ones="";
    
    for(int i=0;i<n;i++)
    {
      if(arr[i]==0)
      {
        zero=zero+arr[i];
      }
      else if(arr[i]==1)
      {
        ones=ones+arr[i];
      }
    }
    
    String s3=zero.concat(ones);
    String[] sb3=s3.split("");
    
    int[] retArray=new int[n];
    
    for(int i=0;i<n;i++)
    {
      retArray[i]=Integer.parseInt(sb3[i]);
    }
    
    
    
    return retArray;
  }
}