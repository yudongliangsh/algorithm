package randomizedSelect;

import java.util.Random;

public class RandomizedSelect {
	static Random random = new Random();
	/*
	 * p数组起点下标
	 * r数组终点下标
	 * i整个数组第i小的元素,起点为1
	 */
	public static int myRandomizedSelect(int[] array,int p,int r,int i) {
		if (p==r) {
			return array[p];
		}
		int q = partitionRandom(array,p,r);
		int k = q - p + 1;
		if (i==k) {
			return array[q];
		}
		else if (i < k) {
			return myRandomizedSelect(array,p,q - 1,i);
		}
		return myRandomizedSelect(array,q + 1,r,i - k);
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
		int[] array = new int[] {1,3,5,7,9,2,4,6,8,0};		
		System.out.println(myRandomizedSelect(array,0,9,2));
	}
}
