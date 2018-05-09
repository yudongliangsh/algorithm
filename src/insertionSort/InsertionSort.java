package insertionSort;

public class InsertionSort {
	
	public double[] mySort(double[] list){
		double key = 0;
		int i = 0;
		for (int j = 1; j < list.length; j++) {
				key = list[j];
				i = j - 1;	
			while(i >= 0 && list[i] > key) {
				list[i + 1] = list[i];
				i -= 1;
			}
			list[i + 1] = key;
		}		
		return list;
	}
}
