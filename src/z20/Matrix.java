package z20;

public class Matrix<T> {
    final T[][] matrix;

    public Matrix(T[][] matrix) {
        this.matrix = matrix;
    }

    public T getElement(int row, int column) {
        return matrix[row][column];
    }

    public void setElement(int row, int column, T element) {
        matrix[row][column] = element;
    }

    @SuppressWarnings("unchecked")
    public Matrix<T> add(Matrix<T> other) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        T[][] result = (T[][]) new Object[rows][columns];
        return new Matrix<>(result);
    }

    @SuppressWarnings("unchecked")
    public Matrix<T> multiply(Matrix<T> other) {
        int rows = matrix.length;
        int columns = other.matrix[0].length;
        T[][] result = (T[][]) new Object[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = (T) multiplyRowAndColumn(matrix[i], getColumn(other.matrix, j));
            }
        }

        return new Matrix<>(result);
    }

    private <E> Number multiplyRowAndColumn(E[] row, E[] column) {
        double sum = 0;
        for (int i = 0; i < row.length; i++) {
            sum += ((Number) row[i]).doubleValue() * ((Number) column[i]).doubleValue();
        }
        return sum;
    }

    @SuppressWarnings("unchecked")
    private <E> E[] getColumn(E[][] matrix, int column) {
        int length = matrix.length;
        E[] result = (E[]) new Object[length];

        for (int i = 0; i < length; i++) {
            result[i] = matrix[i][column];
        }

        return result;
    }
}
