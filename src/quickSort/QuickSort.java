package quickSort;

public class QuickSort {
	public static void myQuickSort(int[] array,int p ,int r) {
		if (p < r) {
			int q = partition(array,p,r);
			myQuickSort(array,p,q - 1);
			myQuickSort(array,q + 1,r);
		}		
	}
	
	public static int partition(int[] array,int p ,int r) {
		int x = array[r];
		int i = p - 1;
		for (int j = p; j <= r - 1; j++) {
			if (array[j] <= x) {
				i += 1;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		int temp2 = array[i + 1];
		array[i + 1] = array[r];
		array[r] = temp2;				
		return i + 1;
	}
	
	public static void main(String[] args) {
		int[] array = new int[] {5,4,3,2,1,0,-1};
		myQuickSort(array, 0, array.length - 1);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}	
	}
}
