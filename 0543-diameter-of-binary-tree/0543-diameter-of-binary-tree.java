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
    
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        int diameter=height(root.left)+height(root.right);
        int leftdiameter=diameterOfBinaryTree(root.left);
        int rightdiameter=diameterOfBinaryTree(root.right);
        
        return Math.max(diameter,Math.max(leftdiameter,rightdiameter));

    }
    int height(TreeNode root){
            if(root==null) return 0;
            int leftHeight=height(root.left);
        int rightHeight=height(root.right);
    
        return 1+Math.max(leftHeight,rightHeight);
    }
}