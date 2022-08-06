//leetcode problemno2095
//topic linkedlist

class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null&&head.next==null){
            return head;
        }
        else{
        ListNode fastptr=head;
         ListNode slowptr=head;
         while(fastptr!=null&&fastptr.next!=null){
            fastptr=fastptr.next.next;
            slowptr=slowptr.next;
         }
           ListNode ptr=head;
          if(ptr.next==null){
              return null;
          }  
        while(ptr.next!=slowptr){
         ptr=ptr.next;
        }
        ptr.next=slowptr.next;
        slowptr.next=null;
        }
         return head; 
    }
}
