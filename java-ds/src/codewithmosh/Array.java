package codewithmosh;

public class Array {
	
	//Variables
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
	
	public int max() {
		int maxNum=0;
		for(int num: this.list) {
			if(num>maxNum) {
				maxNum = num;
			}
		}
		return maxNum;
	}
	
	public Array intersect(Array arr1) {
		Array commonItems = new Array(1);
		for(int x=0; x<arr1.list.length; x++) {
			for(int y=0; y<this.list.length; y++) {
				if(arr1.list[x] == this.list[y])
					commonItems.insert(arr1.list[x]);
			}
		}
		return commonItems;
		
	}
	
	public void reverse() {
		Array reversedArray = new Array(this.list.length);
		int count =this.count;
		for(int i=this.count-1; i>=0; i--) {
			if(count!=0) {
				reversedArray.list[this.count-count] = this.list[i];
			}
			count--;
		}
		this.list = reversedArray.list;
	}
	
	public void insertAt(int item, int index) {
		this.insert(0);
		int c= this.count;
		for(int i=c; i>index; i--) {
			this.list[i] = this.list[i-1];
		}
		this.list[index] = item;
	}
}
