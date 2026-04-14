import java.util.*;

class Solution {

    public static void main(String[] args) {
        // 有一个数组nums
        // 找出其中具有最大和的连续子数组（至少一个元素），并返回其子数组的最大和
        // 例如
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        // 结果：
        // 连续子数组=[4, -1, 2, 1]
        // 最大和=6

        int sum = maxSubArray(nums);

        System.out.println(sum);
    }


    public static int maxSubArray(int[] nums) {
        // dp[i] = max(dp[i - 1] + nums[i], nums[i])

        // 要拿到最大的，我要不要加上之前的数组的和？

        int sum = nums[0];
        int dpSum = nums[0];

        for (int i = 1; i < nums.length; i++) {// -2, 1, -3, 4, -1, 2, 1, -5, 4

            if (dpSum < 0) {
                dpSum = 0;
            }

            dpSum = dpSum + nums[i];
            sum = Math.max(sum, dpSum);

        }


        return sum;
    }
}