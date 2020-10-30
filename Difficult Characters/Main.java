/* IMPORTANT: Multiple classes and nested static classes are supported */
 
/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
//import for Scanner and other utility classes
 
*/
import java.util.*;
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
 
public class Main {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input
 
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
 
        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
 
        */
 
        // Write your code here
        //treeset time=4.22247 mem=3431172
        Scanner ctr  = new Scanner(System.in);
        int t_=ctr.nextInt();
        while(t_-->0){
            String s =ctr.next();
            int arr[]=new int[26];
            Arrays.fill(arr,0);
            //int max = Integer.MIN_VALUE;
            for(int i=0;i<s.length();i++){
                int t=(int)(s.charAt(i)-'a');
                ++arr[t];
               // max=Math.max(max,arr[t]);
            }
            
            ArrayList<String> chararr=new ArrayList<>();
            TreeSet<Integer> ts=new TreeSet<>();
            for(int i=0;i<26;i++){
                ts.add(arr[i]);
            }
            for(Integer i:ts){
                for(int j=25;j>=0;j--){
                    if(arr[j]==i){
                        char c=(char)('a'+j);
                        chararr.add(c+"");
                    }
                }
            }
            String joined=String.join(" ",chararr);
            System.out.println(joined);
        }
    }
}
