class Solution 
{
    private List<Integer> sortedNodes = new ArrayList<>();

    public TreeNode balanceBST(TreeNode root) 
    {
       
        inOrder(root);
        
      
        return buildBalancedTree(0, sortedNodes.size() - 1);
    }

    private void inOrder(TreeNode node) 
    {
        if (node == null) return;
        
        inOrder(node.left);
        sortedNodes.add(node.val);
        inOrder(node.right);
    }

    private TreeNode buildBalancedTree(int start, int end) 
    {
        if (start > end) return null;

       
        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(sortedNodes.get(mid));

        
        node.left = buildBalancedTree(start, mid - 1);
        node.right = buildBalancedTree(mid + 1, end);

        return node;
    }
}
