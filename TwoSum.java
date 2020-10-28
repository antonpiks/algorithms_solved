/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

 

Constraints:

    2 <= nums.length <= 105
    -109 <= nums[i] <= 109
    -109 <= target <= 109
    Only one valid answer exists.

*/

package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void solve() {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,3}, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> intMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            final int key = target - nums[i];
            if (intMap.containsKey(key)) {
                return new int[] { intMap.get(key), i };
            }
            intMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
