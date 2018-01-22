import java.util.*;

public class BTMaxPathSum {
	int result;
    public int maxPathSum(TreeNode root) {
        result = Integer.MIN_VALUE;
        if(root == null) return 0;
        helper(root);
        return result;
    }
    public int helper(TreeNode node){
        if(node == null) return 0;
        int left = Math.max(0, helper(node.left));
        int right = Math.max(0, helper(node.right));
        result = Math.max(result, left + right + node.val);
        return Math.max(left, right) + node.val;
    }
}
