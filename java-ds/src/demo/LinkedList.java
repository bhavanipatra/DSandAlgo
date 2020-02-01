package demo;

import java.util.ArrayList;
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
	
	public void addLast(int item) {
		Node node = new Node(item);
		if(first == null) {
			first = last = node;
		}
		else {
			last.next = node;
			last = last.next;
		}
	}
	
	public void deleteFirst() {
		if(first == null) {
			throw new NoSuchElementException();
		}
		else {
			Node node = first.next;
			first.next = null;
			first = node;
		}
	}
	
	public void deleteLast() {
		if(first == null) throw new NoSuchElementException();
		if(first == last) {
			first = last = null;
			return;
		}
		Node cNode = first;
		while(cNode != last) {
			cNode = cNode.next;
		}
		cNode.next = null;
		last = cNode;
	}
	
	public boolean contains(int item) {
		boolean flag = false;
		Node cNode = first;
		
		if(first == null) throw new NoSuchElementException();
		if(first.value == item) return true;
		
		while(cNode.next != null) {
			if(cNode.value == item) flag = true;
		}
		return flag;
	}
	
	public int indexOf(int item) {

		int index=0;
		if(first == null) throw new NoSuchElementException();
		Node cNode = first;
		while(cNode.next != null) {
			index++;
			cNode = cNode.next;
		}
		
		return index;
	}
	
	public ArrayList<Integer> toArray() {
		if(first == null) throw new NoSuchElementException();
		ArrayList<Integer> list = new ArrayList<Integer>();
		Node current = first;
		
		while(current != null) {
			list.add(current.value);
			current = current.next;
		}
		return list;
	}
	
	public void reverse() {
		if(first == null) throw new NoSuchElementException();
		Node previous = null;
		Node current = first;
		Node temp =first.next;
		
		while(current != null) {
			temp = current.next;
			current.next = previous;
			previous = current;
			current = temp;
		}
		last = first;
		first = previous;
	}
}

