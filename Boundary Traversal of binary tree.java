//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }

class Solution
{
	ArrayList <Integer> boundary(Node node)
	{
	   ArrayList<Integer> ans = new ArrayList<>();
	   if(node == null) return ans;
	   if(node.left == null && node.right == null) {
	       ans.add(node.data);
	       return ans;
	   }
	   
	   ans.add(node.data);
	   
	   left(node.left, ans);
	   leaf(node, ans);
	   right(node.right, ans);
	   return ans;
	}
	
	void left(Node root, ArrayList<Integer> ans) {
	    if(root == null) return;
	    if(root.left == null && root.right == null) return;
	    
	    ans.add(root.data);
	    if(root.left == null && root.right != null) {
	        left(root.right, ans);
	    } else {
	        left(root.left, ans);
	    }
	}
	
	void leaf(Node root, ArrayList<Integer> ans) {
	    if(root == null) return;
	    if(root.left == null && root.right == null) ans.add(root.data);
	    leaf(root.left, ans);
	    leaf(root.right, ans);
	}
	
	void right(Node root, ArrayList<Integer> ans) {
        if(root == null) return;
	    if(root.left == null && root.right == null) return;
	    
	    
	    if(root.right == null && root.left != null) {
	        right(root.left, ans);
	    } else {
	        right(root.right, ans);
	    }
	    
	    ans.add(root.data);
	}
}
