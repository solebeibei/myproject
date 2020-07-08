package com.liyang.web.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution1 {

    public static void main(String[] args) {
        int[] data = {11, 14,5,17,19};

        int[] result = twoSum2(data, 22);
        for (int f : result)
            System.out.println(f);
    }


    public static int[] twoSum2(int[] nums, int target) {

        int[] data = new int[2];

        for (int i=0;i<nums.length-1;i++){
             for (int j=i+1;j<nums.length;j++){
                 if (nums[i]+nums[j]==target){
                  data[0]=i;
                  data[1]=j;
                  return  data;
                 }
             }
         }
        return  null;
    }

    public static int[] twoSum(int[] nums, int target) {

        if (nums == null) {
            return null;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i]);
        }


        //排序
        Arrays.sort(nums);
        int[] data = new int[2];

        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] > target) {
                j--;
            } else if (nums[i] + nums[j] < target) {
                i++;
            } else {
                data[0] = getLocationByData(map, nums[i]);
                data[1] = getLocationByData(map, nums[j]);
                return data;
            }
        }
        return null;
    }

    public static int getLocationByData(Map<Integer, Integer> map, int data) {

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == data) {
                return entry.getKey();
            }
        }
        return -1;
    }

}
