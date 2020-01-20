package demo;

public class Array {
	
	private int[] list;
	private int count=0;
	
	public Array(int len) {
		list = new int[len];
	}
	
	public void print() {
		System.out.print("[");
		for(int i=0; i<this.count; i++) {
			System.out.print(this.list[i]);
			if(i != (this.count-1)) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}
	
	public void insert(int e) {
		if(this.count == this.list.length)
		list[this.count] = e;
		this.count++;
	}
}
