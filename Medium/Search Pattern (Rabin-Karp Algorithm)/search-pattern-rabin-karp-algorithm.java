//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s, patt;
            s = sc.next();
            patt = sc.next();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.search(patt, s);
            
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    ArrayList<Integer> search(String pattern, String text)
    {
        // your code here
        ArrayList<Integer> al=new ArrayList<>();
        
        if(pattern.length()>text.length())
        return al;
        
        //ArrayList<Integer> al=new ArrayList<>();
        int l=pattern.length();
        for(int i=0;i<text.length();i++)
        {
            
             for (int j=i+l;j<=text.length();j++)
            {
            
            
              String s=text.substring(i,j);
        
        if(s.length()>pattern.length())
        {
            break;
        }
            if(s.equals(pattern))
            {
              al.add(i+1);
                break;      
            }
            
            }
        }
        
        return al;
    }
}