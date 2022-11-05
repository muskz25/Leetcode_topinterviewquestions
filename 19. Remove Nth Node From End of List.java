One Pointer 2 pass
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode ans=new ListNode();
      ListNode temp=head;
      int count=0;
      while(temp!=null){
          count++;
          temp=temp.next;
      }
        if(count==n) return head.next;
        temp=head;
        System.out.println(count);
      int nthnode=count-n-1;
      while(nthnode>0){
        temp=temp.next;  
        nthnode--; 
      }
       temp.next=temp.next.next;
       return head;

    }
     
}


2 pointer
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=new  ListNode(0);
       temp.next=head;
      ListNode slow=temp;
     ListNode fast=temp;
        while(n>0){
            fast=fast.next;
            n--;
        }
         while(fast!=null && fast.next!=null){
              fast=fast.next;
               slow=slow.next;
         }
         slow.next=slow.next.next;

         return temp.next;
    }
}
