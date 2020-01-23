package demo;

public class Array {
	
	private int[] list;
	private int count = 0;
	
	public Array(int len) {
		this.list = new int[len];
	}
	
	public void insert(int item) {
		if(count == this.list.length) {
			int[] list1 = new int[this.list.length*2];
			for(int i=0; i<list.length; i++)
				list1[i] = list[i];
			list = list1;
		}
		this.list[count] = item;
		count+=1;
	}
	
	public void display() {
		System.out.print("[");
		for(int i=0; i<count; i++) {
			System.out.print(this.list[i]);
			if(i!=count -1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
		System.out.println();
	}
	
	public int indexOf(int item) {
		for(int i=0; i<count; i++) {
			if(item == this.list[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public int removeAt(int index) {
		if(index <0 || index>=count)
			return -1;
		int var = list[index];
		int[] list1 = new int[this.list.length-1];
		for(int i=index; i<(this.list.length-1); i++) {
			this.list[i] = this.list[i+1];
		}
		for(int i=0; i<list1.length; i++) {
			list1[i] = this.list[i];
		}
		count-=1;
		this.list = list1;
		return var;
	}
}
