package top.yodon.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class N1TwoSum {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.printf(Arrays.toString(new Solution().twoSum(nums, target)));
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            if (map.containsKey(result)) {
                return new int[]{map.get(result), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
