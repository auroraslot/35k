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


    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // 排序后比较
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        Arrays.sort(sc);
        Arrays.sort(tc);

        for (int i = 0; i < sc.length; i++) {
            // 遇到不相等的返回false
            if (sc[i] != tc[i]) {
                return false;
            }
        }

        return true;
    }
}