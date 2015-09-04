/**
 * 
 */
package com.app.algorithms.bst;

import com.app.algorithms.search.Node;

/**
 * Checks if the given tree is a Binary Search Tree
 * @author akanippayyur
 */
public class CheckIfABST {

	public boolean isABST(Node node, int minVal, int maxVal) {
		if (node == null) {
			return true;
		}

		/**
		 * The reason for maintaining the minimum value is to see if there is
		 * any node which is less than the immediate parent and greater than the
		 * grandparent node
		 * 
		 * 			  30
		 * 		20			60
		 * 10		100	20		90
		 * 
		 *  Even though 100 is greater than 20, that node needs to be less than 30 in order to become a BST
		 */
		if (node.value > minVal && isABST(node.left, minVal, Math.min(node.left.value, maxVal))) {
			return true;
		}

		/**
		 * The reason for maintaining the minimum value is to see if there is
		 * any node which is less than the immediate parent and less than the
		 * grandparent node
		 * 
		 * 			  30
		 * 		20			60
		 * 10		100	20		90
		 * 
		 *  Even though 20 is greater than 60, that node need to be greater than 30 in order to become a BST
		 */
		if (node.value > maxVal && isABST(node.right, Math.max(node.right.value, minVal), maxVal)) {
			return true;
		}

		return false;
	}
}
