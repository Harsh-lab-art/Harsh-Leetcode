class TreeNode
  {
    int val;
    TreeNode left,right;
    TreeNode(int data)
    {
      val=data;
      left=null;
      right=null;
    }
  }
class Solution 
{
  public static boolean isTrue(TreeNode ls,TreeNode rs)
  {
    if(ls==null && rs==null)
    {
      return true;
    }
    if(ls==null||rs==null)
    {
      return false;
    }
    return (ls.val==rs.val) && isTrue(ls.left,rs.right) && isTrue(ls.right,rs.left);
  }
  public boolean isSymmetric(TreeNode root)
  {
    if(root==null)
    {
      return true;
    }
    return(root.left,root.right);
  }
}
