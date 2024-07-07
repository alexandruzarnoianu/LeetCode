package code;

public class LongestSubstringWithoutRepeatingCharacters_3 {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            if(null == s || s.equals("")) {
                return 0;
            }

            if (s.length() == 1) {
                return 1;
            }

            Set<Character> set = new HashSet<>();
            int left = 0;
            int max = 0;
            for (int i = 0; i < s.length(); i++) {
                while (!set.add(s.charAt(i))) {
                    set.remove(s.charAt(left++));
                }
                max = Math.max(max, i - left + 1);
            }
            return max;
        }
    }
}
