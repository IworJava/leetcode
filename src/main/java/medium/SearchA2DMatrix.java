package medium;

public class SearchA2DMatrix {

    /**
     * 0 ms, 40.86 KB
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int lastRow = matrix.length - 1;
        int l = 0;
        int r = lastRow;
        int m = 0;

        while (true) {
            m = l + (r - l) / 2;
            if (target < matrix[m][0]) {
                r = m - 1;
            } else if (matrix[m][matrix[m].length - 1] < target) {
                l = m + 1;
            } else {
                break;
            }
            if (r < l) {
                return false;
            }
        }

        l = 0;
        r = matrix[m].length - 1;
        while (true) {
            int n = l + (r - l) / 2;
            if (matrix[m][n] == target) {
                return true;
            } else if (target < matrix[m][n]) {
                r = n - 1;
            } else if (matrix[m][n] < target) {
                l = n + 1;
            }
            if (r < l) {
                return false;
            }
        }
    }
}
