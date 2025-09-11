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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans= new ArrayList<>();
        dfs(root,targetSum,0,ans,new ArrayList<>());
        return ans;
    }
    private void dfs(TreeNode root,int target,int sum,List<List<Integer>> ans,List<Integer> curr){
        if(root==null) return;

        sum+=root.val;
        curr.add(root.val);

        if(root.left==null&&root.right==null&&sum==target){
            ans.add(new ArrayList<>(curr));
        }

        dfs(root.left,target,sum,ans,curr);
        dfs(root.right,target,sum,ans,curr);

        curr.remove(curr.size()-1);
    }
}