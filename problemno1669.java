//leetcode problemno 1669
//topic linkedlist
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
  ListNode temp=list1;
        ListNode t=list1;
         for(int i=1;i<a;i++){
            temp=temp.next;
         }
        for(int j=1;j<=b;j++){
            t=t.next;
        }
        ListNode t1=t.next;
        ListNode p=list2;
        while(p.next!=null){
          p=p.next;
        }
        p.next=t1;
        temp.next=list2;
        return list1;


    }
}