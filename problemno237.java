//leetcode problemno237
//topic linkedlist
class Solution {
    public void deleteNode(ListNode node) {
        
            
            node.val=node.next.val;
        node.next=node.next.next;
                 
             
                
          System.out.print(node.val);
        }
        }
