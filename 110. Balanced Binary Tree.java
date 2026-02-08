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
    public boolean isBalanced(TreeNode root) 
    {
        return getheight(root)!=-1;
    }
    private int getheight(TreeNode node)
    {
        if(node ==null)
        {
            return 0;
        }
        int lefth=getheight(node.left);
        if(lefth==-1)
        return -1;
        int righth=getheight(node.right);
        if(righth==-1)
        return -1;
        if(Math.abs(lefth-righth)>1)
        {
            return -1;
        }
        return Math.max(lefth,righth)+1;
    }
}
