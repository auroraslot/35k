import utils.ArrayUtils;

import java.util.*;

import static utils.ArrayUtils.printArray;

class Solution {

    public static void main(String[] args) {
        //如果在将所有大写字符转换为小写字符、并移除所有非字母数字字符之后，短语正着读和反着读都一样。则可以认为该短语是一个 回文串 。
        //
        //字母和数字都属于字母数字字符。
        //
        //给你一个字符串 s，如果它是 回文串 ，返回 true ；否则，返回 false 。
        //
        //
        //
        //示例 1：
        //
        //输入: s = "A man, a plan, a canal: Panama"
        //输出：true
        //解释："amanaplanacanalpanama" 是回文串。



        String s = "A man, a plan, a canal: Panama";
        // 结果：amanaplanacanalpanama
        // true
        boolean palindrome = isPalindrome(s);

        System.out.println(palindrome);

    }


    public static boolean isPalindrome(String s) {
        // 怎么搞？
        // 左右双指针
        int l = 0;
        int r = s.length() - 1;
        s = s.toLowerCase();
        char[] cs = s.toCharArray();

        // 前提
        // 字母数字的边界 - 正则表达式
        // 大写到小写的差值 - 大写全部转小写

        // 一直到左指针>=右指针
        while (l < r) {
            // 左右指针元素不是字母数字
            char lc = cs[l];
            if (!isNumberOrChar(lc)) {
                // 左指针右移
                l++;
                continue;
            }
            char rc = cs[r];
            if (!isNumberOrChar(rc)) {
                // 右指针左移
                r--;
                continue;
            }

            // 如果是字母数字
            // 左右指针比较相等
            if (lc == rc) {
                // 左指针右移，右指针左移
                l++;
                r--;
            } else {
                // 如果不相等
                return false;
            }
            // return false
        }




        return true;
    }

    private static boolean isNumberOrChar(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }

        if (c >= 'a' && c <= 'z') {
            return true;
        }

        return false;
    }
}