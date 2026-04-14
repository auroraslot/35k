import java.util.*;

class Solution {

    public static void main(String[] args) {
        // 给一个非严格递增的数字，要求：1、对该数组去重；2、返回去重后的数组长度；
        // 例如
        int[] arr = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        // 结果：
        // 长度=5
        // 新数组=[0,1,2,3,4,_,_,_,_,_]

        int length = removeDuplicates(arr);
        System.out.println(length);
        for (int i : arr) {
            System.out.println(i);
        }
    }


    // 快慢指针
    public static int removeDuplicates(int[] nums) {
        // 慢指针：指向现在保留元素的位置
        int s = 0;
        // 快指针：向前扫描
        int f = 1;

        // 遍历数组
        for (int i = 0; i < nums.length - 1; i++) {
            // 快慢指针是否相等
            // 不相等，说明是需要保留的新元素
            if (nums[f] != nums[s]) {
                // 慢指针右移
                s++;
                // 快指针元素覆盖到慢指针位置
                nums[s] = nums[f];
            }
            // 每次循环快指针右移
            f++;
        }

        // 返回慢指针
        return s + 1;
    }
}