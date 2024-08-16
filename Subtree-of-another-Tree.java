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
class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subroot)
    {
         if(root==null && subroot==null) return true;
        if(root==null || subroot==null) return false;
        if(root.val==subroot.val)
        {
            if(istree(root,subroot)) return true;
        }
        return isSubtree(root.left,subroot) || isSubtree(root.right,subroot);
    }
    public boolean istree(TreeNode root, TreeNode subroot) {
        if(root==null && subroot==null) return true;
        if(root==null || subroot==null) return false;
        if(root.val==subroot.val)
        {
            return istree(root.left,subroot.left) && istree(root.right,subroot.right);
        }
        return false;
    }
    
}
