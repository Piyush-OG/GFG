class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    Node prev = null;
    boolean flag = true;
    void inorder(Node root){
        if(root == null)return;
        inorder(root.left);
        if(prev == null)prev = root;
        else if(prev.data >= root.data)flag = false;
        else prev = root;
        inorder(root.right);
    }
    boolean isBST(Node root)
    {
        // code here.
        inorder(root);
        return flag;
    }
}
