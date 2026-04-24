package main.java.leetcode.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree {
    public TreeNode invertTreeIterative(TreeNode root) {
        // Iterative Solution
        if(root == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode current = queue.poll();

            //swap
            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;

            if(current.left != null) queue.add(current.left);
            if(current.right != null) queue.add(current.right);
        }
        return root;
    }

    // Recursive Solution
    public TreeNode invertTreeRecursive(TreeNode root) {
        if(root == null) return null;

        TreeNode left = invertTreeRecursive(root.left);
        TreeNode right = invertTreeRecursive(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}
