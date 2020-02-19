package demo;

import java.util.Arrays;
import java.util.EmptyStackException;

//Stacks Exercise 3
public class Stack {
	
	private int count = 0;
	private int[] array;
	
	public Stack(int size) {
		this.array = new int[size];
	}
	
	public void push(int e) {
		if(this.isFull()) this.resizeArray();
		this.array[this.count] = e;
		this.count++;
	}
	
	public int pop() {
		if(this.isEmpty()) throw new EmptyStackException();
		int popElement = this.array[this.count-1];
		this.count--;
		return popElement;
	}

	public int peek() {
		if(this.isEmpty()) throw new EmptyStackException();

		return this.array[this.count-1];
	}
	
	public boolean isEmpty() {
		return (this.count == 0);
	}
	
	@Override
	public String toString() {
		int[] actualArray = Arrays.copyOfRange(array, 0, this.count);
		return Arrays.toString(actualArray);
	}
	
	private boolean isFull() {
		return (this.count == this.array.length);
	}
	
	private void resizeArray() {
		int[] newArray = new int[this.array.length*2];
		for(int i=0; i<this.array.length; i++) {
			newArray[i] = this.array[i];
		}
		this.array = newArray;
	}
}

