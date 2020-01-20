package demo;

import java.util.NoSuchElementException;

public class LinkedList {
	private class Node {
		private int value;
		private Node next;
		public Node(int value) {
			this.value = value;
		}
	}
	private Node first;
	private Node last;
	
	//addLast
	public void addLast(int item) {
		Node node = new Node(item);
		if(first == null) {
			first = last = node;
		}
		else {
			last.next = node;
			last = node;
		}
	}
	
	//addFirst
	public void addFirst(int item) {
		Node node = new Node(item);
		if(first == null) {
			first = last = node;
		}
		else {
			node.next = first;
			first = node;
		}
	}
	
	//indexOf
	public int indexOf(int item) {

		int index = 0;
		Node current = first;
		
		while(current != null) {
			if(current.value == item) return index;
			current = current.next;
			index++;
		}
		return -1;
	}
	
	//contains
	public boolean contains(int item) {
		boolean flag = false;
		Node current = first;
		
		while(current != null) {
			if(current.value == item) flag = true;
			current = current.next;
		}
		return flag;
	}
	
	//removeFirst
	public void removeFirst() {
		if(first == null) throw new NoSuchElementException();
		if(first == last) { 
			first = last = null; 
			return;
		}
		Node node = first.next;
		first.next = null;
		first = node;
	}

	//removeLast
	public void removeLast() {
		if(first == null) throw new NoSuchElementException();
		if(first == last) { 
			first = last = null; 
			return;
		}
		Node current = first;
		while(current.next != null) {
			if(current.next == last) {
				last = current;
				last.next = null;
			}
			current = current.next;
		}
		
		
	}
		
}
