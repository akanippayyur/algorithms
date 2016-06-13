package com.app.algorithms.hash;

public class CustomHashEntry {

	private String key;
	
	private int val;

	CustomHashEntry next;

	public CustomHashEntry() {
		// TODO Auto-generated constructor stub
	}

	public CustomHashEntry(String key, int val) {
		this.val = val;
		this.key = key;
		this.next = null;
	}

	
}
