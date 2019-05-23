package com.cp.basictree;

import java.util.ArrayList;

public class BasicTree {

    public static void main(String args[]){
        Node eight = new Node(8,null,null);
        Node nine = new Node(9,null,null);
        Node ten = new Node(10,null,null);
        Node eleven = new Node(11,null, null);
        Node twelve = new Node(12,null,null);
        Node zero = new Node(0,null,null);
        Node fifteen = new Node(15,null,zero);

        Node four = new Node(4,eight,nine);
        Node five = new Node(5,ten,eleven);
        Node six = new Node(6,twelve,null);
        Node seven = new Node(7,null,fifteen);

        Node two = new Node(2,four,five);
        Node three = new Node(3,six,seven);

        Node root = new Node(1,two,three);

        System.out.println("InOrder :");
        printInOrder(root);
        System.out.println();
        System.out.println("PreOrder :");
        printPreOrder(root);
        System.out.println();
        System.out.println("PostOrder :");
        printPostOrder(root);
        System.out.println();
        System.out.println("LevelOrder :");
        levelTraversing(root);

    }

    private static void printInOrder(Node root){
        if(root != null){
            printInOrder(root.getLeftChild());
            System.out.print(root.getValue() + " ");
            printInOrder(root.getRightChild());
        }
    }

    private static void printPreOrder(Node root){
        if(root != null){
            System.out.print(root.getValue() + " ");
            printPreOrder(root.getLeftChild());
            printPreOrder(root.getRightChild());
        }
    }

    private static void printPostOrder(Node root){
        if(root != null){
            printPostOrder(root.getLeftChild());
            printPostOrder(root.getRightChild());
            System.out.print(root.getValue() + " ");
        }
    }

    private static void levelTraversing(Node root){
        ArrayList<Node> currentLevelNode = new ArrayList<Node>();
        ArrayList<Node> temp;
        currentLevelNode.add(root);
        while(currentLevelNode != null && currentLevelNode.size() > 0){
            temp = new ArrayList<Node>();

            for(Node n : currentLevelNode){
                if(n != null){
                    System.out.print(n.getValue() + " ");
                    temp.add(n.getLeftChild());
                    temp.add(n.getRightChild());
                }
            }
            currentLevelNode = temp;
        }


    }

}

class Node{
    int value;
    Node leftChild;
    Node rightChild;

    public Node(int value, Node leftChild, Node rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
