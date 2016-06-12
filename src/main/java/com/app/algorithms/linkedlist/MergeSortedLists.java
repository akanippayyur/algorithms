package com.app.algorithms.linkedlist;

/**
 * Ref: http://www.geeksforgeeks.org/merge-two-sorted-linked-lists/
 * @author Anoop
 */
public class MergeSortedLists {

	public static void main(String[] args) {
		MergeSortedNode node1 = new MergeSortedNode();
		node1.add(700);
		node1.add(890);
		node1.add(9000);
		
		//node1.print();
		
		MergeSortedNode node2 = new MergeSortedNode();
		node2.add(40);
		node2.add(50);
		node2.add(60);
		
		//node2.print();
		
		mergeSortedNodes(node1, node2).print();
	}

	private static MergeSortedNode mergeSortedNodes(MergeSortedNode node1,
			MergeSortedNode node2) {
		MergeSortedNode output = null;
		if(null == node1) {
			return node2;
		}  
		
		if(null == node2) {
			return node1;
		}
		
		if(node1.val <= node2.val) {
			output = node1;
			output.next = mergeSortedNodes(node1.next, node2);
		} else {
			output = node2;
			output.next = mergeSortedNodes(node1, node2.next);
		}
		
		return output;
	}
}

class MergeSortedNode {

	MergeSortedNode next;
	int val;
	
	public MergeSortedNode(int val) {
		this.val = val;
	}

	public MergeSortedNode() {
	}
	
	void add(int val) {
		MergeSortedNode tailNode = this;
		MergeSortedNode node = new MergeSortedNode(val);
		
		
		while(tailNode.next != null) {
			tailNode = tailNode.next;
		}

		tailNode.next = node;
	}
	
	void print() {
		MergeSortedNode tailNodes = this;
		while(tailNodes != null) {
			if(tailNodes.val != 0) {
				System.out.println(tailNodes.val);
			}
			tailNodes = tailNodes.next;
		}
	}
}