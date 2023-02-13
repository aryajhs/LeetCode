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
    private boolean isValid(TreeNode p,TreeNode q){
        if(p==null && q==null)
            return true;
        if(p==null || q==null || p.val!=q.val)
            return false;
        return isValid(p.left,q.right)&&isValid(p.right,q.left);
        
    }
    public boolean isSymmetric(TreeNode root) {
        return this.isValid(root.left,root.right);
    }
}