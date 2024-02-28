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
    // find the root from preorder using index increment.
    // what node lies in the left or right from the inorder list.
    // check for the base condition. when (start>end)return null;
    HashMap<Integer,Integer> hm;
    static int currIndex;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
      hm=  new HashMap<>();
        currIndex=0;
        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
}
        return helper(preorder,inorder,0,preorder.length-1);
    }
    
    private TreeNode helper(int[]preorder,int []inorder,int start,int end){
        if(start>end){
            return null;
        }
        TreeNode root=new TreeNode(preorder[currIndex++]);
        int index=hm.get(root.val);
        root.left=helper(preorder,inorder,start,index-1);
        root.right=helper(preorder,inorder,index+1,end);
        return root;
    }
}