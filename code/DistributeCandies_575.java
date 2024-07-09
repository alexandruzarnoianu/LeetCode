package code;

public class DistributeCandies_575 {
    class Solution {
        public int distributeCandies(int[] candyType) {
            Set<Integer> distinct = new HashSet<>();
            int count = 0;
            int i = 0;
            int length = candyType.length;
            while (count < length / 2 && i < length) {
                if (distinct.add(candyType[i])) count++;
                i++;
            }
            return count;
        }
    }
}
