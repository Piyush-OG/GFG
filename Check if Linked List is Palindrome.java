class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        ArrayList <Integer> temp= new ArrayList<>();
        while(head != null)
        {
            temp.add(head.data);
            
            head= head.next;
        }
         ArrayList <Integer> rev = (ArrayList) temp.clone();
        Collections.reverse(rev);
        return temp.equals(rev);
        
    }    
}

