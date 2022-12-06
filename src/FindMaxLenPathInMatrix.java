public class FindMaxLenPathInMatrix {

//    Given a n*n matrix where all numbers are distinct, find the maximum length path (starting from any cell)
//    such that all cells along the path are in increasing order with a difference of 1.
//    We can move in 4 directions from a given cell (i, j), i.e.,
//    we can move to (i+1, j) or (i, j+1) or (i-1, j) or (i, j-1) with the condition that the
//    adjacent cells have a difference of 1.

    public static int solution(int[][] matrix) {
        int max = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                max = Math.max(findLongestPath(matrix, row, col, 1), max);
            }
        }
        return max;
    }

    public static int findLongestPath(int[][] matrix, int row, int col, int temp) {
        int rowLength = matrix.length;
        int columnLength = matrix[0].length;

        if ((col + 1) < columnLength && matrix[row][col] == (matrix[row][col + 1]) - 1) {
            return findLongestPath(matrix, row, col + 1, temp + 1);
        } else if ((row + 1) < rowLength && matrix[row][col] == (matrix[row + 1][col]) - 1) {
            return findLongestPath(matrix, row + 1, col, temp + 1);
        } else if ((col - 1) >= 0 && matrix[row][col] == (matrix[row][col - 1]) - 1) {
            return findLongestPath(matrix, row, col - 1, temp + 1);
        } else if ((row - 1) >= 0 && matrix[row][col] == (matrix[row - 1][col]) - 1) {
            return findLongestPath(matrix, row - 1, col, temp + 1);
        }
        return temp;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 2, 9},
                {5, 3, 8},
                {4, 6, 7}
        };
        System.out.println(solution(matrix));
    }
}
