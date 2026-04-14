import java.util.*;

class Solution {

    public static void main(String[] args) {
        // 有两个非递减的数组nums1和nums2
        // 请合并nums2到nums1，使合并后的数组保持非递减排序
        // nums1的有效元素为m，nums2的有效元素为n。m + n = nums1.length
        // 例如
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{2, 5, 6};
        int n = 3;
        // 结果：
        // nums1=[1, 2, 2, 3, 5, 6]

        for (int i : nums1) {
            System.out.println(i);
        }
        merge(nums1, m, nums2, n);

        System.out.println("===========");

        for (int i : nums1) {
            System.out.println(i);
        }
    }


    // 提示1：如果从前往后填，nums1 前面的有效元素会被覆盖。那反过来呢？
    // 提示2：每次比较两个数组的最大值，放到 nums1 的最末尾，指针逐步前移
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // 解法一：暴力 — 合并后排序（不推荐）

        // 解法二：逆向双指针
        // 指针一：指向nums1的有效尾端
        int p1 = m - 1;
        // 指针二：指向nums2的有效尾端
        int p2 = n - 1;
        // 指针三：指向nums1的尾端
        int p = nums1.length - 1;

        // 从右向左遍历数组
        // 直到任意一个指针<0退出循环
        while (p1 >= 0 && p2 >= 0) {
            // 指针一和指针二比较大小
            if (nums1[p1] >= nums2[p2]) {
                // 更大的元素移动到指针三
                nums1[p] = nums1[p1];
                // 大元素指针左移
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }

            // 每次指针三左移
            p--;
        }

        // 如果nums2还有剩余，搬过去
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }

        // 如果是nums1还有剩余，不用管，因为已经在原位了，本身就是有序的

    }
}