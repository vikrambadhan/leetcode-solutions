package main.java.leetcode.binarytree;

public class DiameterOfBinaryTree {
    int diameter =0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    public int height(TreeNode node){
        if(node == null){
            return 0;
        }

        int left = height(node.left);
        int right = height(node.right);

        diameter = Math.max(diameter, left + right);
        return 1 + Math.max(left, right);
    }
}
