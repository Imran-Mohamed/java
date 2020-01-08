package com.imran.interviewpro.binarytree;

import java.util.LinkedList;
import java.util.Queue;

/*
   input : arr[] = {1,2,3,4,5,6}
   output: 1
          / \
         2   3
        / \ /
        4 5 6
*/
public class BinaryTreeCreationInLevelOrder {
  Node root;

  public static void main(String[] args) {
    BinaryTreeCreationInLevelOrder b = new BinaryTreeCreationInLevelOrder();
    int arr[] = {1, 2, 3, 4, 5};
    b.root = b.levelOrderCreation(arr, b.root, 0);
    levelOrderTraversal(b.root);
    System.out.println();
    inorderTraversal(b.root);
    System.out.println();
    preOrderTraversal(b.root);
    System.out.println();
    postOrderTraversal(b.root);
  }

  private static void preOrderTraversal(Node root) {
    if(root != null){
      System.out.print(root.data+" ");
      preOrderTraversal(root.left);
      preOrderTraversal(root.right);
    }
  }

  private static void inorderTraversal(Node root) {
    if(root != null){
      preOrderTraversal(root.left);
      System.out.print(root.data+" ");
      preOrderTraversal(root.right);
    }
  }

  private static void postOrderTraversal(Node root) {
    if(root != null){
      preOrderTraversal(root.left);
      preOrderTraversal(root.right);
      System.out.print(root.data+" ");
    }
  }

  private static void levelOrderTraversal(Node root) {
    if (null == root) return;
    Queue<Node> q = new LinkedList();
    q.add(root);
    while (!q.isEmpty()) {
      Node temp = q.poll();
      System.out.print(temp.data + " ");
      if (temp.left != null) {
        q.add(temp.left);
      }
      if (temp.right != null) {
        q.add(temp.right);
      }
    }
  }

  private Node levelOrderCreation(int[] arr, Node root, int i) {
    int n = arr.length;
    if (i < n) {
      Node temp = new Node(arr[i]);
      root = temp;
      root.left = levelOrderCreation(arr, root.left, 2 * i + 1);
      root.right = levelOrderCreation(arr, root.right, 2 * i + 2);
    }
    return root;
  }

  class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }
}
