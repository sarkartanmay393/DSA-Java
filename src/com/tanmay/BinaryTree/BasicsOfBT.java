package com.tanmay.BinaryTree;

import java.util.Scanner;

public class BasicsOfBT {
    public static void main(String[] args) {

        BinaryTree<String> familyTree = new BinaryTree<String>();
        familyTree.populate(new Scanner(System.in));
        System.out.println("It\'s time to look our tree...");
        // familyTree.prettyDisplay();
    }
}

// A binary tree is a rooted tree in which every node has at most two children.
// I'm making it Generic support.
class BinaryTree<T> {

    public BinaryTree() {
    }

    private class Node<T> {
        Object value;
        Node<T> leftNode;
        Node<T> rightNode;

        public Node(Object val) {
            this.value = val;
        }

        // @Override
        // public String toString() {
        // return "" + value;
        // }
    }

    private Node<T> root;

    public void populate(Scanner scanner) {
        System.out.println("Enter the root node value: ");
        Object val = scanner.nextLine();
        this.root = new Node(val);
        populate(this.root, scanner);
    }

    private void populate(Node<T> node, Scanner scanner) {
        // System.out.println("Do you want to enter the left child of " + node.value + "
        // ?");
        // boolean goLeft = scanner.nextBoolean();
        // if (goLeft) {
        System.out.println("Enter value of the left child " + node.value + " : ");
        Object val = scanner.nextLine();
        if (!val.toString().isEmpty()) {
            node.leftNode = new Node(val);
            populate(node.leftNode, scanner);
        }
        // }
        // boolean goRight = scanner.nextBoolean();
        // if (goRight) {
        System.out.println("Enter value of the right child " + node.value + " : ");
        Object val2 = scanner.nextLine();
        if (!val2.toString().isEmpty()) {
            node.rightNode = new Node(val2);
            populate(node.rightNode, scanner);5
        }
        // }
    }

    public void display() {
        display(this.root, "");
    }

    private void display(Node<T> node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.leftNode, indent + "\t");
        display(node.rightNode, indent + "\t");

    }

    // public void prettyDisplay() {
    //     prettyDisplay(this.root, 0);
    // }

    // private void prettyDisplay(Node<T> node, int level) {
    //     if (node == null) {
    //         return;
    //     }

    //     prettyDisplay(node.rightNode, level + 1);

    //     if (level != 0) {
    //         for (int i = 0; i < level - 1; i++) {
    //             System.out.print("|\t\t");
    //         }
    //         System.out.println("|------->" + node.value);
    //     } else {
    //         System.out.println(node.value);
    //     }
    //     prettyDisplay(node.leftNode, level + 1);
    // }

}
