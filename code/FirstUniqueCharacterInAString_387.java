package code;

public class FirstUniqueCharacterInAString_387 {
    class Solution {
        public static int firstUniqChar(String s) {
            char[] sToArray = s.toCharArray();
            int[] freq = new int[26];
            for (Character c : sToArray) {
                int i = c - 97;
                freq[i]++;
            }
            for (int i = 0; i < sToArray.length; i++) {
                int index = sToArray[i] - 97;
                if (freq[index] == 1) {
                    return i;
                }
            }
            return -1;
        }
    }
