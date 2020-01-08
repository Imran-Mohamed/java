package com.imran.interviewpro.binarysearchtree;

public class CreateBinarySearchTree {
  static Node root;

  public static void main(String[] args) {
    BST b = new BST();
    Node root = null;
    // 8,3,6,10,4,7,1,14,13
    root = b.insert(root, 8);
    root = b.insert(root, 3);
    root = b.insert(root, 6);
    root = b.insert(root, 10);
    root = b.insert(root, 7);
    root = b.insert(root, 1);
    root = b.insert(root, 14);
    root = b.insert(root, 13);
  }
}

class Node {
  Node left;
  Node right;
  int val;

  public Node(int val) {
    this.val = val;
    this.left = null;
    this.right = null;
  }
}

class BST {

  public Node createNewNode(int val) {
    Node node = new Node(val);
    return node;
  }

  public Node insert(Node node, int val) {
    if (node == null) {
      return createNewNode(val);
    }
    if(val < node.val){
      node.left = insert(node.left, val);
    }else if(val > node.val) {
      node.right = insert(node.right, val);
    }
    return node;
  }
}
