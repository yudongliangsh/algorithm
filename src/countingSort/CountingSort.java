package countingSort;

public class CountingSort {
	//计数排序的排序元素不能大于原始数组的下标，不然会报错
	public static int[] myCountingSort(int[] A,int k) {
		//A原始数组，B输出数组，C临时数组
		int[] C = new int[k];
		int[] B = new int[A.length];
		for (int i = 0; i < k; i++) {
			C[i] = 0;
		}
		for (int j = 0; j < A.length; j++) {// 计数数组A中值等于C数组下标的个数  
			C[A[j]]++;  
		}
		for (int i = 1; i < k; i++) {// 计数数组A中值小于等于C数组下标的个数  
			 C[i] += C[i - 1];
		}
		for (int j = A.length - 1; j >= 0; j--) {
			B[C[A[j]] - 1] = A[j];//这里与原书不符，按照原书会报错下标越界
			C[A[j]]--;
		}
		return B;
	}
	
	public static void main(String[] args) {
		int[] listA = new int[]{5,4,3,2,1,0};
		int[] listB = myCountingSort(listA,listA.length);
		for (int i = 0; i < listB.length; i++) {
			System.out.println(listB[i]);
		}
	}
	
}
