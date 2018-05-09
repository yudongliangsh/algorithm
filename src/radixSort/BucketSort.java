package radixSort;

public class BucketSort {
	public static void myBucketSort(int[] A) {
		int n = A.length;
		int[] B = new int[n - 1];
		for (int i = 0; i < n - 1; i++) {
			B[i] = 0;
		}
		for (int i = 1; i < n; i++) {
			B[i] = A[i];
		}
	}
}
