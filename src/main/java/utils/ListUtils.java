package utils;

import org.apache.commons.lang3.RandomUtils;

/**
 * @author irony
 * @date 2024-03-11
 */
public class ListUtils {

    private final static int DEFAULT_SIZE = 10;

    /**
     * 初始化链表
     *
     * @return 初始化好的链表头结点
     */
    public static ListNode generateList() {
        return generateList(DEFAULT_SIZE);
    }

    /**
     * 初始化链表
     *
     * @param size 链表大小
     * @return 初始化好的链表头结点
     */
    public static ListNode generateList(int size) {
        return generateList(size, false, 0, size * 10);
    }

    /**
     * 初始化链表
     *
     * @param sorted 是否有序
     * @return 初始化好的链表头结点
     */
    public static ListNode generateList(boolean sorted) {
        return generateList(DEFAULT_SIZE, sorted, 1, DEFAULT_SIZE * 10);
    }

    /**
     * 初始化链表
     *
     * @param sorted 是否有序
     * @param minValue 最小值
     * @param maxValue 最大值
     * @return 初始化好的链表头结点
     */
    public static ListNode generateList(boolean sorted, int minValue, int maxValue) {
        return generateList(DEFAULT_SIZE, sorted, minValue, maxValue);
    }

    /**
     * 初始化链表
     *
     * @param size 链表大小
     * @param minValue 随机数最小值
     * @param maxValue 随机数最大值
     * @return 初始化好的链表头结点
     */
    public static ListNode generateList(int size, int minValue, int maxValue) {
        return generateList(size, false, minValue, maxValue);
    }

    /**
     * 初始化链表
     *
     * @param size 链表大小
     * @param sorted 是否有序
     * @param minValue 随机数最小值
     * @param maxValue 随机数最大值
     * @return 初始化好的链表头结点
     */
    public static ListNode generateList(int size, boolean sorted, int minValue, int maxValue) {
        if (sorted) {
            return initSortedList(size, minValue, maxValue);
        }
        return initRandomList(size, minValue, maxValue);
    }

    /**
     * 初始化一个指定大小的随机链表
     *
     * @param size 链表大小
     * @param minValue 随机数最小值
     * @param maxValue 随机数最大值
     * @return 初始化好的链表头结点
     */
    public static ListNode initRandomList(int size, int minValue, int maxValue) {
        if (size <= 0) {
            return null;
        }
        ListNode head = new ListNode(RandomUtils.nextInt(minValue, maxValue), null);
        ListNode curr = head;
        for (int i = 1; i < size; i++) {
            curr.next = new ListNode(RandomUtils.nextInt(minValue, maxValue), null);
            curr = curr.next;
        }
        return head;
    }

    /**
     * 初始化一个指定大小的有序链表
     *
     * @param size 链表大小
     * @param minValue 随机数最小值
     * @param maxValue 随机数最大值
     * @return 初始化好的链表头结点
     */
    public static ListNode initSortedList(int size, int minValue, int maxValue) {
        if (size <= 0) {
            return null;
        }
        int[] values = ArrayUtils.generateRandomArray(size, true, minValue, maxValue);
        ListNode head = new ListNode(values[0], null);
        ListNode curr = head;
        for (int i = 1; i < size; i++) {
            curr.next = new ListNode(values[i], null);
            curr = curr.next;
        }
        return head;
    }

    /**
     * 打印链表
     *
     * @param head 链表头结点
     */
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    /**
     * 打印链表
     *
     * @param heads 链表头节点
     */
    public static void printList(ListNode... heads) {
        for (ListNode head : heads) {
            printList(head);
        }
    }
}



