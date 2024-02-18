class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
        // counting length
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        

     //calculating element from start
        int index=((count-n)+1);
    

//finding the element
        temp=head;
        count=1;
        while(temp!=null){
            if(index==count){
                return temp.data;
            }
            temp=temp.next;
            count++;
        }
        return -1;
    }
}

