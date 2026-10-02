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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList();
        Stack<TreeNode> stack=new Stack<>();
        TreeNode current=root;
        if(root==null)
        {
            return list;
        }
        while(!stack.empty() || current!=null)
        {
            if(current!=null)
            {
                stack.push(current);
                current=current.left;
              
            }
            else 
            {
                current=stack.pop();
                list.add(current.val);
                current=current.right;
              
            }
        }
        return list;
    }
}