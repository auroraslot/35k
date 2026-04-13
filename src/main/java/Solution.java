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


    public static int removeDuplicates(int[] nums) {
        // 两个指针

        // 慢指针：记录不相等的元素应该存放的位置
        int s = 0;
        // 快指针：向前扫描
        int f = 1;

        // 快慢指针元素不相等，说明遇到了新元素，慢指针右移后替换元素
        // 如果相等则忽略
        // 快指针每次循环都继续向前扫描
        // 最后的有效长度就是慢指针+1

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[s] != nums[f]) {
                s++;
                nums[s] = nums[f];
            }

            f++;
        }
        return s + 1;
    }
}