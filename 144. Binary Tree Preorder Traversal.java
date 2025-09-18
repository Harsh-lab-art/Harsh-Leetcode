class Solution 
{
    public List<Integer> preorderTraversal(TreeNode root) 
    {
        List<Integer> res=new ArrayList<>();
        pre(root, res);
        return res;
    }
    public static void pre (TreeNode n , List<Integer> res)
    {
        if(n==null)
        return ;
        res.add(n.val);
        pre(n.left, res);
        pre(n.right, res);

    }
}
