public class FindLongestIncreasingPath {
    public static int solution(int[][] matrix) {
        int max = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                max = Math.max(longestIncreasingPath(matrix, row, col, 1), max);
            }
        }
        return max;
    }


    public static int longestIncreasingPath(int[][] matrix, int row, int col, int temp) {
        int rowLength = matrix.length;
        int columnLength = matrix[0].length;

        if ((col - 1) >= 0 && matrix[row][col] < matrix[row][col - 1]) {
            return longestIncreasingPath(matrix, row, col - 1, temp + 1);
        } else if ((row + 1) < rowLength && matrix[row][col] < matrix[row + 1][col]) {
            return longestIncreasingPath(matrix, row + 1, col, temp + 1);
        } else if ((col + 1) < columnLength && matrix[row][col] < matrix[row][col + 1]) {
            return longestIncreasingPath(matrix, row, col + 1, temp + 1);
        } else if ((row - 1) >= 0 && matrix[row][col] < matrix[row - 1][col]) {
            return longestIncreasingPath(matrix, row - 1, col, temp + 1);
        }
        return temp;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {9, 9, 4},
                {6, 6, 8},
                {2, 1, 1}};

        int[][] matrix2 = {
                {3, 4, 5},
                {3, 2, 6},
                {2, 2, 1}};

        int[][] matrix3 = {
                {1, 2}};
        int[][] matrix4 = {
                {1}};

        int[][] matrix5 = {
                {7, 7, 5},
                {2, 4, 6},
                {8, 2, 0}};

        System.out.println(solution(matrix5));
    }
}
