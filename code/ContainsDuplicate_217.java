package code;

public class ContainsDuplicate_217 {
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            Set<Integer> distinct = new HashSet<>();
            for (Integer i : nums) {
                if (!distinct.add(i)) {
                    return true;
                }
            }
            return false;
        }
    }
}
