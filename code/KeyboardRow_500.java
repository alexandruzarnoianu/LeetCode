package code;

public class KeyboardRow_500 {
    class Solution {
        public String[] findWords(String[] words) {
            Set<Character> firstRow = new HashSet<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
            Set<Character> secondRow = new HashSet<>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
            Set<Character> thirdRow = new HashSet<>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));
            List<String> fitCondition = new ArrayList<>();

            for (String s : words) {
                String copy = new String(s.toLowerCase());
                char firstChar = copy.charAt(0);
                if (firstRow.contains(firstChar)) {
                    boolean condition = true;
                    for (int i = 1; i < s.length(); i++) {
                        if (!firstRow.contains(copy.charAt(i))) condition = false;
                    }
                    if (condition) fitCondition.add(s);
                    continue;
                }
                if (secondRow.contains(firstChar)) {
                    boolean condition = true;
                    for (int i = 1; i < s.length(); i++) {
                        if (!secondRow.contains(copy.charAt(i))) condition = false;
                    }
                    if (condition) fitCondition.add(s);
                    continue;
                }
                if (thirdRow.contains(firstChar)) {
                    boolean condition = true;
                    for (int i = 1; i < s.length(); i++) {
                        if (!thirdRow.contains(copy.charAt(i))) condition = false;
                    }
                    if (condition) fitCondition.add(s);
                }
            }
            String[] result = new String[fitCondition.size()];
            for(int i = 0; i < result.length; i++) {
                result[i] = fitCondition.get(i);
            }
            return result;
        }
    }
}
