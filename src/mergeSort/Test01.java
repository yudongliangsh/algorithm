package mergeSort;

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
		MergeSort mergeSort = new MergeSort();
		int p = 1;
		int r = 10;
		double[] myList2 = mergeSort.myMegreSort(myList, p, r);
		for (int i = 0; i < myList2.length; i++) {
			System.out.println(myList2[i]);
		}		
	}
}
