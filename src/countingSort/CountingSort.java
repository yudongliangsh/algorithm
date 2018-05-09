package countingSort;

public class CountingSort {
	//�������������Ԫ�ز��ܴ���ԭʼ������±꣬��Ȼ�ᱨ��
	public static int[] myCountingSort(int[] A,int k) {
		//Aԭʼ���飬B������飬C��ʱ����
		int[] C = new int[k];
		int[] B = new int[A.length];
		for (int i = 0; i < k; i++) {
			C[i] = 0;
		}
		for (int j = 0; j < A.length; j++) {// ��������A��ֵ����C�����±�ĸ���  
			C[A[j]]++;  
		}
		for (int i = 1; i < k; i++) {// ��������A��ֵС�ڵ���C�����±�ĸ���  
			 C[i] += C[i - 1];
		}
		for (int j = A.length - 1; j >= 0; j--) {
			B[C[A[j]] - 1] = A[j];//������ԭ�鲻��������ԭ��ᱨ���±�Խ��
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
