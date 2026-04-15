import utils.ArrayUtils;

import java.util.*;

import static utils.ArrayUtils.printArray;

class Solution {

    public static void main(String[] args) {
        //给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的 字母异位词。
        //字母异位词是通过重新排列不同单词或短语的字母而形成的单词或短语，并使用所有原字母一次。
        //
        //
        //示例 1:
        //
        //输入: s = "anagram", t = "nagaram"
        //输出: true



        String s = "anagram";
        String t = "nagaram";
        boolean palindrome = isAnagram(s, t);

        System.out.println(palindrome);
    }


    // 哈希表的定义：哈希表不是特指 HashMap，而是一种思想。通过 key 直接定位到 value，查找时间 O(1)的结构都是哈希表。
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // 额外空间，哈希表
        int[] map = new int[26];
        // s+；t-，最后全是0则true，否则false
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i) - 'a']++;
            map[t.charAt(i) - 'a']--;
        }

        for (int i : map) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }
}