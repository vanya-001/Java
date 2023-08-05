package Arrays;

public class MatrixDiagonalSum {
    public static void sumDiagonal(int[][] a, int n) {
        int principal = 0;
        int secondary = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    principal += a[i][j];
                }
                if ((i + j) == (n - 1)) {
                    secondary += a[i][j];
                }
            }
        }
        System.out.println(principal);
        System.out.println(secondary);
    }

    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 } };

        sumDiagonal(a, 4);
    }
}
