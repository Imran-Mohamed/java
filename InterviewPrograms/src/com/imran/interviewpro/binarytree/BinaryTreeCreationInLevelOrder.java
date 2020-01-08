package com.imran.interviewpro.binarytree;

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
    int arr[] = {1, 2, 3};
    b.root = b.levelOrderCreation(arr, b.root, 0);
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
