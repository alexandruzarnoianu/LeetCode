package code;

public class FizzBuzz_412 {
    class Solution {
        private static String FIZZ = "Fizz";
        private static String BUZZ = "Buzz";
        public List<String> fizzBuzz(int n) {
            List<String> result = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    result.add(FIZZ + BUZZ);
                } else if (i % 3 == 0) {
                    result.add(FIZZ);
                } else if (i % 5 == 0) {
                    result.add(BUZZ);
                } else result.add(String.valueOf(i));
            }
            return result;
        }
    }
}
