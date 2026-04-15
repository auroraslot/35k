import utils.ArrayUtils;

import java.util.*;

import static utils.ArrayUtils.printArray;

class Solution {

    public static void main(String[] args) {
        //编写一个函数来查找字符串数组中的最长公共前缀。
        //
        //如果不存在公共前缀，返回空字符串 ""。
        //
        //
        //
        //示例 1：
        //
        //输入：strs = ["flower","flow","flight"]
        //输出："fl"

        // String[] strs = new String[]{"flower", "flow", "flight"};
        String[] strs = new String[]{"ab", "a"};
        String s = longestCommonPrefix(strs);
        System.out.println(s);
    }


    public static String longestCommonPrefix(String[] strs) {
        // 最长公共前缀

        StringBuilder sb = new StringBuilder();

        // 遍历字符
        for (int i = 0; i < strs[0].length(); i++) {
            // 遍历数组
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length()) {
                    return sb.toString();
                }

                // 字符是否不相等
                if (strs[j].charAt(i) != strs[0].charAt(i)) {
                    // return公共子串
                    return sb.toString();
                }
            }

            // 相等字符记录公共子串
            sb.append(strs[0].charAt(i));
        }

        return sb.toString();
    }
}