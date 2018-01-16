import java.util.*;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BinarySearchTreeIterator {
    
    TreeNode current;
    Stack<TreeNode> stack;

    public BinarySearchTreeIterator(TreeNode root) {
        current = root;
        stack = new Stack<>();
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(!stack.isEmpty() || current != null) return true;
        return false;
    }

    /** @return the next smallest number */
    public int next() {
        while(current != null){
            stack.push(current);
            current = current.left;
        }
        current = stack.pop();
        int val = current.val;
        current = current.right;
        return val;
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */