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
    public int maxLevelSum(TreeNode root) {
        int level=0;
        int maxLevel=0;
        int maxSum=Integer.MIN_VALUE;
        if(root==null)return level;
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> listSum= new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int len=q.size();
            int sum=0;
            for(int i=0;i<len;i++){
                TreeNode node = q.poll();
                sum+=node.val;
                if(node.left!=null)q.offer(node.left);
                if(node.right!=null)q.offer(node.right);
            }
            level++;
            listSum.add(sum);
            maxSum=Math.max(sum,maxSum);
            sum=0;
        }
        for(int i=0;i<listSum.size();i++){
            if(listSum.get(i)==maxSum){
                maxLevel=i;
                break;
            }
        }
        return maxLevel+1;
    }
}