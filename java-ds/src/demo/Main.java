package demo;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack1 = new Stack(5);
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		stack1.push(4);
		stack1.push(5);
		stack1.pop();
		stack1.pop();
	
		System.out.println(stack1);
	}
}
