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
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode>s1=new Stack<>();
        Stack<TreeNode>s2=new Stack<>();
        List<Integer> list=new ArrayList();
        if(root==null)
        {
            return list;
        }
        s1.push(root);
        while(!s1.empty())
        {
            root=s1.pop();
            s2.add(root);
            if(root.left!=null)
            {
                s1.push(root.left);
            }
            if(root.right!=null)
            {
                s1.push(root.right);
            }
        }
        while(!s2.empty())
        {
            list.add(s2.pop().val);
        }
        return list;

    }
}