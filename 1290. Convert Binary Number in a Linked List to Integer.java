class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) 
    { 
        this.val = val; 
    }
    ListNode(int val, ListNode next) 
    { 
        this.val = val; this.next = next; 
    }

    public static ListNode deserialize(String input) 
    {
        input = input.replaceAll("\\[|\\]|\\s", "");
        if (input.isEmpty()) return null;

        String[] parts = input.split(",");
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (String part : parts) 
        {
            current.next = new ListNode(Integer.parseInt(part));
            current = current.next;
        }
        return dummy.next;
    }
}

class Solution 
{
    public int getDecimalValue(ListNode head) 
    {
        int result = 0;
        while (head != null) 
        {
            result = result * 2 + head.val;
            head = head.next;
        }
        return result;
    }
}
