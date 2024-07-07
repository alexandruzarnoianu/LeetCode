
public class TwoSum_1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapIndexToDif = new HashMap(nums.length * 2);
        int[] solution = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (mapIndexToDif.containsKey(nums[i])) {
                solution[0] = i;
                solution[1] = mapIndexToDif.get(nums[i]);
                return solution;
            } else {
                int dif = target - nums[i];
                mapIndexToDif.put(dif, i);
            }
        }
        return solution;
    }
}
