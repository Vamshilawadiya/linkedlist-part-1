//leetcode problemno206
//topic linkedlist

class Solution {
    public ListNode reverseList(ListNode head) {
          if(head==null){
    return head;
   }
    ListNode temp = head;
    ListNode p= null;
    ListNode n= null;
    while(temp!=null){
        n=temp.next;
        temp.next=p;
        p=temp;
        temp=n;  
    }
   return p;

    }
}
