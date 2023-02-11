package com.example.zerek_java.力扣;

public class 无重复字符的最长子串 {
    /*
    示例 :1
    输入: s = "abcabcbb"
    输出: 3
    解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
    示例 2:
    输入: s = "bbbbb"
    输出: 1
    解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
    示例 3:
    输入: s = "pwwkew"
    输出: 3
    解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
         请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。*/


    public static void main(String[] args) {
        String s = "pwwkewazs";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int[] last = new int[128];
        int res = 0; //最终返回值

        int start = 0; //开始位置

        for (int i = 0; i < s.length(); i++){
            int index = s.charAt(i);
            //核心
            start = Math.max(start,last[index]);
            res = Math.max(res,i - start + 1);
            last[index] = i+1;
        }

        return res;
    }
}
