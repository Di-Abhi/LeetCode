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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans =new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        Stack<List<Integer>> s = new Stack<>();
        q.offer(root);
        while(!q.isEmpty()){
            int item = q.size();
            List<Integer> res = new ArrayList<>();
            for(int i=0;i<item;i++){
                if(q.peek().left!=null)q.offer(q.peek().left);
                if(q.peek().right!=null)q.offer(q.peek().right);
                res.add(q.poll().val);
            }
            s.push(res);
        }
        while(!s.isEmpty()){
            ans.add(s.pop());
        }
        return ans;
    }
}