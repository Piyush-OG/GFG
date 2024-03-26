//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    static File file;
    static BufferedReader in;
    static PrintWriter out;

    public static void main(String args[]) throws IOException {
        in=new BufferedReader(new InputStreamReader(System.in));
        out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());

        while (t-- > 0) {

            String s[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int x = Integer.parseInt(s[1]);
            s = in.readLine().trim().split(" ");
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < n; i++) {
                st.push(Integer.parseInt(s[i]));
            }
            Solution ob = new Solution();
            Stack<Integer> S = ob.insertAtBottom(st, x);
            for (int i : S) {
                out.print(i + " ");
            }
            out.println();
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer> stack1 = new Stack<>();
        while (!st.isEmpty()) stack1.push(st.pop());
        
        stack1.push(x);
        
        Stack<Integer> stack2 = new Stack<>();
        while (!stack1.isEmpty()) stack2.push(stack1.pop());
        return stack2;
    }
}
 
