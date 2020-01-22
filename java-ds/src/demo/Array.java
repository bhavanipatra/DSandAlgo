package demo;

public class Array {
	
	private int[] list;
	private int count = 0;
	
	public Array(int len) {
		this.list = new int[len];
	}
	
	public void insert(int item) {
		this.list[count] = item;
		count+=1;
	}
	
	public void display() {
		System.out.print("[");
		for(int i=0; i<this.list.length; i++) {
			System.out.print(this.list[i]);
			if(i!=this.list.length -1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
		System.out.println();
	}
	
	public int indexOf(int item) {
		for(int i=0; i<this.list.length; i++) {
			if(item == this.list[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public void removeAt(int index) {
		int[] list1 = new int[this.list.length-1];
		for(int i=index; i<(this.list.length-1); i++) {
			this.list[i] = this.list[i+1];
		}
		for(int i=0; i<list1.length; i++) {
			list1[i] = this.list[i];
		}
		this.list = list1;
	}
}
