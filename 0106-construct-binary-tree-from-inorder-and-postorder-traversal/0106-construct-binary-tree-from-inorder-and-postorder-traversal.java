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
    int postIndex;
    HashMap<Integer,Integer> hm;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex=postorder.length-1;
        hm=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }
        return helper(inorder,postorder,0,inorder.length-1);
    }
    TreeNode helper(int[] inorder,int[] postorder,int start,int end){
        if(start>end) return null ;
        if(postIndex<0)return null;
        TreeNode root=new TreeNode(postorder[postIndex--]);
        int Index=hm.get(root.val);
        root.right=helper(inorder,postorder,Index+1,end);
        root.left=helper(inorder,postorder,start,Index-1);
        
        return root;
        
    }
}