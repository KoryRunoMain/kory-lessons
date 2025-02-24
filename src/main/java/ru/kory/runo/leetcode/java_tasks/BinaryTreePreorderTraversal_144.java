package ru.kory.runo.leetcode.java_tasks;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal_144 {
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
     List<Integer> result = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        saveResult(root);
        return result;
    }

    public void saveResult(TreeNode root) {
        if(root != null) {
            result.add(root.val);
            saveResult(root.left);
            saveResult(root.right);
        }
    }


}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
    }

}
