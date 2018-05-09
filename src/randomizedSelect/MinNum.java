package randomizedSelect;

public class MinNum {
	public static int myMinNum(int[] array) {
		int min =array[0];
		for (int i = 1; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		int[] array = new int[] {4,6,8,9,2};
		System.out.println(myMinNum(array));
	}
}
