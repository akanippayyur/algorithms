package com.app.algorithms.bst;

/**
 * Ref: http://www.geeksforgeeks.org/how-to-determine-if-a-binary-tree-is-balanced/
 * To check if a tree is height-balanced, get the height of left and right
 * subtrees. Return true if difference between heights is not more than 1 and
 * left and right subtrees are balanced, otherwise return false.
 * 
 * Access	Search	Insertion	Deletion
 * O(log(n))	O(log(n))	O(log(n))	O(log(n))
 * 
 * @author Anoop
 */
public class BalancedBST {

	public Node root;

	public static void main(String[] args) {
		BalancedBST binaryTree = new BalancedBST();
		binaryTree.root = new Node(10);
		binaryTree.root.left = new Node(20);
		binaryTree.root.left.left = new Node(30);
		binaryTree.root.left.right = new Node(60);
		binaryTree.root.right = new Node(50);
		binaryTree.root.right.left = new Node(20);
		binaryTree.root.right.right = new Node(90);
		binaryTree.root.right.right.right = new Node(100);
		binaryTree.root.right.right.right.right = new Node(120);
		binaryTree.root.right.right.right.right.right = new Node(150);

		binaryTree.print(binaryTree.root);

		System.out.println("Height: " + binaryTree.height(binaryTree.root));

		System.out.println("isBalanced: "
				+ binaryTree.isBalanced(binaryTree.root));
	}

	boolean isBalanced(Node root) {
		if (root == null) {
			return true;
		}

		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		if (Math.abs(rightHeight - leftHeight) <= 1
				&& (isBalanced(root.left) && isBalanced(root.right))) {
			return true;
		}

		return false;
	}

	int height(Node root) {
		if (root == null) {
			return 0;
		}

		return 1 + max(height(root.left), height(root.right));
	}

	private int max(int height1, int height2) {
		return (height1 <= height2) ? height2 : height1;
	}

	Node print(Node root) {
		if (root == null) {
			return null;
		}

		System.out.println(root.val);

		if (root.left != null) {
			print(root.left);
		}

		if (root.right != null) {
			print(root.right);
		}

		return root;
	}
}

class Node {
	public int val;
	public Node left = null, right = null;

	public Node(int val) {
		this.val = val;
	}
}
