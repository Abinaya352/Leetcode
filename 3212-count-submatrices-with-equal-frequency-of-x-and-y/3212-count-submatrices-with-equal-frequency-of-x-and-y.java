class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int r = grid.length, c = grid[0].length;
        int[][] balance = new int[r][c];
        int[][] countX = new int[r][c];
        int count = 0;

        // Step 1: Build prefix sums
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                int val = 0;
                int x = 0;

                if (grid[i][j] == 'X') {
                    val = 1;
                    x = 1;
                } else if (grid[i][j] == 'Y') {
                    val = -1;
                }

                balance[i][j] = val;
                countX[i][j] = x;

                // Prefix sum build
                if (i > 0 && j > 0) {
                    balance[i][j] += balance[i-1][j] + balance[i][j-1] - balance[i-1][j-1];
                    countX[i][j] += countX[i-1][j] + countX[i][j-1] - countX[i-1][j-1];
                } else if (i > 0) {
                    balance[i][j] += balance[i-1][j];
                    countX[i][j] += countX[i-1][j];
                } else if (j > 0) {
                    balance[i][j] += balance[i][j-1];
                    countX[i][j] += countX[i][j-1];
                }

                // Check condition
                if (balance[i][j] == 0 && countX[i][j] > 0) {
                    count++;
                }
            }
        }

        return count;
    }
}