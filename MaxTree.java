import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val)
    {
        this.val=val;
    }
    TreeNode(int val,TreeNode left,TreeNode right)
    {
        this.val=val;
        this.left=left;
        this.right=right;
    }
}
class Solution 
{
    public List<Integer> largestValues(TreeNode root) 
    {
      List<Integer>res=new ArrayList<>();
      if(root==null)
      {
        return res;
      }
      Queue<TreeNode>queue=new LinkedList<>();
      queue.add(root);
      while(!queue.isEmpty())
      {
        int lev=queue.size();
        int maxv=Integer.MIN_VALUE;
        for(int i=0;i<lev;i++)
        {
            TreeNode curr=queue.poll();
            maxv=Math.max(maxv,curr.val);
            if(curr.left!=null)
            {
                queue.add(curr.left);
            }
            if(curr.right!=null)
            {
                queue.add(curr.right);
            }
        }
        res.add(maxv);
      }
      return res;  
    }
}
