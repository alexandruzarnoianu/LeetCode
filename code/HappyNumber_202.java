package code;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber_202 {
    class Solution {
        public boolean isHappy(int n) {
            Set<Integer> visited = new HashSet<>();
            while (n != 1 && !visited.contains(n)) {
                visited.add(n);
                n = computeNextNumber(n);
            }
            return n == 1;
        }

        private static int computeNextNumber(int n) {
            int result = 0;
            while (n != 0) {
                int digit = n % 10;
                result += digit * digit;
                n /= 10;
            }
            return result;
        }
    }
}
