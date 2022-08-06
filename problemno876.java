//leetcode problemno 876
//topic linkedlist
class Solution {
    public ListNode middleNode(ListNode head) {
       ListNode fastptr=head;
         ListNode slowptr=head;
         while(fastptr!=null&&fastptr.next!=null){
            fastptr=fastptr.next.next;
            slowptr=slowptr.next;
         }
          return slowptr;
        
    }
}
