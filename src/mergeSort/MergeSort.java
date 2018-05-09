package mergeSort;


public class MergeSort {
	public double[] myMegreSort(double[] list,int p,int r) {
		if (p < r) {
			int q = (int)(p + r)/2;
			list = myMegreSort(list,p,q);
			list = myMegreSort(list,q + 1,r);
			list = megreSub(list,p,q,r);//0,4,9
		}
		return list;
	}
	
	public double[] megreSub(double[] list,int p,int q,int r) {
		int n1 = q - p + 1;//5
		int n2 = r - q;//5
		int i,j,k = 0;
		double[] left = new double[n1 + 1];
		double[] right = new double[n2 + 1];
		for( i = 0; i < n1; i++) {
			left[i] = list[p + i - 1];
		}
		for ( j = 0; j < n2; j++) {
			right[j] = list[q + j];
		}
		left[n1] = (double)Double.MAX_VALUE;
		right[n2] = (double)Double.MAX_VALUE;
		i = 0;
		j = 0;
		for (k = p - 1; k < r ; k++) {
			if (left[i] <= right[j]) {
				list[k] = left[i];
				i += 1;
			}
			else {
				list[k] = right[j];
				j += 1;
			}
		}		
		return list;
	}
}
