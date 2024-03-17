//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.io.*;

  public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValid(String s) {
        //Write your code here
        String[] arr = s.split("[.]");
        if(!(s.length()>=7 && s.length()<=15 && arr.length==4 && !(s.endsWith("."))))
        return false;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isAlphabetic(s.charAt(i)))
            {
                return false;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].length()>1 && arr[i].startsWith("0") )
            return false;
            if(!(Integer.parseInt(arr[i])>=0 && Integer.parseInt(arr[i])<=255))
            {
                return false;
            }
        }
        return true; 
    }
}