package findMaxSubarrary;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		Random random = new Random();
		double[] list = new double[10];
		for (int i = 0; i < 5; i++) {
			list[i] = random.nextInt(100)*(Math.pow(-1,i));	
		}
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i]+"[" + i + "]"+",");			
		}
		double[] list2 = new double[]{13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};//Ô­Êé°¸Àý
		System.out.println();
		FindMaximumSubarray fm = new FindMaximumSubarray();
		MaxArray array = new MaxArray(0,0,0);
		array = fm.myFindMaximumSubarray(list, 0, list.length - 1);
		System.out.println("low:list[" + array.getLow()+"]");
		System.out.println("high:list[" + array.getHigh()+"]");
		System.out.println("sum:" + array.getSumArray());		
	}
}
