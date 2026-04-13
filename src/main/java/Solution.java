import java.util.*;

class Solution {

    public static void main(String[] args) {
        // 一个整型数组， 一个目标值， 从数组中找出相加=目标值的元素，返回元素下标
        int[] arr = new int[]{2, 7, 11, 15};

        int[] ints = twoSum(arr, 17);

        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }


    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target - nums[i])) {
                return new int[] {map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }

        }


        return new int[0];
    }
}