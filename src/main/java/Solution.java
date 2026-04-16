import sun.plugin.net.protocol.jar.CachedJarURLConnection;
import utils.ArrayUtils;

import java.util.*;

import static utils.ArrayUtils.printArray;

class Solution {

    public static void main(String[] args) {
        //给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
        //
        //
        //
        //示例 1:
        //
        //输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
        //
        //输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
        //
        //解释：
        //
        //在 strs 中没有字符串可以通过重新排列来形成 "bat"。
        //字符串 "nat" 和 "tan" 是字母异位词，因为它们可以重新排列以形成彼此。
        //字符串 "ate" ，"eat" 和 "tea" 是字母异位词，因为它们可以重新排列以形成彼此。

        String[] strs = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(groupAnagrams(strs));
    }


    public static List<List<String>> groupAnagrams(String[] strs) {
        // 哈希表解法：
        // 字符一样的保存到同一个List
        // 如果辨别字符是否一样？哈希表一样说明一样
        // 怎么知道哈希表一样？数组元素一样
        // 把数组元素作为字符串去判定

        Map<String, List<String>> map = new HashMap<>();

        // 遍历strs
        for (String str : strs) {
            // 哈希表维护str
            int[] cs = new int[26];
            char[] charArray = str.toCharArray();
            for (char c : charArray) {
                cs[c - 'a']++;
            }

            // 按哈希表转为String
            StringBuilder sb = new StringBuilder();
            for (int c : cs) {
                sb.append(c).append("#");
            }

            // 将该String作为key，保存到map
            map.computeIfAbsent(sb.toString(), k -> new ArrayList<>()).add(str);
        }
        // 最后遍历结束时，map的values就是最后的结果
        return new ArrayList<>(map.values());
    }
}