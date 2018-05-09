package quickSort;

import java.util.Random;

public class RandomQuickSort {
	static Random random = new Random();
	
	public static void myQuickSort(int[] array,int p ,int r) {
		if (p < r) {
			int q = partitionRandom(array,p,r);
			myQuickSort(array,p,q - 1);
			myQuickSort(array,q + 1,r);
		}
	}
	
	public static int partitionRandom(int[] array,int p ,int r) {
		int ra = random.nextInt(r - p + 1) + p;
		exchange(array,ra,r);
		int x = array[r];
		int i = p - 1;
		for (int j = p; j <= r - 1; j++) {
			if (array[j] <= x) {
				i += 1;
				exchange(array,i,j);
			}
		}
		exchange(array, i + 1, r);
		return i + 1;
	}
	
	private static void exchange(int[] array,int a,int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	public static void main(String[] args) {
		int[] array = new int[] {98,45,60,85,26,74};
		myQuickSort(array, 0, array.length - 1);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}	
	}
	
}
