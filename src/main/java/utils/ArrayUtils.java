package utils;

import java.util.Random;

/**
 * @author irony
 * @date 2024-03-09
 */
public class ArrayUtils {
    /**
     * 初始化一个随机数组
     *
     * @return 初始化好的随机数组
     */
    public static int[] generateRandomArray() {
        return generateRandomArray(10, false);
    }

    /**
     * 初始化一个随机数组
     *
     * @param sorted 是否排序
     * @return 初始化好的随机数组
     */
    public static int[] generateRandomArray(boolean sorted) {
        return generateRandomArray(10, sorted);
    }

    /**
     * 初始化一个随机数组
     *
     * @param size   数组大小
     * @param sorted 是否排序
     * @return 初始化好的随机数组
     */
    public static int[] generateRandomArray(int size, boolean sorted) {
        return generateRandomArray(size, sorted, 0, size * 10);
    }

    /**
     * 初始化一个随机数组
     *
     * @param sorted   是否排序
     * @param minValue 数组元素最小值
     * @param maxValue 数组元素最大值
     * @return 初始化好的随机数组
     */
    public static int[] generateRandomArray(boolean sorted, int minValue, int maxValue) {
        return generateRandomArray(10, sorted, minValue, maxValue);
    }

    /**
     * 初始化一个随机数组
     *
     * @param size     数组大小
     * @param minValue 数组元素最小值
     * @param maxValue 数组元素最大值
     * @return 初始化好的随机数组
     */
    public static int[] generateRandomArray(int size, int minValue, int maxValue) {
        return generateRandomArray(size, false, minValue, maxValue);
    }

    /**
     * 初始化一个随机数组
     *
     * @param size     数组大小
     * @param sorted   是否排序
     * @param minValue 数组元素最小值
     * @param maxValue 数组元素最大值
     * @return 初始化好的随机数组
     */
    public static int[] generateRandomArray(int size, boolean sorted, int minValue, int maxValue) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(maxValue - minValue + 1) + minValue;
        }

        if (sorted) insertSort(arr);
        return arr;
    }

    /**
     * 打印数组
     *
     * @param arr 要打印的数组
     */
    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    /**
     * 打印数组
     *
     * @param arr 要打印的数组
     */
    public static void printArray(char[] arr) {
        for (char j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    /**
     * 插入排序
     */
    private static void insertSort(int[] ints) {
        for (int i = 1; i < ints.length; i++) {
            int newNumberIndex = i;

            while (newNumberIndex - 1 >= 0 && ints[newNumberIndex - 1] > ints[newNumberIndex]) {
                int temp = ints[newNumberIndex];
                ints[newNumberIndex] = ints[newNumberIndex - 1];
                ints[newNumberIndex - 1] = temp;

                newNumberIndex--;
            }
        }
    }
}
