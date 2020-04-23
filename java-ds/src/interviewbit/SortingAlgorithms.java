package interviewbit;

import java.util.ArrayList;

public class SortingAlgorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(25);
		array.add(17);
		array.add(0);
		array.add(13);
		array.add(2);
		
		insertionSort(array);
	}
	
	public static void insertionSort(ArrayList<Integer> inputArray) {
		for(int i=1; i<inputArray.size(); i++){
			int j=i;
			while(j!=0 && inputArray.get(j)<inputArray.get(j-1)) {
				int temp = inputArray.get(j-1);
				inputArray.set(j-1, inputArray.get(j));
				inputArray.set(j, temp);
				j--;
			}
		}
		System.out.println(inputArray);
	}

}
