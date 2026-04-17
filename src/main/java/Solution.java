import org.springframework.lang.NonNull;
import sun.plugin.net.protocol.jar.CachedJarURLConnection;
import utils.ArrayUtils;

import java.util.*;

import static utils.ArrayUtils.printArray;

class Solution {

    // 记录最大长度
    static int max = 0;
    // 最大长度变化时，记录起始位置
    static int start = 0;

    public static void main(String[] args) {
        //给你一个字符串 s，找到 s 中最长的 回文 子串。
        //回文子串：如果字符串向前和向后读都相同，则它满足 回文性。
        //
        //
        //示例 1：
        //
        //输入：s = "babad"
        //输出："bab"
        //解释："aba" 同样是符合题意的答案。



//        String s = "babad"; // 这个case左右指针直接扫描出来的就是最长的
        String s = "cbbd"; // 这个case左右指针直接扫描出来的就是最长的
//        String s = "bacabad"; // 这个case左右指针直接扫描出来的就是最长的

        // "bacabad" // 这种case直接左右指针扫描就扫不到了

        // 向外扫描，逐个元素扫描
        // 扫描过程中记录最大长度和回文子串


        System.out.println(longestPalindrome(s));
    }


    public static String longestPalindrome(String s) {
        // 双指针 + 中心扩展 + 逐个元素查找

        // 根据这两个要素可以拿到最长回文串

        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            // 奇数回文串
            extracted(i, i, cs);
            // 偶数回文串
            extracted(i, i+1, cs);
        }

        return s.substring(start, start + max);

        // 奇回文串，从扫描元素 和 扫描元素+1之间扩展

        // 左指针<0或右指针>length-1扫描结束
        // 左指针 != 右指针扫描结束
        // 结束时检查最大长度

        // 否则扫描过程中挪动左右指针

        // 最后按最大长度和起始位置返回字符串
//        return null;
    }

    private static void extracted(int l, int r, char[] cs) {
        while (l >=0 && r <= cs.length - 1 && cs[l] == cs[r]) {
            // 这里多挪了一次
            l--;
            r++;
        }

        // 实际长度是[l+1] - [r-1]
        if (max < r - l - 1) {
            start = l + 1;
            max = r - l - 1;
        }
    }

}