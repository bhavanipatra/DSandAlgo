package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StacksExercise {
	
	//Exercise 1: Reversing a string using Stack
	public void printReverseString(String givenString) {
		String reversedString = "";
		char[] array1 = givenString.toCharArray();
		Stack stack1 = new Stack();
		
		for(char c: array1) {
			stack1.push(c);
		}
		for(int i=0; i<array1.length; i++) {
			reversedString += stack1.pop();
		}
		System.out.println(reversedString);
	}
	
	//Exercise 2: Check balanced expression or not
	public boolean checkIfBalanced(String givenInput) {
		Stack<Object> stack = new Stack<Object>();
		Boolean balanceFlag = true;
		List list1 = Arrays.asList('(','{','[','<');
		List list2 = Arrays.asList(')','}',']','>');
		
		char[] charArray = givenInput.toCharArray();
		
		for(char c: charArray) {
			if(list1.contains(c)) stack.push(c);
			else if(list2.contains(c)) {
				if(list2.indexOf(c) != list1.indexOf(stack.pop())) {
					balanceFlag = false;
				}
			}
		}
		return balanceFlag;
	}
}

