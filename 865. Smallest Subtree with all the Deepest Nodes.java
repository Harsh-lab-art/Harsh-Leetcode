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
    public TreeNode subtreeWithAllDeepest(TreeNode root) 
    {
        return dfs(root).node;
    }
    class pair
    {
        TreeNode node;
        int depth;
        pair(TreeNode n, int d)
        {
            node =n;
            depth=d;
        }
    }
    public pair dfs(TreeNode root)
    {
        if(root==null) return new pair(null,0);
        pair left=dfs(root.left);
        pair right=dfs(root.right);
        if(left.depth==right.depth)
        {
            return new pair(root, left.depth+1);
        }
        else if(left.depth>right.depth)
        {
            return new pair(left.node,left.depth+1);
        }
        else
        {
            return new pair(right.node,right.depth+1);
        }
    }
}
