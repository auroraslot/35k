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
        // 先对每个str排序，覆盖保存到数组中；遍历strs，检查str在Map中是否存在，如果存在，将str添加到value；否则put到map
        // 最后map的values就是结果


        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String tmp = new String(charArray);
            if (map.containsKey(tmp)) {
                map.get(tmp).add(strs[i]);
            } else {
                map.put(tmp, new ArrayList<>(Collections.singletonList(strs[i])));
            }
        }

        return new ArrayList<>( map.values());
    }
}