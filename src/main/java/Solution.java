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
        // 如何界定连续
        // 需要知道该元素是否有出现过
        // 如果出现过，则子数组中断，记录该子数组最大和

        // 两个指针，左指针和右指针
        // 左右指针起点相等
        // int l = 0;
        // int r = 0;

        // 一个结构，保存出现过的元素字典
        Set<Integer> map = new HashSet<>(nums.length);

        // 两个变量，历史最大和，当前和
        int cSum = 0;
        int hSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int r = i;
            // 一直处理到右指针到底为止
            while (r < nums.length) {// -2, 1, -3, 4, -1, 2, 1, -5, 4
                // 右指针往右扫描

                // 右指针指向元素是否出现过
                if (map.contains(nums[r])) {
                    // 如果出现过，子数组中断

                    // 如果当前和>历史最大和
                    if (cSum > hSum) {
                        // 覆盖历史最大和
                        hSum = cSum;
                        // 清除当前和
                        cSum = 0;
                    }
                    // 清除结构
                    map.clear();
                    // 左指针移动到右指针
                    // l = r;
                } else {
                    // 如果没出现过

                    // 加到当前和
                    cSum = cSum + nums[r];
                    // 保存到结构
                    map.add(nums[r]);
                    r++;
                }


            }

            hSum = Math.max(cSum, hSum);
            cSum = 0;
            map.clear();

        }

        // 返回历史和
        return hSum;
    }
}