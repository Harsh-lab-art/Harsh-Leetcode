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
    public List<Integer> postorderTraversal(TreeNode root) 
    {
        List<Integer>res=new ArrayList<>();
        help(root,res);
        return res;
    }
    public void help(TreeNode root, List<Integer> r)
    {
        if (root==null) return;
        help(root.left,r);
        help(root.right,r);
        r.add(root.val);
    }
}
