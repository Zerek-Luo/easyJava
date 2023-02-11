package com.example.zerek_java.力扣;

import java.util.HashMap;

public class 两数之和 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        // 建立k-v ，一一对应的哈希表
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])){
                result[0] = i;
                result[1] = hash.get(nums[i]);
                return result;
            }
            // hash key为值 value为数组下标
            hash.put(target-nums[i],i);
        }
        return result;
    }
}
