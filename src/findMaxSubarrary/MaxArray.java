package findMaxSubarrary;

public class MaxArray {
	private int low;
	private int high;
	private double sumArray;
	
	public MaxArray(int low, int high, double sumArray) {
		super();
		this.low = low;
		this.high = high;
		this.sumArray = sumArray;
	}
	
	public int getLow() {
		return low;
	}

	public void setLow(int low) {
		this.low = low;
	}
	public int getHigh() {
		return high;
	}
	public void setHigh(int high) {
		this.high = high;
	}
	public double getSumArray() {
		return sumArray;
	}
	public void setSumArray(double sumArray) {
		this.sumArray = sumArray;
	}
	
	
}
