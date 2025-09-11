class Solution {
    int count = 0;

    public int pathSum(TreeNode root, int targetSum) {
        helperPathSum(root, targetSum, new ArrayList<>());
        return count;
    }

    private void helperPathSum(TreeNode root, int targetSum, List<Integer> path) {
        if (root == null)
            return;

        path.add( root.val);
        long sum = 0;

        for (int i = path.size() - 1; i >= 0; i--) {
            sum += path.get(i);
            if (sum == targetSum)
                count++;
        }

        helperPathSum(root.left, targetSum, path);
        helperPathSum(root.right, targetSum, path);

        path.remove(path.size() - 1);
    }
}
