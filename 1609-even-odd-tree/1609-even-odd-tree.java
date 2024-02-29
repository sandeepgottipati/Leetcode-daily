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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode>queue=new LinkedList<>();
        
        queue.offer(root);
        int level=0;
        while(!queue.isEmpty()){
            
            int currlen=queue.size();
            int prev=Integer.MIN_VALUE;
            for(int i=0;i<currlen;i++){
                TreeNode curr=queue.poll();
                if(i==0 ){
                    if(level%2==0 && curr.val%2!=1){
                        return false;
                    }
                    if(level%2==1 && curr.val%2!=0){
                        return false;
                    }
                    
                    
                }
                else{
                    if(level%2==0 && (curr.val%2==0 || curr.val<=prev)){
                        return false;
                    }
                    if(level%2==1 && (curr.val%2==1|| curr.val>=prev)){
                        return false;
                    }
                }
                if(curr.left!=null)queue.offer(curr.left);
                if(curr.right!=null)queue.offer(curr.right);
                prev=curr.val;
                
            }
            level++;
        }
        return true;
        
    }
    
}