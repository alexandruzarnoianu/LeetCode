package code;

import java.util.ArrayList;

public class GameOfLife_289 {
    class Solution {
        public void gameOfLife(int[][] board) {
            int[][] directions = new int[][]{{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
            ArrayList<ArrayList<Integer>> modifyIndex = new ArrayList<>();
            int m = board.length;
            int n = board[0].length;
            for (int i = 0; i < m; i++) {
                ArrayList<Integer> modifyRow = new ArrayList<>();
                for (int j = 0; j < n; j++) {
                    int neighbours = 0;
                    for (int[] direction : directions) {
                        int row = i + direction[0];
                        int col = j + direction[1];
                        if (row < 0 || row >= m || col < 0 || col >= n || board[row][col] == 0) {
                            continue;
                        }
                        neighbours++;
                    }
                    if (board[i][j] == 1 && (neighbours < 2 || neighbours > 3)) {
                        modifyRow.add(j);
                    } else if (board[i][j] == 0 && neighbours == 3) {
                        modifyRow.add(j);
                    }
                }
                modifyIndex.add(modifyRow);
            }
            for (int i = 0; i < modifyIndex.size(); i++) {
                ArrayList<Integer> modifyRow = modifyIndex.get(i);
                for (int j : modifyRow) {
                    if (board[i][j] == 1) {
                        board[i][j] = 0;
                    } else if (board[i][j] == 0) {
                        board[i][j] = 1;
                    }
                }
            }
        }
    }
}
