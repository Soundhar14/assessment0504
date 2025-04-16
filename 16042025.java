// daily task 16.04.2025
//maximum depth of the binary tree (Leetcode No : 104)

class Maximum {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftSide = maxDepth(root.left);
        int rightSide = maxDepth(root.right);

        return 1 + Math.max(leftSide , rightSide);
    }
}

//path sum (Leetcode No : 112)

class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
       return depthFirst(root , targetSum);
    }

    public boolean depthFirst(TreeNode root , int sum){
        if(root == null){
            return false;
        }

        sum -=root.val;
        if(root.left == null && sum == 0 && root.right == null){
            return true;
        }

        return depthFirst(root.left, sum) || depthFirst(root.right , sum);
    }
}

//LevelOrder traversal (Leetcode No : 102)

class Traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<TreeNode>(); 
        List<List<Integer>> result = new LinkedList<List<Integer>>();

        if(root == null) return result;
        queue.offer(root);
        while(!queue.isEmpty()){
            int queuesiz = queue.size();
            List<Integer> temp = new LinkedList<>();
            for (int i = 0; i < queuesiz ; i++){
                if (queue.peek().left != null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right != null){
                    queue.offer(queue.peek().right);
                }
                temp.add(queue.poll().val);
            }
            result.add(temp);
        }
       return result; 
    }
}
