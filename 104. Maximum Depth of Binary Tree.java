class Solution 
{
    public int maxDepth(TreeNode root) 
    {
        if(root==null)
        return 0;
        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);
        int dep=0;
        while(!que.isEmpty())
        {
            int n=que.size();
            for(int i=0;i<n;i++)
            {
                TreeNode nd=que.poll();
                if(nd.left!=null)
                que.add(nd.left);
                if(nd.right!=null)
                que.add(nd.right);
            }
            dep++;
        }
        return dep;
    }
}
