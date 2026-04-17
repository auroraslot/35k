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
        // 用一个整数维护进位情况

        // 456 + 77，个位数进位为10；十位数进位为100，每次进位当前

    }


}