package utils;

import java.util.Random;

/**
 * @author irony
 * @date 2024-03-13
 */
public class TreeUtils {
    private static final Random random = new Random();
    private static final int NODE_COUNT = 10;
    private static final int[] VAL_RANGE = new int[] {1, 100};

    // ====================== 随机二叉树生成 ======================
    /**
     * 生成随机二叉树。
     *
     * @return 生成的二叉树的根节点。
     */
    public static TreeNode generateRandomTree() {
        return generateRandomTree(NODE_COUNT, VAL_RANGE);
    }

    /**
     * 生成随机二叉树。
     *
     * @param nodeCount 节点数量。
     * @return 生成的二叉树的根节点。
     */
    public static TreeNode generateRandomTree(int nodeCount) {
        return generateRandomTree(nodeCount, VAL_RANGE);
    }

    /**
     * 生成随机二叉树。
     *
     * @param valRange  节点值的范围，形式为{最小值, 最大值}。
     * @return 生成的二叉树的根节点。
     */
    public static TreeNode generateRandomTree(int[] valRange) {
        return generateRandomTree(NODE_COUNT, valRange);
    }

    /**
     * 生成随机二叉树。
     *
     * @param nodeCount 节点数量。
     * @param valRange  节点值的范围，形式为{最小值, 最大值}。
     * @return 生成的二叉树的根节点。
     */
    public static TreeNode generateRandomTree(int nodeCount, int[] valRange) {
        if (nodeCount <= 0) {
            return null;
        }

        return generateTreeHelper(nodeCount, valRange);
    }

    private static TreeNode generateTreeHelper(int nodeCount, int[] valRange) {
        if (nodeCount <= 0) {
            return null;
        }

        int value = random.nextInt(valRange[1] - valRange[0] + 1) + valRange[0];
        TreeNode root = new TreeNode(value);

        // 随机分配左右子树节点数量
        int leftNodeCount = random.nextInt(nodeCount); // 这里简单地随机分配，可能导致左重或右重
        int rightNodeCount = nodeCount - 1 - leftNodeCount;

        root.left = generateTreeHelper(leftNodeCount, valRange);
        root.right = generateTreeHelper(rightNodeCount, valRange);

        return root;
    }


    // ====================== 完全二叉树生成 ======================
    /**
     * 生成完全二叉树
     *
     * @return 完全二叉树的跟节点。
     */
    public static TreeNode generateCompleteBinaryTree() {
        return generateCompleteBinaryTree(NODE_COUNT, VAL_RANGE);
    }

    /**
     * 生成完全二叉树。
     *
     * @param nodeCount 节点总数。
     * @return 完全二叉树的根节点。
     */
    public static TreeNode generateCompleteBinaryTree(int nodeCount) {
        return generateCompleteBinaryTree(nodeCount, VAL_RANGE); // 默认范围为1到100
    }

    /**
     * 生成完全二叉树。
     *
     * @param valRange 节点值的范围，形式位{最小值, 最大值}。
     * @return 完全二叉树的根节点。
     */
    public static TreeNode generateCompleteBinaryTree(int[] valRange) {
        return generateCompleteBinaryTree(NODE_COUNT, valRange);
    }

    /**
     * 生成完全二叉树，允许自定义节点值的范围。
     *
     * @param nodeCount 节点总数。
     * @param valRange  节点值的范围，形式为{最小值, 最大值}。
     * @return 完全二叉树的根节点。
     */
    public static TreeNode generateCompleteBinaryTree(int nodeCount, int[] valRange) {
        if (nodeCount <= 0) return null;
        return createCompleteTree(1, nodeCount, valRange);
    }

    private static TreeNode createCompleteTree(int currentIndex, int nodeCount, int[] valRange) {
        if (currentIndex > nodeCount) {
            return null;
        }
        int value = getRandomValueInRange(valRange);
        TreeNode node = new TreeNode(value);

        node.left = createCompleteTree(2 * currentIndex, nodeCount, valRange);
        node.right = createCompleteTree(2 * currentIndex + 1, nodeCount, valRange);

        return node;
    }

    private static int getRandomValueInRange(int[] valRange) {
        return random.nextInt(valRange[1] - valRange[0] + 1) + valRange[0];
    }


    // ====================== 打印二叉树 ======================
    /**
     * 前序打印
     * 前指的是头节点在前
     *
     * @param root 根节点
     */
    public static void preorderPrint(TreeNode root) {
        preorderPrint(root, 1);
    }

    private static void preorderPrint(TreeNode root, int count) {
        if (count == 0) {
            System.out.println();
        }
        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");
        preorderPrint(root.left, ++count);
        preorderPrint(root.right, ++count);
    }

    /**
     * 中序打印
     * 中指的是头节点在中
     *
     * @param root 跟节点
     */
    public static void inorderPrint(TreeNode root) {
        inorderPrint(root, 0);
    }

    private static void inorderPrint(TreeNode root, int count) {
        if (count == 0) {
            System.out.println();
        }
        if (root == null) {
            return;
        }

        inorderPrint(root.left, ++count);
        System.out.print(root.val + " ");
        inorderPrint(root.right, ++count);
    }

    /**
     * 后序打印
     * 后指的是头节点在后
     *
     * @param root 跟节点
     */
    public static void postorderPrint(TreeNode root) {
        postorderPrint(root, 0);
    }

    private static void postorderPrint(TreeNode root, int count) {
        if (count == 0) {
            System.out.println();
        }
        if (root == null) {
            return;
        }

        postorderPrint(root.left, ++count);
        postorderPrint(root.right, ++count);
        System.out.print(root.val + " ");
    }
}

