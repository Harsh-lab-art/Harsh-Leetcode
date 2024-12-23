class Solution 
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
      ListNode dm=new ListNode(0);
      ListNode curr=dm;
      int c=0;
      while(l1!=null||l2!=null)
      {
        int x=(l1!=null)?l1.val:0;
        int y=(l2!=null)?l2.val:0;
        int sum=x+y+c;
        c=sum/10;
        curr.next=new ListNode(sum%10);
        curr=curr.next;
        if(l1!=null)l1=l1.next;
        if(l2!=null)l2=l2.next;
      }
      if(c>0)
      {
        curr.next=new ListNode(c);
      }
      return dm.next;
    }
}
