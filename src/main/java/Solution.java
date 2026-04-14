import utils.ArrayUtils;

import java.util.*;

import static utils.ArrayUtils.printArray;

class Solution {

    public static void main(String[] args) {
        //给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
        //
        //请注意 ，必须在不复制数组的情况下原地对数组进行操作。
        //
        //
        //
        //示例 1:
        //
        //输入: nums = [0,1,0,3,12]
        //输出: [1,3,12,0,0]


        // 有一个数组nums
        // 将nums中的0移动到末尾，但是不能改变数组中元素的原有位置
        // 例如
        int[] nums = new int[]{0, 1, 0, 3, 12}; // [2,1]
        // 结果：
        // [1,3,12,0,0]
        printArray(nums);

        moveZeroes(nums);

        printArray(nums);
    }


    public static void moveZeroes(int[] nums) {
        // 0, 1, 0, 3, 12 - s=0;f=1
        // 1, 0, 0, 3, 12 - s=1;f=2
        // 1, 0, 0, 3, 12 - s=1;f=3
        // 1, 3, 0, 0, 12 - s=2;f=4
        // 1, 3, 12, 0, 0 - s=3;f=5
        // return


        // 双指针

        // 慢指针：指向当前需保留元素位置
        int s = 0;

        // 快指针：指向扫描位置
        for (int f = 1; f < nums.length; f++) {
            // 快指针不为0，慢指针为0
            if (nums[f] != 0) {
                int tmp = nums[s]; // [2,1]
                // 和慢指针替换
                nums[s] = nums[f];
                nums[f] = tmp;
                // 慢指针右移
                s++;
            }


            // 每次循环快指针都右移，直到底部
        }
    }
}