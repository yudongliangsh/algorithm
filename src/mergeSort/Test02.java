package mergeSort;

public class Test02 {
	public static void main(String[] args) {		
		int p = 0;
		int r = 9;
		int q = (int)(p + r)/2;
		System.out.println((double)0x1.fffffffffffffP+1023);
		double[] myList = new double[]{10,9,8,7,6,5,4,3,2,1};
		MergeSort mergeSort = new MergeSort();
		mergeSort.megreSub(myList, 1, 5, 10);
		for (int i = 0; i < myList.length; i++) {
			System.out.println(myList[i]);
		}
		
		
	}
}
