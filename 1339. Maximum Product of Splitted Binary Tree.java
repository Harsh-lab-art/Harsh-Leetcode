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
    long total=0;
    long pro=0;
    final int mod=1_000_000_007;
    public int maxProduct(TreeNode root) 
    {
        total=treesum(root);
        dfs(root);
        return(int)(pro%mod);
    }
    private long treesum(TreeNode node)
    {
        if(node ==null)return 0;
        return node.val+treesum(node.left)+treesum(node.right);
    }
    private long dfs(TreeNode node)
    {
        if(node==null)return 0;
        long left=dfs(node.left);
        long right=dfs(node.right);
        long sub=node.val+left+right;
        long prod=sub*(total-sub);
        pro=Math.max(pro,prod);
        return sub;
    }
}
