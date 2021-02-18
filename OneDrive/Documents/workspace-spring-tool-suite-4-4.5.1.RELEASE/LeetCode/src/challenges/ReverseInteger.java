package challenges;

import java.util.Scanner; 
class Solution {
    public int reverse(int x) {
       
        long rev=0;
        boolean neg=false;
        if (x<0)
        {
            x=x*-1;
            neg=true;
        }   
        while(x!=0)
        {
            rev=rev*10+x%10;
            x=x/10;
        }
        if (rev>= Integer.MAX_VALUE ||rev<= Integer.MIN_VALUE)
            return 0;
        else if (neg)
            return (int)rev *-1;
        else
            return (int)rev;
              
    }
}

public class ReverseInteger{

     public static void main(String []args){
        System.out.println(Integer.MAX_VALUE);
        Solution obj=new Solution();
        int x;
        Scanner console = new Scanner(System.in);
        System.out.print("Integer to reverse :");
        x = console.nextInt();
        System.out.println(obj.reverse(x));
        console.close();
        
     }
}