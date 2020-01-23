package demo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array list = new Array(4);
		list.display();
		list.insert(4);
		list.insert(2);
		list.insert(4);
		list.insert(5);
		list.display();
		System.out.println(list.indexOf(4));
	}
}
