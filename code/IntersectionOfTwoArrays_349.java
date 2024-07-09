package code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays_349 {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> distinct1 = new HashSet<>();
            for (Integer i : nums1) {
                distinct1.add(i);
            }
            int[] result = new int[distinct1.size()];
            int index = 0;
            for (Integer i : nums2) {
                if (distinct1.contains(i)) {
                    result[index] = i;
                    distinct1.remove(i);
                    index++;
                }
            }
            result = Arrays.copyOf(result, index);
            return result;
        }
    }
}
