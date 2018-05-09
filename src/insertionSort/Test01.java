package insertionSort;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		Random random = new Random();
		final int arrayLength = 10;
		double[] myList = new double[arrayLength];
		for (int i = 0; i < arrayLength; i++) {
			myList[i] = random.nextDouble();			
			System.out.println(myList[i]);
		}
		System.out.println("---------------------------");
		InsertionSort insertionSort = new InsertionSort();
		double[] myList2 = insertionSort.mySort(myList);
		for (int i = 0; i < myList2.length; i++) {
			System.out.println(myList2[i]);
		}		
	}
}
