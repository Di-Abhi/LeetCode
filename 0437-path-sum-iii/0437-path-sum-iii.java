class Solution {
    int count = 0;

    public int pathSum(TreeNode root, int targetSum) {
        helperPathSum(root, (long) targetSum, new ArrayList<>());
        return count;
    }

    private void helperPathSum(TreeNode root, long targetSum, List<Long> path) {
        if (root == null)
            return;

        path.add((long) root.val);
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
