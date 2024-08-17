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
    private int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        sumbst(root,low,high);
        return sum;
    }
    public void sumbst(TreeNode root, int low,int high)
    {
        if(root==null) return;
        if(root.val<low) sumbst(root.right,low,high);
        else if(root.val>high) sumbst(root.left,low,high);
        else{
            sum=sum+root.val;
            sumbst(root.left,low,high);
            sumbst(root.right,low,high);
        }
    }
}
