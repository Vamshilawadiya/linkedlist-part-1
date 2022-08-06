//leetcode problemno1721
//topic linkedlist


class Solution {
    public ListNode swapNodes(ListNode head, int k) {
ListNode temp = head;
        ListNode t1=head;
        ListNode t2=head;
        int count=0;
        while(temp!=null){
           count++;
           temp=temp.next;
        }
      for(int i=1;i<k;i++){
         t1=t1.next;
      }
      while(count>k){
         t2=t2.next;
         count--;
      }
    
     int t=t1.val;
     t1.val=t2.val;
     t2.val=t;
     return head;
    }
}
