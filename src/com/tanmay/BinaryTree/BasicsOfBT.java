package com.tanmay.BinaryTree;

import java.util.Scanner;

public class BasicsOfBT {
    public static void main(String[] args) {

        BinaryTree familyTree = new BinaryTree();
        familyTree.populate(new Scanner(System.in));
        System.out.println("\nIt\'s time to look our tree...");
        familyTree.display();
        familyTree.prettyDisplay();
    }
}

class BinaryTree {

    public BinaryTree() {
    }

    private class Node {
        int value;
        Node leftNode;
        Node rightNode;

        public Node(int val) {
            this.value = val;
        }
    }

    private Node root;

    public void populate(Scanner scanner) {
        System.out.println("Enter the root node value: ");
        int val = scanner.nextInt();
        this.root = new Node(val);
        populate(this.root, scanner);
    }

    private void populate(Node node, Scanner scanner) {
        System.out.println("Do you want to enter the left child of " + node.value + "?" + "\t(true/false)");
        boolean goLeft = scanner.nextBoolean();
        if (goLeft) {
            System.out.println("Enter value of the left child " + node.value + " : ");
            int val = scanner.nextInt();
            node.leftNode = new Node(val);
            populate(node.leftNode, scanner);
        }
        System.out.println("Do you want to enter the right child of " + node.value + "?" + "\t(true/false)");
        boolean goRight = scanner.nextBoolean();
        if (goRight) {
            System.out.println("Enter value of the right child " + node.value + " : ");
            int val2 = scanner.nextInt();
            node.rightNode = new Node(val2);
            populate(node.rightNode, scanner);
        }
    }

    public void display() {
        display(this.root, "Root");
    }

    private void display(Node node, String detail) {
        if (node == null) {
            return;
        }
        System.out.println(detail + " : " + node.value);
        display(node.leftNode, "Left of " + node.value);
        display(node.rightNode, "Right of " + node.value);
    }

    public void prettyDisplay() {
        prettyDisplay(this.root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.rightNode, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }
        prettyDisplay(node.leftNode, level + 1);
    }

}
