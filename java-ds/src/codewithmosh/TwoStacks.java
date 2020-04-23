package codewithmosh;

import java.util.Arrays;
import java.util.EmptyStackException;

public class TwoStacks {
	
	private int count = 0;
	private int c1 = 0;
	private int c2 = 1;
	private int[] array;
	
	public TwoStacks() {
		this.array = new int[5];
	}
	
	public void push1(int e) {
		if(this.isFull1()) this.resizeArray();
		this.array[this.c1] = e;
		this.count++;
		this.c1 = this.c1+2;
	}
	
	public void push2(int e) {
		if(this.isFull2()) this.resizeArray();
		this.array[this.c2] = e;
		this.count++;
		this.c2 = this.c2+2;
	}
	
	public int pop1() {
		if(this.isEmpty1()) throw new EmptyStackException();
		int popElement = this.array[this.c1-2];
		this.c1 = this.c1-2;
		this.count --;
		return popElement;
	}
	
	public int pop2() {
		if(this.isEmpty2()) throw new EmptyStackException();
		int popElement = this.array[this.c2-2];
		this.c2 = this.c2-2;
		this.count--;
		return popElement;
	}

	public int peek1() {
		if(this.isEmpty1()) throw new EmptyStackException();

		return this.array[this.c1-2];
	}
	
	public int peek2() {
		if(this.isEmpty2()) throw new EmptyStackException();

		return this.array[this.c2-2];
	}
	
	public boolean isEmpty1() {
		return (this.c1 == 0);
	}
	
	public boolean isEmpty2() {
		return (this.c2 == 1);
	}
	
	@Override
	public String toString() {
		int[] actualArray = Arrays.copyOfRange(array, 0, this.c2-1);
		return Arrays.toString(actualArray);
	}
	
	public boolean isFull1() {
		return (this.c1 == this.array.length-1);
	}
	
	public boolean isFull2() {
		return (this.c2 == this.array.length-2);
	}
	
	private void resizeArray() {
		int[] newArray = new int[this.array.length*2];
		for(int i=0; i<this.array.length; i++) {
			newArray[i] = this.array[i];
		}
		this.array = newArray;
	}
}