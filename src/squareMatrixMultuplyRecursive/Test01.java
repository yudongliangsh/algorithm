package squareMatrixMultuplyRecursive;

public class Test01 {
	public static void main(String[] args) {
		SquareMatrixMultuplyRecursive smmr = new SquareMatrixMultuplyRecursive();
		double[][] matrixA = new double[][]{{1,1},{1,1}};
		double[][] matrixB = new double[][]{{3,3},{3,3}};
		double[][] matrixC = new double[matrixA.length][matrixA.length];
		matrixC = smmr.matrixPlus(matrixA, matrixB);
		for (int i = 0; i < matrixC.length; i++) {
			for (int j = 0; j < matrixC.length; j++) {
				System.out.println("["+i+"]"+"["+j+"]:"+matrixC[i][j]);
			}
		}
		
	}
}
