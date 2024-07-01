package code;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle_118 {
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> result = new ArrayList<>();
            if (numRows == 0) {
                return result;
            }
            List<Integer> firstRow = new ArrayList<>();
            firstRow.add(1);
            result.add(firstRow);
            if (numRows == 1) {
                return result;
            }

            for (int i = 1; i < numRows; i++) {
                List<Integer> currentRow = new ArrayList<>();
                currentRow.add(1);
                List<Integer> prevRow = result.get(i - 1);
                for (int j = 1; j < i; j++) {
                    currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
                }
                currentRow.add(1);
                result.add(currentRow);
            }
            return result;
        }
    }
}
