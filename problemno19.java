//leetcode problem no: 19;
//topic linkedlist;


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
         if(head==null||head.next==null){
         return null;
      }
      int count=0;
      ListNode temp =head;
      while(temp!=null){
            count++;
         temp=temp.next;
      }
      
      ListNode t=head;
      if(t.next==null){
         return null;
      }
        if(count==n){
            return head.next;
        }
        while(count>n+1){
          t=t.next;
          --count;
        }
        ListNode a=t.next;
        t.next=a.next;
       
        return head;
    }
}
