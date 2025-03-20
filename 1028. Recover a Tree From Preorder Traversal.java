/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution 
{
    int idx=0;
    int n=0;
    public TreeNode recoverFromPreorder(String traversal) 
    {
        n=traversal.length();
        return recur(traversal,0);
    }
    public TreeNode recur(String traversal,int depth)
    {
        if(idx>=n) return null;
        int c=0;
        int temp=idx;
        while(temp<n && !Character.isDigit(traversal.charAt(temp)))
        {
            c++;
            temp++;
        }
        if(c!=depth) return null;
        idx=temp;
        int val=0;
        while(idx<n && Character.isDigit(traversal.charAt(idx)))
        {
            val=val*10+(traversal.charAt(idx)-'0');
            idx++;
        }
        TreeNode node=new TreeNode(val);
        node.left=recur(traversal,depth+1);
        node.right=recur(traversal,depth+1);
        return node;
    }
}
