package utils;//package pers.tz.common;
//
//import javax.swing.*;
//import java.awt.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class BinaryTreeUtils {
//
//    private static final int RADIUS = 20; // 节点圆圈的半径
//    private static final int VERTICAL_GAP = 50; // 两个节点之间的垂直距离
//
//    // 静态内部类用于绘制二叉树
//    private static class BinaryTreeDrawing extends JPanel {
//        private TreeNode root;
//
//        public BinaryTreeDrawing(TreeNode root) {
//            this.root = root;
//        }
//
//        @Override
//        protected void paintComponent(Graphics g) {
//            super.paintComponent(g);
//            if (root != null) {
//                drawTree(g, getWidth() / 2, 30, getWidth() / 4, root);
//            }
//        }
//
//        private void drawTree(Graphics g, int x, int y, int hGap, TreeNode node) {
//            g.drawOval(x - RADIUS, y - RADIUS, 2 * RADIUS, 2 * RADIUS);
//            g.drawString(Integer.toString(node.val), x - 6, y + 4);
//            if (node.left != null) {
//                int xShift = x - hGap;
//                int yShift = y + VERTICAL_GAP;
//                g.drawLine(x, y, xShift, yShift);
//                drawTree(g, xShift, yShift, hGap / 2, node.left);
//            }
//            if (node.right != null) {
//                int xShift = x + hGap;
//                int yShift = y + VERTICAL_GAP;
//                g.drawLine(x, y, xShift, yShift);
//                drawTree(g, xShift, yShift, hGap / 2, node.right);
//            }
//        }
//    }
//
//    // 显示二叉树的图形表示
//    public static void showTree(TreeNode root) {
//        SwingUtilities.invokeLater(() -> {
//            JFrame frame = new JFrame("Binary Tree Visualization");
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.getContentPane().add(new BinaryTreeDrawing(root));
//            frame.setSize(400, 400);
//            frame.setLocationRelativeTo(null);
//            frame.setVisible(true);
//        });
//    }
//
//    // 遍历方法
//    public static List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList<>();
//        preorder(root, result);
//        return result;
//    }
//
//    private static void preorder(TreeNode node, List<Integer> result) {
//        if (node == null) return;
//        result.add(node.val);
//        preorder(node.left, result);
//        preorder(node.right, result);
//    }
//
//    public static List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList<>();
//        inorder(root, result);
//        return result;
//    }
//
//    private static void inorder(TreeNode node, List<Integer> result) {
//        if (node == null) return;
//        inorder(node.left, result);
//        result.add(node.val);
//        inorder(node.right, result);
//    }
//
//    public static List<Integer> postorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList<>();
//        postorder(root, result);
//        return result;
//    }
//
//    private static void postorder(TreeNode node, List<Integer> result) {
//        if (node == null) return;
//        postorder(node.left, result);
//        postorder(node.right, result);
//        result.add(node.val);
//    }
//
//    // 打印方法
//    public static void printTraversal(String method, TreeNode root) {
//        List<Integer> traversalResult;
//        switch (method.toLowerCase()) {
//            case "preorder":
//                traversalResult = preorderTraversal(root);
//                break;
//            case "inorder":
//                traversalResult = inorderTraversal(root);
//                break;
//            case "postorder":
//                traversalResult = postorderTraversal(root);
//                break;
//            default:
//                traversalResult = new ArrayList<>(); // 默认为空列表
//                System.out.println("Invalid traversal method. Choose from: preorder, inorder, postorder.");
//        }
//        System.out.println(method + ": " + traversalResult);
//    }
//}
