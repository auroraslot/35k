import java.util.*;

class Solution {

    public static void main(String[] args) {
        // 有一个数组prices，prices[i]代表第i天的股票价格
        // 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
        // 返回最大利润，如果不能获取利润则返回 0
        // 例如
        int[] nums = new int[]{7, 1, 5, 3, 6, 4};
        // 结果：
        // 最大利润=5。  6 - 1

        int sum = maxProfit(nums);

        System.out.println(sum);
    }


    //  提示1：如果你已经知道历史最低价，那今天卖出的利润是多少？
    //  提示2：遍历的时候同时维护两个东西：历史最低价 和 最大利润
    public static int maxProfit(int[] prices) {
        // 本质是求最大的差值

        // 怎么求？
        // 记录历史最低价
        int minPrice = Integer.MAX_VALUE;
        // 记录最大利润
        int maxProfit = 0;

        // 遍历prices计算
        for (int i = 0; i < prices.length; i++) {
            // 不断的维护历史最低价
            minPrice = Math.min(minPrice, prices[i]);
            // 不断的计算最大利润
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }


        // 最后算出来的就是利润最高的
        return maxProfit;


        // 简单解就是暴力穷举
    }
}