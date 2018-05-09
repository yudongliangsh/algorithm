package radixSort;

public class RadixSort {
	public static void myRadixSort(int[] array,int d) {
		int n = 1;//����λ����Ӧ������1,10,100...
	    int k = 0;//����ÿһλ�����Ľ��������һλ����������
	    int length = array.length;
	    int[][] bucket = new int[10][length];//����Ͱ���ڱ���ÿ�������Ľ������һλ����������ͬ�����ַ���ͬһ��Ͱ��
	    int[] order = new int[length];//���ڱ���ÿ��Ͱ���ж��ٸ�����
	    while(n < d){
	        for(int num:array) {//������array���ÿ�����ַ�����Ӧ��Ͱ��
	            int digit=(num/n)%10;
	            bucket[digit][order[digit]]=num;
	            order[digit]++;
	        }
	        for(int i=0;i<length;i++) {//��ǰһ��ѭ�����ɵ�Ͱ������ݸ��ǵ�ԭ���������ڱ�����һλ��������   
	            if(order[i]!=0){//���Ͱ�������ݣ����ϵ��±������Ͱ�������ݱ��浽ԭ������            
	                for(int j=0;j<order[i];j++){
	                    array[k]=bucket[i][j];
	                    k++;
	                }
	            }
	            order[i]=0;//��Ͱ���������0��������һ��λ����
	        }
	        n*=10;
	        k=0;//��k��0��������һ�ֱ���λ������
	    }
	}
	
	public static void main(String[] args){
	    int[] A=new int[]{73, 22, 93, 43, 55, 14, 28, 65, 39, 81 ,10};
	    myRadixSort(A, 100);
	    for(int num:A){
	        System.out.println(num);
	    }
	}
}
