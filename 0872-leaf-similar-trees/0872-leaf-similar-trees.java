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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arr1=new ArrayList<>();
     
       ArrayList<Integer> arr2=new ArrayList<>();
        helper(root1,arr1);
         helper(root2,arr2);
      return  (arr1.size() == arr2.size()) && 
                           IntStream.range(0, arr1.size())
                                    .allMatch(index -> arr1.get(index).equals(arr2.get(index)));

    }
    void helper(TreeNode root, ArrayList<Integer>arr1){
        if(root==null)return;
        if(root.left==null && root.right==null){
            arr1.add(root.val);
            return;
        }
        helper(root.left,arr1);
        helper(root.right,arr1);
        
    }
//     boolean checker(TreeNode root, ArrayList<Integer>arr2){
//         if(root==null)return false;
//             if(root.right==null && root.left==null){
//                             if(root.val==queue.peek()){
//                                 arr2.poll();
//                                 return true;
//                             }else{
//                                 return false;
//                             }
//         }
//         return checker(root.left,queue) || checker(root.right,queue);
        
//     }
}