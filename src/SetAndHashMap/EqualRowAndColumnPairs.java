package SetAndHashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EqualRowAndColumnPairs {
    public int equalPairs(int[][] grid) {
        Map<String, Integer> rowCount = new HashMap<>();
        for (int[] row : grid) {
            String rowStr = Arrays.toString(row);
            rowCount.put(rowStr, rowCount.getOrDefault(rowStr, 0) + 1);
        }
        int pairs = 0;
        for (int col = 0; col < grid.length; col++) {
            int[] colArray = new int[grid.length];
            for (int row = 0; row < grid.length; row++) {
                colArray[row] = grid[row][col];
            }
            String colStr = Arrays.toString(colArray);
            pairs += rowCount.getOrDefault(colStr, 0);
        }
        return pairs;
    }
}
