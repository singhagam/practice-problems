package com.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * @author agamsingh
 * 19-05-2021
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] arr={3,2,4};
        int target=6;
        int result[]=twosum(arr,target);
        System.out.println(result[0]+" "+result[1]);
    }

    private static int[] twosum(int[] nums, int target) {
        HashSet<Integer> set= new HashSet<>();
        int res[]= new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int temp= target-nums[i];
            if(set.contains(temp))
            {
                res[0]=i;
                res[1]= IntStream.range(0,nums.length-1)
                        .filter(x -> temp == nums[x])
                        .findFirst().orElse(-1);
            }
            set.add(nums[i]);
        }
        Arrays.sort(res);
        return res;
    }
}
