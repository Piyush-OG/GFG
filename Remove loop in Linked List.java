*
class Node
{
    int data;
    Node next;
}
*/

class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        
        // first detect the loop
        
        boolean b=false;
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                b=true;
                break;
            }    
        }
        
        // now set slow=head & create a new node prev to store last node before cycle 
        if(b==true){
            if(slow!=head){ // if slow & fast are at not at head ie x>1
                slow=head;
                Node prev=fast;
                // inc slow & fast by one each untill they meet. When they meet set prev.next=null
                while(slow!=fast){
                    slow=slow.next;
                    prev=fast;
                    fast=fast.next;
                }
                prev.next=null;
            }else{ // if slow & fast are at head ie x=1, then create a prev node to store last node before cycle and set it to null
                // increment slow atfirst and then enter in the loop
                Node prev=null;
                slow=slow.next;
                while(slow!=head){ // since slow & fast are at same point, we can either inc slow or fast
                    prev=slow;
                    slow=slow.next;
                }
                prev.next=null;
            }
        }
    }
}
