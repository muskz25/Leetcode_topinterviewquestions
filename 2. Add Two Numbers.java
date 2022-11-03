class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode ans,dummy = new ListNode(0);
    ans= dummy;
     
       int sum=0;
       int carry=0;
       while(l1!=null || l2!=null || carry!=0){
           if(l1!=null){
              sum+=l1.val; 
              l1=l1.next;
           }
           if(l2!=null){
              sum+=l2.val; 
              l2=l2.next;
           }
           sum=sum+carry;
        ListNode temp=new ListNode(sum%10);
        ans.next=temp;
        ans=ans.next;
        carry=sum/10;
        sum=0;

       }
       return dummy.next;
    }
}
