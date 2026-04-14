package utils;

import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 排序工具类
 *
 * @author irony
 * @date 2024-03-09
 */
public class SortUtils {

    /**
     * 初始化一个随机数组
     *
     * @return 初始化好的随机数组
     */
    public static int[] generateRandomArray() {
        return generateRandomArray(10);
    }

    /**
     * 初始化一个随机数组
     *
     * @param size 数组大小
     * @return 初始化好的随机数组
     */
    public static int[] generateRandomArray(int size) {
        return generateRandomArray(size, 0, size * 10);
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
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(maxValue - minValue + 1) + minValue;
        }
        return arr;
    }

    /**
     * 打印数组
     *
     * @param arr 要打印的数组
     */
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * 打印数组
     *
     * @param func 排序函数
     * @param arr  数组
     */
    public static void printArrayTime(Runnable func, int[] arr) {
        printArrayTime(func, arr, true);
    }

    /**
     * 打印数组
     *
     * @param func  排序函数
     * @param arr   数组
     * @param print 是否打印数组
     */
    public static void printArrayTime(Runnable func, int[] arr, boolean print) {
        Set<Integer> origin = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        if (print) printArray(arr);
        long start = System.currentTimeMillis();
        func.run();
        long end = System.currentTimeMillis();
        if (print) printArray(arr);
        System.out.println("耗时 = " + (end - start));

        Set<Integer> sorted = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        if (!sorted.containsAll(origin)) {
            throw new RuntimeException("排序前后数组元素不一致");
        }
    }
}

