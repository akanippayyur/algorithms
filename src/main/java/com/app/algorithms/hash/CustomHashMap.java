package com.app.algorithms.hash;

public class CustomHashMap {

	private int size;

	private CustomHashEntry[] head;

	public CustomHashMap() {
		size = 0;

	}

	public void put(String key, int val) {
		int hashKey = hashKey(key);
		if (head[hashKey] == null)
            head[hashKey] = new CustomHashEntry(key, val);
        else 
        {
        	CustomHashEntry entry = head[hashKey];
        	while(entry.next != null) {
        		entry = entry.next;
        	}
        	
        	if(entry != null) {
        		entry.next = new CustomHashEntry(key, val);
        	}
        }
		size++;
	}

	private int hashKey(String key) {
		return Integer.parseInt(key) % Integer.MAX_VALUE;
	}
}