package demo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array list1 = new Array(5);
		Array list2 = new Array(7);
		
		list1.insert(1);
		list1.insert(2);
		list1.insert(3);
		list1.insert(4);
		list1.insert(5);
		System.out.print("List1: ");
		list1.display();
		
		list2.insert(4);
		list2.insert(5);
		list2.insert(6);
		list2.insert(7);
		list2.insert(8);
		list2.insert(9);
		list2.insert(10);
		System.out.print("List2: ");
		list2.display();
		
		System.out.println("Intersection:");
		list1.intersect(list2).display();
		
		System.out.println("Reverse of List1:");
		list1.reverse();
		list1.display();
		
		System.out.println("Adding element at the end of List 2: ");
		list2.insertAt(99, 7);
		list2.display();
	}
}
