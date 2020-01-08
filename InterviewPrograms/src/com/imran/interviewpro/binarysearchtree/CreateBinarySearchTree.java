package com.imran.interviewpro.binarysearchtree;

public class CreateBinarySearchTree {

  public static void main(String[] args) {
    int arr[] = {7, 1, 10};
    createTree(arr, arr.length);
  }

  private static void createTree(int[] arr, int length) {

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
