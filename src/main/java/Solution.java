import java.util.*;

class Solution {

    public static void main(String[] args) {
        // 给你一个数组和一个target，要求：原地移除等于target的元素；修改数组，使其前n个元素是不等于target的元素。
        // 例如target = 3
        int[] arr = new int[]{3, 2, 2, 3};
        // 结果：
        // 数量=2
        // 新数组=[2,2,_,_]

        int length = removeElement(arr, 3);
        System.out.println(length);
        for (int i : arr) {
            System.out.println(i);
        }
    }


    // 快慢指针
    public static int removeElement(int[] nums, int val) {
        // 慢指针：需要保留的位置
        int s = 0;
        // 快指针：向前扫描
        int f = 0;

        // 遍历数组
        for (int i = 0; i < nums.length; i++) {
            // 快指针是否等于val
            if (nums[f] != val) {
                // 不相等
                // 快指针元素覆盖到慢指针
                nums[s] = nums[f];
                // 慢指针右移
                s++;
            }

            // 每次循环快指针右移
            f++;
        }

        // 返回慢指针
        return s;
    }
}