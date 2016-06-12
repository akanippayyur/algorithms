package com.app.algorithms.linkedlist;

/**
 * Custom Implementation for a Linked List
 * 
 * @author Anoop
 */
public class LinkedList {

	public static void main(String[] args) {
		Node node = new Node();
		node.add(10);
		node.add(20);
		node.add(30);

		node.print();
		
		node.deleteNode(20, node);
	}
}

class Node {

	Node next = null;
	int val;

	public Node() {
	}

	public Node(int val) {
		this.val = val;
	}
	
	void print() {
		Node tailNodes = this;
		while(tailNodes != null) {
			System.out.println(tailNodes.val);
			tailNodes = tailNodes.next;
		}
	}

	public void add(int val) {
		Node node = new Node(val);

		Node tailNode = this;
		while (tailNode.next != null) {
			tailNode = tailNode.next;
		}

		tailNode.next = node;
	}

	/**
	 * Set the value of the node next to the current node to the current node
	 * @param currentNodeToBeDeleted
	 */
	public void deleteNode(Node currentNodeToBeDeleted) {
		Node tmpNode = currentNodeToBeDeleted.next;
		currentNodeToBeDeleted.val = tmpNode.val;
		currentNodeToBeDeleted.next = tmpNode.next;
	}

	public Node deleteNode(int val, Node head) {
		Node node = head;
		boolean isFound = false;

		// If the head node is the value which needs to be deleted
		if (node.val == val) {
			isFound = true;
			return head.next;
		}

		// Else, iterate and find out the value, and delete it by assigning the
		// link from the previous node to the next node.
		while (node.next != null) {
			if (node.next.val == val) {
				isFound = true;
				node.next = node.next.next;
			}

			node = node.next;
		}

		System.out.println(isFound);
		return head;
	}
}