import utils.ArrayUtils;

import java.util.*;

import static utils.ArrayUtils.printArray;

class Solution {

    public static void main(String[] args) {
        //编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。
        //
        //不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
        //
        //
        //
        //示例 1：
        //
        //输入：s = ["h","e","l","l","o"]
        //输出：["o","l","l","e","h"]



        char[] s = new char[]{'h','e','l','l','o'};
        // 结果：
        // ["o","l","l","e","h"]
        reverseString(s);

        printArray(s);
    }


    public static void reverseString(char[] s) {
        // 左右双指针
        int l = 0;
        int r = s.length - 1;
        // 一直到左指针>=右指针
        while (l < r) {
            // 左右指针不相等
            if (s[l] != s[r]) {
                // 替换
                char tmp = s[l];
                s[l] = s[r];
                s[r] = tmp;
            }

            l++;
            r--;
        }


        // 每次循环左指针++ 右指针--

    }
}