package findMaxSubarrary;

public class FindMaximumSubarray {
	public MaxArray myFindMaximumSubarray(double[] array,int low,int high) {
		MaxArray arrayBase = new MaxArray(0,0,0);
		MaxArray leftArray = new MaxArray(0,0,0);
		MaxArray rightArray = new MaxArray(0,0,0);
		MaxArray crossAraay = new MaxArray(0,0,0);
		if (low==high) {
			arrayBase.setSumArray(array[low]);
			arrayBase.setLow(low);
			arrayBase.setHigh(high);
			return arrayBase;//base case,only one element
		}
		else {
			int mid = (int)(low + high)/2;
			leftArray = myFindMaximumSubarray(array,low,mid);
			rightArray = myFindMaximumSubarray(array,mid + 1,high);
			crossAraay = findMaxCrossingSubarray(array,low,mid,high);
			if (leftArray.getSumArray() > rightArray.getSumArray() 
					&& leftArray.getSumArray() > crossAraay.getSumArray()) {
				return leftArray;
			}
			else if (rightArray.getSumArray() > leftArray.getSumArray() 
					&& rightArray.getSumArray() > crossAraay.getSumArray()) {
				return rightArray;
			}
			else {
				return crossAraay;
			}
		}
	}
	
	public MaxArray findMaxCrossingSubarray(double[] array,int low,int mid,int high) {
		MaxArray arrayBase = new MaxArray(0,0,0);
		double leftSum = -999999999;
		double rightSum = -999999999;//在这里不能用Double.MIN_VALUE;
		double sum = 0;
		int maxLeft = 0;
		int maxRight = 0;
		for (int i = mid; i >= low; i--) {
			sum += array[i];
			if (sum > leftSum) {
				leftSum = sum;
				maxLeft = i;
			}
		}
		sum = 0;
		for (int j = mid + 1 ; j <= high; j++) {
			sum += array[j];
			if (sum > rightSum) {
				rightSum = sum;
				maxRight = j;
			}
		}
		arrayBase.setLow(maxLeft);
		arrayBase.setHigh(maxRight);
		arrayBase.setSumArray(leftSum + rightSum);
		return arrayBase;
	}
}
