package code;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber_136 {
    class Solution {
        public int singleNumber(int[] nums) {
            Set<Integer> distinct = new HashSet<>();
            for (Integer i : nums) {
                if (distinct.contains(i)) {
                    distinct.remove(i);
                } else distinct.add(i);
            }
            int res = 0;
            for (Integer i : distinct) {
                res = i;
            }
            return res;
        }
    }
}
