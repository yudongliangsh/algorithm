package squareMatrixMultiply;

public class SquareMatrixMultiply {
	public double[][] mySquareMatrixMultiply(double[][] matrixA,double[][] matrixB){
		int n = matrixA.length;
		double[][] matrixC = new double[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrixC[i][j] = 0;
				for (int k = 0; k < n; k++) {
					matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
				}
			}
		}
		return matrixC;
	}	
}
