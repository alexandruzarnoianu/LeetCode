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

        // solved using hashmap

        Map<Character, Integer> freqMap = new HashMap(s.length() * 2);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (freqMap.containsKey(c)) {
                freqMap.put(c, freqMap.get(c) + 1);
            } else freqMap.put(c, 1);
        }
        for (int i = 0; i < s.length(); i++) {
            int freq = freqMap.get(s.charAt(i));
            if (freq == 1) {
                return i;
            }
        }
        return -1;
    }
