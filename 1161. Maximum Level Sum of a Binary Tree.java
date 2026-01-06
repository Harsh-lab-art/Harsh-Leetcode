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
    public int maxLevelSum(TreeNode root) 
    {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        int l=1;
        int ml=1;
        long sum=Long.MIN_VALUE;
        while(!q.isEmpty())
        {
            int s=q.size();
            long su=0;
            for(int i=0;i<s;i++)
            {
                TreeNode node=q.poll();
                su+=node.val;
                if(node.left!=null)q.add(node.left);
                if(node.right!=null)q.add(node.right);
            }
            if(su>sum)
            {
                sum=su;
                ml=l;
            }
            l++;
        }
        return ml;
    }
}
