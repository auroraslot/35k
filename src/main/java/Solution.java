import utils.ArrayUtils;

import java.util.*;

import static utils.ArrayUtils.printArray;

class Solution {

    public static void main(String[] args) {
        // 有一个数组nums
        // 返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
        // 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
        // 例如
        int[] nums = new int[]{3, 2, 3};
        // 结果：
        // 3
        int result = majorityElement(nums);
        System.out.println(result);
    }


    //  提示1：想象一个场景——一群人互相"对拼消耗"，一个人可以"消灭"一个不同阵营的人，最后活下来的是哪个阵营？
    //  提示2：只需要两个变量：候选人 和 票数。
    public static int majorityElement(int[] nums) {
        // 候选人，票数
        int c = 0;
        int t = 0;

        // 不同人参选票数抵消，多票数的候选人最后会留存下来
        for (int i = 0; i < nums.length; i++) {

            // 如果票数为0，则当前人候选
            if (t == 0) {
                c = nums[i];
            }

            // 票数抵消
            if (c == nums[i]) {
                // 参选人等于候选人，票数+1
                t++;
            } else {
                // 其他参选人，票数-1
                t--;
            }
        }

        // 最后获胜的返回
        return c;
    }
}