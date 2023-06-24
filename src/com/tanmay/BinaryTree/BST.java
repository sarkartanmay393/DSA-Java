package com.tanmay.BinaryTree;

public class BST {
    public BST() {
    }

    class Node {
        int value;
        Node left;
        Node right;
        int height;

        public Node(int v) {
            this.value = v;
            if (this.left != null) {
                this.height = this.left.height + 1;
            } else if (this.right != null) {
                this.height = this.right.height + 1;
            } else {
                this.height = 0;
            }
        }

        public int getValue() {
            return this.value;
        }

        public int getHeight() {
            return this.height;
        }
    }

    Node root;

    public void insert(int value) {
        insert(value, this.root);
    }

    private void insert(int value, Node root) {
        if (this.root == null) {
            this.root = new Node(value);
        }
        if (value < root.value) {
            if (root.left == null) {
                root.left = new Node(value);
            } else {
                insert(value, root.left);
            }
        }

        if (value > root.value) {
            if (root.right == null) {
                root.right = new Node(value);
            } else {
                insert(value, root.right);
            }
        }
    }

    public void populate(int[] nums) {
        populate(nums, this.root);
    }

    private void populate(int[] nums, Node root) {
        for (int i = 0; i < nums.length; i++) {
            insert(nums[i]);
        }
    }

    public void display() {
        display(this.root, 0);
    }

    private void display(Node root, int level) {
        System.out.print(root.getValue() + "\t");
        if (level != 0) {
            System.out.println("\t" + root.getValue() + "\t");
        }
        if (root.left != null) {
            display(root.left, level);
        }

        if (root.right != null) {
            display(root.right, level++);
        }
    }

}
