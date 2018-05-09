package quickSort;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		Random random = new Random();		
		for (int i = 0; i < 10; i++) {
			int x = random.nextInt(100 - 90)+10;
			System.out.println(x);
		}		
	}
}
