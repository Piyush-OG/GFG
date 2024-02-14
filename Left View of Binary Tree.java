//User function Template for Java

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> ans= new ArrayList<>();
      ln(root,1,ans);
      return ans;
    }
    static void ln(Node root, int lev,ArrayList<Integer>  ans){
        
        if(root==null) return;
        if(lev>ans.size()) ans.add(root.data);
        ln(root.left,lev+1,ans);
         ln(root.right,lev+1,ans);
    }
}
