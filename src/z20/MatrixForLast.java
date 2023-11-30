package z20;

public class MatrixForLast<T extends Comparable<T>> {
    private final T[][] matrix;

    public MatrixForLast(T[][] matrix) {
        this.matrix = matrix;
    }

    public void printMatrix() {
        for (T[] ts : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ts[j] + " ");
            }
            System.out.println();
        }
    }

    public Matrix<T> add(Matrix<T> otherMatrix) {
        if (matrix.length != otherMatrix.matrix.length || matrix[0].length != otherMatrix.matrix[0].length) {
            return null;
        }
        @SuppressWarnings("unchecked")
        T[][] resultMatrix = (T[][]) new Object[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] instanceof Number && otherMatrix.matrix[i][j] instanceof Number) {
                    resultMatrix[i][j] = (T) (Number) (((Number) matrix[i][j]).doubleValue() + ((Number) otherMatrix.matrix[i][j]).doubleValue());
                } else {
                    return null;
                }
            }
        }
        return new Matrix<>(resultMatrix);
    }
}