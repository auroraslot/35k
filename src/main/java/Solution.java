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
        //给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和并同样以字符串形式返回。
        //
        //你不能使用任何內建的用于处理大整数的库（比如 BigInteger）， 也不能直接将输入的字符串转换为整数形式。
        //
        //示例 1：
        //
        //输入：num1 = "11", num2 = "123"
        //输出："134"
        //示例 2：
        //
        //输入：num1 = "456", num2 = "77"
        //输出："533"
        //示例 3：
        //
        //输入：num1 = "0", num2 = "0"
        //输出："0"


         String num1 = "11";
//        String num1 = "1";
//        String num1 = "456";
//        String num1 = "9";
         String num2 = "123";
//        String num2 = "9";
//        String num2 = "77";
//        String num2 = "99";


        System.out.println(addStrings(num1, num2));
    }


    public static String addStrings(String num1, String num2) {
        // 从右向左遍历字符串
        char[] cs1 = num1.toCharArray();
        char[] cs2 = num2.toCharArray();

        // 不用区分谁长谁短，反正两个指针遍历，其中一个遍历到底，还没到底的哪个再继续搞

        // 两个指针，指向最右端
        int p1 = cs1.length - 1;
        int p2 = cs2.length - 1;

        StringBuilder result = new StringBuilder();

        boolean jw = false;
        // 记录走到了哪里
        int idx = 0;

        // 两个都>=0则一直循环
        while (p1 >=0 && p2 >= 0) {
            // 从低位相加到长字符串的具体字符
            char c1 = cs1[p1];
            char c2 = cs2[p2];

            int n1 = c1 - '0';
            int n2 = c2 - '0';

            // 2者相加要先转为int
            int tmp = n1 + n2;
            if (jw) {
                tmp += 1;
                jw = false;
            }

            if (tmp >= 10) {
                tmp -= 10;
                jw = true;
            }

            // 本次计算结果
            result.insert(0, (char) (tmp + '0'));

            // 每次循环--
            p1--;
            p2--;
        }

        // 有字符还没走完，继续往前计算
        int p = p1 >= 0 ? p1 : p2;
        char[] cs = p1 >=0 ? cs1 : cs2;
        while (p >= 0) {
            int tmp = cs[p] - '0';
            // 是否有进位
            if (jw) {
                // 字符+1
                // c = (char) ((c - '0' + 1) + '0');
                tmp += 1;
                jw = false;
            }

            if (tmp >= 10) {
                tmp -= 10;
                jw = true;
            }

//            result.insert(0, c);
            result.insert(0, (char) (tmp + '0'));
            p--;
        }

        // 如果字符都走完了，但是有进位
        if (jw) {
            result.insert(0, '1');
        }

        // 相加时，判断进位标识存在
        // c1 = c1 + c2 + 1;

        // 相加之和>9
        // 则c1 = c1 + c2 - 10;
        // 记录进位标识

        return result.toString();
    }


}