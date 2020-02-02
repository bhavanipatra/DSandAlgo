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
	private int size = 0;
	
	public void addFirst(int item) {
		Node node = new Node(item);
		if(first == null) {
			first = last = node;
		}
		else {
			node.next = first;
			first = node;
		}
		size++;
		
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
		size++;
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
		size--;
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
		size--;
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
	
	public int getKthFromTheEnd(int k) {
		if(k <= 0) throw new NoSuchElementException();
		if(k > size) throw new IllegalArgumentException();
		int gap = (k-1);
		Node pointer1 = first;
		Node pointer2 = first;
		while(gap != 0) {
			pointer2 = pointer2.next;
			gap--;
		}
		while(pointer2.next != null) {
			pointer1 = pointer1.next;
			pointer2 = pointer2.next;
		}
		return pointer1.value;
	}

	//Exercise-1
	public void printMiddle() {
		if(first == null) throw new IllegalStateException();
		Node ahead = first;
		Node behind = first;
		int flag =0;
		while(ahead.next != null) {
			ahead = ahead.next.next;
			behind = behind.next;
			if(ahead.next != null && ahead.next.next == null) {
				flag = 1;
				break;
			}
		}
		if(flag == 1) System.out.println(behind.value+", "+behind.next.value);
		else System.out.println(behind.value);
	}
	
	//Exercise-2
	public void hasLoop() {
		Node slow;
		Node fast;
		slow = fast = first;
		while(slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				System.out.println("has Loop");
				return;
			}
			System.out.println("No Loop");
		}
	}
}

