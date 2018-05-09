package maxHeapify;

public class TestCase {
	public static void main(String[] args) {
		int[] a = new int[]{1,2,3,4,5,6,7};
        MaxHeap maxHeap = new MaxHeap(a);
        maxHeap.printHeap();
        maxHeap.buildMaxHeap();        
        maxHeap.printHeap();
        maxHeap.extractMax();
        maxHeap.printHeap();
        maxHeap.insert(12);
        maxHeap.printHeap();
    }
}
