import java.util.*;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complement = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (complement.keySet().contains(nums[i])) {
                return new int[]{complement.get(nums[i]), i};
            }
            complement.put(target - nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] indices = twoSum(nums, target);
        System.out.println(Arrays.toString(indices));
    }
}
