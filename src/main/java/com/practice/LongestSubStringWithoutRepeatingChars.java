package com.practice;

import java.util.Arrays;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 *
 * @author agamsingh
 * 19-05-2021
 */
public class LongestSubStringWithoutRepeatingChars {
    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(LongestSubString(s));
    }

    private static int LongestSubString(String s) {
        int res=0; //result
        int[] lastIndexArr = new int[256];
        Arrays.fill(lastIndexArr, -1);
        int start=0;
        for(int end=0; end< s.length(); end++)
        {
            start = Math.max(start, lastIndexArr[s.charAt(end)] + 1);

            res=Math.max(res, end-start+1);

            lastIndexArr[s.charAt(end)]=end;
        }
        return res;
    }
}
