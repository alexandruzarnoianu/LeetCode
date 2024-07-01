package code;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZeros_73 {
    class Solution {
        public void setZeroes(int[][] matrix) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
                return;
            }
            List<Integer> rows = new ArrayList<>();
            List<Integer> cols = new ArrayList<>();

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] == 0) {
                        rows.add(i);
                        cols.add(j);
                    }
                }
            }
            for(int row : rows) {
                for(int i = 0; i < matrix[0].length; i++) {
                    matrix[row][i] = 0;
                }
            }
            for(int col : cols) {
                for(int i = 0; i < matrix.length; i++) {
                    matrix[i][col] = 0;
                }
            }
        }
    }
}
