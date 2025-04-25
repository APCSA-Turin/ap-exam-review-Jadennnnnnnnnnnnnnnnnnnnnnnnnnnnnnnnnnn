public class Data {
    public static final int MAX = 500; // THIS VALUE ADDED TO ENABLE TESTING
    private int[][] grid;

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public Data(int[][] g) {
        grid = g;
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public int[][] getGrid() {
        return grid;
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public void setGrid(int[][] newGrid) {
        grid = newGrid;
    }

    public void repopulate() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int random =  (int) (Math.random() * MAX) + 1;
                while (random % 10 != 0 || random % 100 == 0) {
                    random =  (int) (Math.random() * MAX) + 1;
                }
                grid[i][j] = random;
            }
        }
    }

    public int countIncreasingCols() {
        int count = 0;
        for (int c = 0; c < grid[0].length; c++) {
            for (int r = 1; r < grid.length; r ++) {
                if (grid[r][c] < grid[r - 1][c]) {
                    count++;
                    break; 
                }
            }
        }
    return grid[0].length - count;
    }
}
