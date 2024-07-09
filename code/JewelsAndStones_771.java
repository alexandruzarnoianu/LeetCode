package code;

public class JewelsAndStones_771 {
    class Solution {
        public int numJewelsInStones(String jewels, String stones) {
            Set<Character> jewelsSet = new HashSet<>();
            for (int i = 0; i < jewels.length(); i++) {
                jewelsSet.add(jewels.charAt(i));
            }
            int counter = 0;
            for (int i = 0; i < stones.length(); i++) {
                if (jewelsSet.contains(stones.charAt(i))) counter++;
            }
            return counter;
        }
    }
}
