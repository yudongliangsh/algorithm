package squareMatrixMultiply;

public class SquareMatrixMultiplyTest {
	public static void main(String[] args) {
		double matrixA[][] = {{1,1},{1,1}};
		double matrixB[][] = {{2,2},{2,2}};
		SquareMatrixMultiply smm = new SquareMatrixMultiply();
		double matrixC[][] = smm.mySquareMatrixMultiply(matrixA, matrixB);
		for (int i = 0; i < matrixC.length; i++) {
			for (int j = 0; j < matrixC.length; j++) {
				System.out.println("["+i+"]"+"["+j+"]:"+matrixC[i][j]);
			}
		}
	}
}
