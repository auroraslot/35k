import sun.plugin.net.protocol.jar.CachedJarURLConnection;
import utils.ArrayUtils;

import java.util.*;

import static utils.ArrayUtils.printArray;

class Solution {

    public static void main(String[] args) {
        //给定一个字符串 s ，请你找出其中不含有重复字符的 最长 子串 的长度。
        //
        //
        //
        //示例 1:
        //
        //输入: s = "abcabcbb"
        //输出: 3
        //解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。注意 "bca" 和 "cab" 也是正确答案。

//         String s = "abcabcbb";
//         String s = "aab";
//        String s = "dvdf";
        String s = "ppwppwcww";
//        String s = "aabaab!bb";

        System.out.println(lengthOfLongestSubstring(s));
    }


    public static int lengthOfLongestSubstring(String s) {
        // 无重复字符的最长子串

        // 滑动窗口

        // 左指针：窗口尾端
        int l = 0;
        // 右指针：窗口首端
//        int r = 0;

        // 哈希表：字符是否出现过
        Set<Character> map = new HashSet<>();

        // 当前长度
        int cH = 0;
        // 最大长度
        int hH = 0;

        // 右指针扫描
        char[] charArray = s.toCharArray();
        for (int r = 0; r < charArray.length; r++) {
            char c = charArray[r];

            // 字符出现过
            while (map.contains(c)) {
                // 更新最大长度
                hH = Math.max(hH, cH);
                // 移动过程中的元素从哈希表中移除
                map.remove(charArray[l]);
                l++;
                // 当前长度-
                cH--;

                // 左指针右移，一直右移到重复字符所在的位置
//                while (c != charArray[l]) {
//
//
//                }
            }

//            else {
                // 没有出现过
                // 更新当前长度
                cH++;
                // 添加到哈希表
                map.add(charArray[r]);
//            }

        }



        // 返回最大长度

        return Math.max(hH, cH);

    }
}