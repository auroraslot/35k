# 🎯 60天LeetCode刷题计划 - 后端工程师面试备战

> **目标人群**：业务开发方向后端工程师  
> **难度分布**：简单40% | 中等55% | 困难5%  
> **每日投入**：1.5-2小时（工作日）| 3-4小时（周末）  
> **预计总题量**：120-150题

---

## 📅 整体规划

| 阶段 | 时间 | 主题 | 目标 |
|------|------|------|------|
| 第一阶段 | Day 1-15 | 基础数据结构 | 数组、字符串、哈希表、链表 |
| 第二阶段 | Day 16-30 | 经典算法技巧 | 双指针、滑动窗口、二分查找、栈/队列 |
| 第三阶段 | Day 31-45 | 树与图 | 二叉树、BFS/DFS、堆 |
| 第四阶段 | Day 46-55 | 动态规划 | 一维DP、二维DP、经典模型 |
| 第五阶段 | Day 56-60 | 模拟面试 | 综合复习、限时练习 |

---

## 🔥 第一阶段：基础数据结构 (Day 1-15)

### Week 1: 数组与字符串 (Day 1-7)

#### Day 1: 数组基础
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 1 | [两数之和](https://leetcode.cn/problems/two-sum/) | 🟢简单 | 数组/哈希 | ⭐面试必考 |
| 26 | [删除有序数组中的重复项](https://leetcode.cn/problems/remove-duplicates-from-sorted-array/) | 🟢简单 | 双指针 | 原地操作 |
| 27 | [移除元素](https://leetcode.cn/problems/remove-element/) | 🟢简单 | 双指针 | |
| 88 | [合并两个有序数组](https://leetcode.cn/problems/merge-sorted-array/) | 🟢简单 | 双指针 | ⭐面试高频 |

#### Day 2: 数组进阶
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 53 | [最大子数组和](https://leetcode.cn/problems/maximum-subarray/) | 🟡中等 | DP/分治 | ⭐⭐必刷经典 |
| 121 | [买卖股票的最佳时机](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/) | 🟢简单 | 贪心/DP | ⭐⭐面试高频 |
| 283 | [移动零](https://leetcode.cn/problems/move-zeroes/) | 🟢简单 | 双指针 | |
| 169 | [多数元素](https://leetcode.cn/problems/majority-element/) | 🟢简单 | 哈希/摩尔投票 | 学习摩尔投票法 |

#### Day 3: 字符串基础
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 344 | [反转字符串](https://leetcode.cn/problems/reverse-string/) | 🟢简单 | 双指针 | |
| 125 | [验证回文串](https://leetcode.cn/problems/valid-palindrome/) | 🟢简单 | 双指针 | |
| 242 | [有效的字母异位词](https://leetcode.cn/problems/valid-anagram/) | 🟢简单 | 哈希 | |
| 14 | [最长公共前缀](https://leetcode.cn/problems/longest-common-prefix/) | 🟢简单 | 字符串 | |

#### Day 4: 字符串进阶
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 3 | [无重复字符的最长子串](https://leetcode.cn/problems/longest-substring-without-repeating-characters/) | 🟡中等 | 滑动窗口 | ⭐⭐⭐面试必考 |
| 49 | [字母异位词分组](https://leetcode.cn/problems/group-anagrams/) | 🟡中等 | 哈希 | ⭐面试高频 |
| 5 | [最长回文子串](https://leetcode.cn/problems/longest-palindromic-substring/) | 🟡中等 | DP/中心扩展 | ⭐⭐经典 |
| 415 | [字符串相加](https://leetcode.cn/problems/add-strings/) | 🟢简单 | 模拟 | ⭐支付场景常见 |

#### Day 5: 矩阵操作
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 48 | [旋转图像](https://leetcode.cn/problems/rotate-image/) | 🟡中等 | 矩阵 | ⭐面试高频 |
| 54 | [螺旋矩阵](https://leetcode.cn/problems/spiral-matrix/) | 🟡中等 | 模拟 | ⭐⭐面试高频 |
| 73 | [矩阵置零](https://leetcode.cn/problems/set-matrix-zeroes/) | 🟡中等 | 矩阵 | |
| 36 | [有效的数独](https://leetcode.cn/problems/valid-sudoku/) | 🟡中等 | 哈希 | |

#### Day 6: 数组技巧
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 238 | [除自身以外数组的乘积](https://leetcode.cn/problems/product-of-array-except-self/) | 🟡中等 | 前缀积 | ⭐⭐经典 |
| 41 | [缺失的第一个正数](https://leetcode.cn/problems/first-missing-positive/) | 🔴困难 | 原地哈希 | ⭐重要Hard |
| 560 | [和为 K 的子数组](https://leetcode.cn/problems/subarray-sum-equals-k/) | 🟡中等 | 前缀和/哈希 | ⭐⭐面试高频 |
| 442 | [数组中重复的数据](https://leetcode.cn/problems/find-all-duplicates-in-an-array/) | 🟡中等 | 原地标记 | |

#### Day 7: 周末复习 + 补充
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 15 | [三数之和](https://leetcode.cn/problems/3sum/) | 🟡中等 | 双指针 | ⭐⭐⭐面试必考 |
| 18 | [四数之和](https://leetcode.cn/problems/4sum/) | 🟡中等 | 双指针 | 延伸练习 |
| 56 | [合并区间](https://leetcode.cn/problems/merge-intervals/) | 🟡中等 | 排序 | ⭐⭐面试高频 |
| 57 | [插入区间](https://leetcode.cn/problems/insert-interval/) | 🟡中等 | 模拟 | |

---

### Week 2: 哈希表与链表 (Day 8-14)

#### Day 8: 哈希表基础
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 217 | [存在重复元素](https://leetcode.cn/problems/contains-duplicate/) | 🟢简单 | 哈希 | |
| 219 | [存在重复元素 II](https://leetcode.cn/problems/contains-duplicate-ii/) | 🟢简单 | 哈希/滑窗 | |
| 349 | [两个数组的交集](https://leetcode.cn/problems/intersection-of-two-arrays/) | 🟢简单 | 哈希 | |
| 350 | [两个数组的交集 II](https://leetcode.cn/problems/intersection-of-two-arrays-ii/) | 🟢简单 | 哈希 | |

#### Day 9: 哈希表进阶
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 146 | [LRU 缓存](https://leetcode.cn/problems/lru-cache/) | 🟡中等 | 设计/哈希+链表 | ⭐⭐⭐面试必考 |
| 128 | [最长连续序列](https://leetcode.cn/problems/longest-consecutive-sequence/) | 🟡中等 | 哈希 | ⭐⭐面试高频 |
| 380 | [O(1) 时间插入、删除和获取随机元素](https://leetcode.cn/problems/insert-delete-getrandom-o1/) | 🟡中等 | 设计 | |
| 454 | [四数相加 II](https://leetcode.cn/problems/4sum-ii/) | 🟡中等 | 哈希 | |

#### Day 10: 链表基础
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 206 | [反转链表](https://leetcode.cn/problems/reverse-linked-list/) | 🟢简单 | 链表 | ⭐⭐⭐面试必考 |
| 21 | [合并两个有序链表](https://leetcode.cn/problems/merge-two-sorted-lists/) | 🟢简单 | 链表 | ⭐⭐面试高频 |
| 83 | [删除排序链表中的重复元素](https://leetcode.cn/problems/remove-duplicates-from-sorted-list/) | 🟢简单 | 链表 | |
| 203 | [移除链表元素](https://leetcode.cn/problems/remove-linked-list-elements/) | 🟢简单 | 链表 | |

#### Day 11: 链表进阶
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 92 | [反转链表 II](https://leetcode.cn/problems/reverse-linked-list-ii/) | 🟡中等 | 链表 | ⭐面试高频 |
| 141 | [环形链表](https://leetcode.cn/problems/linked-list-cycle/) | 🟢简单 | 快慢指针 | ⭐⭐面试必考 |
| 142 | [环形链表 II](https://leetcode.cn/problems/linked-list-cycle-ii/) | 🟡中等 | 快慢指针 | ⭐⭐面试高频 |
| 160 | [相交链表](https://leetcode.cn/problems/intersection-of-two-linked-lists/) | 🟢简单 | 双指针 | ⭐面试高频 |

#### Day 12: 链表综合
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 19 | [删除链表的倒数第 N 个结点](https://leetcode.cn/problems/remove-nth-node-from-end-of-list/) | 🟡中等 | 双指针 | ⭐⭐面试高频 |
| 24 | [两两交换链表中的节点](https://leetcode.cn/problems/swap-nodes-in-pairs/) | 🟡中等 | 链表 | |
| 234 | [回文链表](https://leetcode.cn/problems/palindrome-linked-list/) | 🟢简单 | 快慢指针 | ⭐面试高频 |
| 876 | [链表的中间结点](https://leetcode.cn/problems/middle-of-the-linked-list/) | 🟢简单 | 快慢指针 | |

#### Day 13: 链表高级
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 25 | [K 个一组翻转链表](https://leetcode.cn/problems/reverse-nodes-in-k-group/) | 🔴困难 | 链表 | ⭐⭐字节必考 |
| 23 | [合并 K 个升序链表](https://leetcode.cn/problems/merge-k-sorted-lists/) | 🔴困难 | 链表/堆 | ⭐⭐面试高频 |
| 138 | [随机链表的复制](https://leetcode.cn/problems/copy-list-with-random-pointer/) | 🟡中等 | 链表/哈希 | ⭐面试高频 |
| 148 | [排序链表](https://leetcode.cn/problems/sort-list/) | 🟡中等 | 链表/归并 | |

#### Day 14: 周末复习
- 复习本周所有链表题目，确保能手写反转链表
- 重做 LRU 缓存，确保理解哈希表+双向链表的设计
- 复习快慢指针的应用场景

---

## ⚡ 第二阶段：经典算法技巧 (Day 16-30)

### Week 3: 双指针与滑动窗口 (Day 15-21)

#### Day 15: 双指针基础
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 167 | [两数之和 II](https://leetcode.cn/problems/two-sum-ii-input-array-is-sorted/) | 🟡中等 | 双指针 | |
| 11 | [盛最多水的容器](https://leetcode.cn/problems/container-with-most-water/) | 🟡中等 | 双指针 | ⭐⭐面试高频 |
| 42 | [接雨水](https://leetcode.cn/problems/trapping-rain-water/) | 🔴困难 | 双指针/单调栈 | ⭐⭐⭐面试必考 |
| 75 | [颜色分类](https://leetcode.cn/problems/sort-colors/) | 🟡中等 | 双指针 | 荷兰国旗问题 |

#### Day 16: 滑动窗口基础
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 209 | [长度最小的子数组](https://leetcode.cn/problems/minimum-size-subarray-sum/) | 🟡中等 | 滑动窗口 | ⭐经典模板 |
| 643 | [子数组最大平均数 I](https://leetcode.cn/problems/maximum-average-subarray-i/) | 🟢简单 | 滑动窗口 | |
| 1004 | [最大连续1的个数 III](https://leetcode.cn/problems/max-consecutive-ones-iii/) | 🟡中等 | 滑动窗口 | |
| 1456 | [定长子串中元音的最大数目](https://leetcode.cn/problems/maximum-number-of-vowels-in-a-substring-of-given-length/) | 🟡中等 | 滑动窗口 | |

#### Day 17: 滑动窗口进阶
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 76 | [最小覆盖子串](https://leetcode.cn/problems/minimum-window-substring/) | 🔴困难 | 滑动窗口 | ⭐⭐⭐面试必考 |
| 438 | [找到字符串中所有字母异位词](https://leetcode.cn/problems/find-all-anagrams-in-a-string/) | 🟡中等 | 滑动窗口 | ⭐面试高频 |
| 567 | [字符串的排列](https://leetcode.cn/problems/permutation-in-string/) | 🟡中等 | 滑动窗口 | |
| 239 | [滑动窗口最大值](https://leetcode.cn/problems/sliding-window-maximum/) | 🔴困难 | 单调队列 | ⭐⭐面试高频 |

#### Day 18: 二分查找基础
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 704 | [二分查找](https://leetcode.cn/problems/binary-search/) | 🟢简单 | 二分 | 基础模板 |
| 35 | [搜索插入位置](https://leetcode.cn/problems/search-insert-position/) | 🟢简单 | 二分 | |
| 34 | [在排序数组中查找元素的第一个和最后一个位置](https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/) | 🟡中等 | 二分 | ⭐⭐面试高频 |
| 69 | [x 的平方根](https://leetcode.cn/problems/sqrtx/) | 🟢简单 | 二分 | |

#### Day 19: 二分查找进阶
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 33 | [搜索旋转排序数组](https://leetcode.cn/problems/search-in-rotated-sorted-array/) | 🟡中等 | 二分 | ⭐⭐⭐面试必考 |
| 153 | [寻找旋转排序数组中的最小值](https://leetcode.cn/problems/find-minimum-in-rotated-sorted-array/) | 🟡中等 | 二分 | ⭐面试高频 |
| 162 | [寻找峰值](https://leetcode.cn/problems/find-peak-element/) | 🟡中等 | 二分 | |
| 74 | [搜索二维矩阵](https://leetcode.cn/problems/search-a-2d-matrix/) | 🟡中等 | 二分 | ⭐面试高频 |

#### Day 20: 二分查找应用
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 875 | [爱吃香蕉的珂珂](https://leetcode.cn/problems/koko-eating-bananas/) | 🟡中等 | 二分答案 | |
| 1011 | [在 D 天内送达包裹的能力](https://leetcode.cn/problems/capacity-to-ship-packages-within-d-days/) | 🟡中等 | 二分答案 | |
| 4 | [寻找两个正序数组的中位数](https://leetcode.cn/problems/median-of-two-sorted-arrays/) | 🔴困难 | 二分 | ⭐⭐经典Hard |
| 240 | [搜索二维矩阵 II](https://leetcode.cn/problems/search-a-2d-matrix-ii/) | 🟡中等 | 二分/Z形查找 | |

#### Day 21: 周末复习
- 整理滑动窗口模板代码
- 整理二分查找的三种写法（左闭右闭、左闭右开、左开右闭）
- 重做本周的高频面试题

---

### Week 4: 栈、队列与排序 (Day 22-28)

#### Day 22: 栈基础
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 20 | [有效的括号](https://leetcode.cn/problems/valid-parentheses/) | 🟢简单 | 栈 | ⭐⭐面试必考 |
| 155 | [最小栈](https://leetcode.cn/problems/min-stack/) | 🟡中等 | 设计/栈 | ⭐面试高频 |
| 232 | [用栈实现队列](https://leetcode.cn/problems/implement-queue-using-stacks/) | 🟢简单 | 栈/设计 | ⭐面试高频 |
| 225 | [用队列实现栈](https://leetcode.cn/problems/implement-stack-using-queues/) | 🟢简单 | 队列/设计 | |

#### Day 23: 单调栈
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 739 | [每日温度](https://leetcode.cn/problems/daily-temperatures/) | 🟡中等 | 单调栈 | ⭐⭐面试高频 |
| 496 | [下一个更大元素 I](https://leetcode.cn/problems/next-greater-element-i/) | 🟢简单 | 单调栈 | |
| 503 | [下一个更大元素 II](https://leetcode.cn/problems/next-greater-element-ii/) | 🟡中等 | 单调栈 | |
| 84 | [柱状图中最大的矩形](https://leetcode.cn/problems/largest-rectangle-in-histogram/) | 🔴困难 | 单调栈 | ⭐⭐经典 |

#### Day 24: 栈的应用
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 150 | [逆波兰表达式求值](https://leetcode.cn/problems/evaluate-reverse-polish-notation/) | 🟡中等 | 栈 | ⭐面试高频 |
| 227 | [基本计算器 II](https://leetcode.cn/problems/basic-calculator-ii/) | 🟡中等 | 栈 | ⭐⭐面试高频 |
| 394 | [字符串解码](https://leetcode.cn/problems/decode-string/) | 🟡中等 | 栈 | ⭐⭐面试高频 |
| 71 | [简化路径](https://leetcode.cn/problems/simplify-path/) | 🟡中等 | 栈 | |

#### Day 25: 排序算法
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 912 | [排序数组](https://leetcode.cn/problems/sort-an-array/) | 🟡中等 | 排序 | 手写快排/归并 |
| 215 | [数组中的第K个最大元素](https://leetcode.cn/problems/kth-largest-element-in-an-array/) | 🟡中等 | 快速选择/堆 | ⭐⭐⭐面试必考 |
| 347 | [前 K 个高频元素](https://leetcode.cn/problems/top-k-frequent-elements/) | 🟡中等 | 堆/桶排序 | ⭐⭐面试高频 |
| 179 | [最大数](https://leetcode.cn/problems/largest-number/) | 🟡中等 | 排序 | |

#### Day 26: 堆与优先队列
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 703 | [数据流中的第 K 大元素](https://leetcode.cn/problems/kth-largest-element-in-a-stream/) | 🟢简单 | 堆 | |
| 295 | [数据流的中位数](https://leetcode.cn/problems/find-median-from-data-stream/) | 🔴困难 | 双堆 | ⭐⭐经典 |
| 373 | [查找和最小的 K 对数字](https://leetcode.cn/problems/find-k-pairs-with-smallest-sums/) | 🟡中等 | 堆 | |
| 1046 | [最后一块石头的重量](https://leetcode.cn/problems/last-stone-weight/) | 🟢简单 | 堆 | |

#### Day 27: 贪心算法
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 55 | [跳跃游戏](https://leetcode.cn/problems/jump-game/) | 🟡中等 | 贪心 | ⭐⭐面试高频 |
| 45 | [跳跃游戏 II](https://leetcode.cn/problems/jump-game-ii/) | 🟡中等 | 贪心 | ⭐面试高频 |
| 455 | [分发饼干](https://leetcode.cn/problems/assign-cookies/) | 🟢简单 | 贪心 | |
| 435 | [无重叠区间](https://leetcode.cn/problems/non-overlapping-intervals/) | 🟡中等 | 贪心 | ⭐面试高频 |

#### Day 28: 周末复习
- 复习单调栈模板
- 手写快速排序和归并排序
- 理解堆的实现原理

---

## 🌳 第三阶段：树与图 (Day 31-45)

### Week 5: 二叉树基础 (Day 29-35)

#### Day 29: 二叉树遍历
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 94 | [二叉树的中序遍历](https://leetcode.cn/problems/binary-tree-inorder-traversal/) | 🟢简单 | 树 | ⭐⭐面试必考 |
| 144 | [二叉树的前序遍历](https://leetcode.cn/problems/binary-tree-preorder-traversal/) | 🟢简单 | 树 | |
| 145 | [二叉树的后序遍历](https://leetcode.cn/problems/binary-tree-postorder-traversal/) | 🟢简单 | 树 | |
| 102 | [二叉树的层序遍历](https://leetcode.cn/problems/binary-tree-level-order-traversal/) | 🟡中等 | BFS | ⭐⭐⭐面试必考 |

#### Day 30: 二叉树属性
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 104 | [二叉树的最大深度](https://leetcode.cn/problems/maximum-depth-of-binary-tree/) | 🟢简单 | 递归/BFS | ⭐面试高频 |
| 111 | [二叉树的最小深度](https://leetcode.cn/problems/minimum-depth-of-binary-tree/) | 🟢简单 | BFS | |
| 101 | [对称二叉树](https://leetcode.cn/problems/symmetric-tree/) | 🟢简单 | 递归 | ⭐面试高频 |
| 226 | [翻转二叉树](https://leetcode.cn/problems/invert-binary-tree/) | 🟢简单 | 递归 | ⭐⭐面试高频 |

#### Day 31: 二叉树构造
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 105 | [从前序与中序遍历序列构造二叉树](https://leetcode.cn/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) | 🟡中等 | 递归 | ⭐⭐⭐面试必考 |
| 106 | [从中序与后序遍历序列构造二叉树](https://leetcode.cn/problems/construct-binary-tree-from-inorder-and-postorder-traversal/) | 🟡中等 | 递归 | |
| 654 | [最大二叉树](https://leetcode.cn/problems/maximum-binary-tree/) | 🟡中等 | 递归 | |
| 617 | [合并二叉树](https://leetcode.cn/problems/merge-two-binary-trees/) | 🟢简单 | 递归 | |

#### Day 32: 二叉树路径
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 112 | [路径总和](https://leetcode.cn/problems/path-sum/) | 🟢简单 | 递归/DFS | ⭐面试高频 |
| 113 | [路径总和 II](https://leetcode.cn/problems/path-sum-ii/) | 🟡中等 | 回溯 | |
| 437 | [路径总和 III](https://leetcode.cn/problems/path-sum-iii/) | 🟡中等 | 前缀和/DFS | ⭐面试高频 |
| 124 | [二叉树中的最大路径和](https://leetcode.cn/problems/binary-tree-maximum-path-sum/) | 🔴困难 | 递归 | ⭐⭐面试高频 |

#### Day 33: 二叉树祖先
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 236 | [二叉树的最近公共祖先](https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-tree/) | 🟡中等 | 递归 | ⭐⭐⭐面试必考 |
| 235 | [二叉搜索树的最近公共祖先](https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-search-tree/) | 🟡中等 | BST | |
| 199 | [二叉树的右视图](https://leetcode.cn/problems/binary-tree-right-side-view/) | 🟡中等 | BFS/DFS | ⭐⭐面试高频 |
| 114 | [二叉树展开为链表](https://leetcode.cn/problems/flatten-binary-tree-to-linked-list/) | 🟡中等 | 递归 | ⭐面试高频 |

#### Day 34: 二叉搜索树
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 98 | [验证二叉搜索树](https://leetcode.cn/problems/validate-binary-search-tree/) | 🟡中等 | 递归/中序 | ⭐⭐⭐面试必考 |
| 700 | [二叉搜索树中的搜索](https://leetcode.cn/problems/search-in-a-binary-search-tree/) | 🟢简单 | BST | |
| 701 | [二叉搜索树中的插入操作](https://leetcode.cn/problems/insert-into-a-binary-search-tree/) | 🟡中等 | BST | |
| 450 | [删除二叉搜索树中的节点](https://leetcode.cn/problems/delete-node-in-a-bst/) | 🟡中等 | BST | ⭐面试高频 |

#### Day 35: BST进阶
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 230 | [二叉搜索树中第K小的元素](https://leetcode.cn/problems/kth-smallest-element-in-a-bst/) | 🟡中等 | BST/中序 | ⭐面试高频 |
| 108 | [将有序数组转换为二叉搜索树](https://leetcode.cn/problems/convert-sorted-array-to-binary-search-tree/) | 🟢简单 | 递归 | |
| 538 | [把二叉搜索树转换为累加树](https://leetcode.cn/problems/convert-bst-to-greater-tree/) | 🟡中等 | BST | |
| 173 | [二叉搜索树迭代器](https://leetcode.cn/problems/binary-search-tree-iterator/) | 🟡中等 | 设计/栈 | |

---

### Week 6: BFS/DFS与回溯 (Day 36-42)

#### Day 36: BFS基础
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 200 | [岛屿数量](https://leetcode.cn/problems/number-of-islands/) | 🟡中等 | BFS/DFS | ⭐⭐⭐面试必考 |
| 994 | [腐烂的橘子](https://leetcode.cn/problems/rotting-oranges/) | 🟡中等 | BFS | ⭐⭐面试高频 |
| 542 | [01 矩阵](https://leetcode.cn/problems/01-matrix/) | 🟡中等 | BFS | |
| 1162 | [地图分析](https://leetcode.cn/problems/as-far-from-land-as-possible/) | 🟡中等 | BFS | |

#### Day 37: DFS应用
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 695 | [岛屿的最大面积](https://leetcode.cn/problems/max-area-of-island/) | 🟡中等 | DFS | ⭐面试高频 |
| 463 | [岛屿的周长](https://leetcode.cn/problems/island-perimeter/) | 🟢简单 | DFS | |
| 130 | [被围绕的区域](https://leetcode.cn/problems/surrounded-regions/) | 🟡中等 | DFS | |
| 417 | [太平洋大西洋水流问题](https://leetcode.cn/problems/pacific-atlantic-water-flow/) | 🟡中等 | DFS | |

#### Day 38: 回溯基础
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 46 | [全排列](https://leetcode.cn/problems/permutations/) | 🟡中等 | 回溯 | ⭐⭐⭐面试必考 |
| 47 | [全排列 II](https://leetcode.cn/problems/permutations-ii/) | 🟡中等 | 回溯 | 去重技巧 |
| 78 | [子集](https://leetcode.cn/problems/subsets/) | 🟡中等 | 回溯 | ⭐⭐面试高频 |
| 90 | [子集 II](https://leetcode.cn/problems/subsets-ii/) | 🟡中等 | 回溯 | |

#### Day 39: 回溯进阶
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 39 | [组合总和](https://leetcode.cn/problems/combination-sum/) | 🟡中等 | 回溯 | ⭐⭐面试高频 |
| 40 | [组合总和 II](https://leetcode.cn/problems/combination-sum-ii/) | 🟡中等 | 回溯 | |
| 77 | [组合](https://leetcode.cn/problems/combinations/) | 🟡中等 | 回溯 | |
| 216 | [组合总和 III](https://leetcode.cn/problems/combination-sum-iii/) | 🟡中等 | 回溯 | |

#### Day 40: 回溯综合
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 17 | [电话号码的字母组合](https://leetcode.cn/problems/letter-combinations-of-a-phone-number/) | 🟡中等 | 回溯 | ⭐⭐面试高频 |
| 22 | [括号生成](https://leetcode.cn/problems/generate-parentheses/) | 🟡中等 | 回溯 | ⭐⭐⭐面试必考 |
| 79 | [单词搜索](https://leetcode.cn/problems/word-search/) | 🟡中等 | 回溯/DFS | ⭐面试高频 |
| 131 | [分割回文串](https://leetcode.cn/problems/palindrome-partitioning/) | 🟡中等 | 回溯 | |

#### Day 41: 图论基础
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 207 | [课程表](https://leetcode.cn/problems/course-schedule/) | 🟡中等 | 拓扑排序 | ⭐⭐⭐面试必考 |
| 210 | [课程表 II](https://leetcode.cn/problems/course-schedule-ii/) | 🟡中等 | 拓扑排序 | ⭐面试高频 |
| 133 | [克隆图](https://leetcode.cn/problems/clone-graph/) | 🟡中等 | BFS/DFS | |
| 399 | [除法求值](https://leetcode.cn/problems/evaluate-division/) | 🟡中等 | 图/BFS | |

#### Day 42: 周末复习
- 整理回溯模板代码
- 复习BFS/DFS遍历顺序
- 理解拓扑排序的应用场景

---

## 🧮 第四阶段：动态规划 (Day 43-55)

### Week 7: 一维动态规划 (Day 43-49)

#### Day 43: DP入门
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 509 | [斐波那契数](https://leetcode.cn/problems/fibonacci-number/) | 🟢简单 | DP | 入门 |
| 70 | [爬楼梯](https://leetcode.cn/problems/climbing-stairs/) | 🟢简单 | DP | ⭐⭐面试高频 |
| 746 | [使用最小花费爬楼梯](https://leetcode.cn/problems/min-cost-climbing-stairs/) | 🟢简单 | DP | |
| 118 | [杨辉三角](https://leetcode.cn/problems/pascals-triangle/) | 🟢简单 | DP | |

#### Day 44: 打家劫舍系列
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 198 | [打家劫舍](https://leetcode.cn/problems/house-robber/) | 🟡中等 | DP | ⭐⭐⭐面试必考 |
| 213 | [打家劫舍 II](https://leetcode.cn/problems/house-robber-ii/) | 🟡中等 | DP | ⭐面试高频 |
| 337 | [打家劫舍 III](https://leetcode.cn/problems/house-robber-iii/) | 🟡中等 | 树形DP | |
| 740 | [删除并获得点数](https://leetcode.cn/problems/delete-and-earn/) | 🟡中等 | DP | |

#### Day 45: 股票问题
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 121 | [买卖股票的最佳时机](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/) | 🟢简单 | DP | ⭐⭐复习 |
| 122 | [买卖股票的最佳时机 II](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii/) | 🟡中等 | 贪心/DP | ⭐面试高频 |
| 123 | [买卖股票的最佳时机 III](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-iii/) | 🔴困难 | DP | |
| 309 | [最佳买卖股票时机含冷冻期](https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-with-cooldown/) | 🟡中等 | DP | ⭐面试高频 |

#### Day 46: 子序列问题
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 300 | [最长递增子序列](https://leetcode.cn/problems/longest-increasing-subsequence/) | 🟡中等 | DP/二分 | ⭐⭐⭐面试必考 |
| 674 | [最长连续递增序列](https://leetcode.cn/problems/longest-continuous-increasing-subsequence/) | 🟢简单 | DP | |
| 718 | [最长重复子数组](https://leetcode.cn/problems/maximum-length-of-repeated-subarray/) | 🟡中等 | DP | |
| 1143 | [最长公共子序列](https://leetcode.cn/problems/longest-common-subsequence/) | 🟡中等 | DP | ⭐⭐⭐面试必考 |

#### Day 47: 字符串DP
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 72 | [编辑距离](https://leetcode.cn/problems/edit-distance/) | 🟡中等 | DP | ⭐⭐⭐面试必考 |
| 583 | [两个字符串的删除操作](https://leetcode.cn/problems/delete-operation-for-two-strings/) | 🟡中等 | DP | |
| 516 | [最长回文子序列](https://leetcode.cn/problems/longest-palindromic-subsequence/) | 🟡中等 | DP | |
| 647 | [回文子串](https://leetcode.cn/problems/palindromic-substrings/) | 🟡中等 | DP/中心扩展 | |

#### Day 48: 背包问题
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 416 | [分割等和子集](https://leetcode.cn/problems/partition-equal-subset-sum/) | 🟡中等 | 0-1背包 | ⭐⭐面试高频 |
| 494 | [目标和](https://leetcode.cn/problems/target-sum/) | 🟡中等 | 背包/DFS | ⭐面试高频 |
| 322 | [零钱兑换](https://leetcode.cn/problems/coin-change/) | 🟡中等 | 完全背包 | ⭐⭐⭐面试必考 |
| 518 | [零钱兑换 II](https://leetcode.cn/problems/coin-change-ii/) | 🟡中等 | 完全背包 | ⭐面试高频 |

#### Day 49: 周末复习
- 整理DP状态转移方程模板
- 复习股票、背包问题的状态定义
- 重做本周的面试高频题

---

### Week 8: 二维DP与综合 (Day 50-55)

#### Day 50: 二维DP
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 62 | [不同路径](https://leetcode.cn/problems/unique-paths/) | 🟡中等 | DP | ⭐⭐面试高频 |
| 63 | [不同路径 II](https://leetcode.cn/problems/unique-paths-ii/) | 🟡中等 | DP | |
| 64 | [最小路径和](https://leetcode.cn/problems/minimum-path-sum/) | 🟡中等 | DP | ⭐面试高频 |
| 120 | [三角形最小路径和](https://leetcode.cn/problems/triangle/) | 🟡中等 | DP | |

#### Day 51: 区间DP与其他
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 139 | [单词拆分](https://leetcode.cn/problems/word-break/) | 🟡中等 | DP | ⭐⭐⭐面试必考 |
| 152 | [乘积最大子数组](https://leetcode.cn/problems/maximum-product-subarray/) | 🟡中等 | DP | ⭐⭐面试高频 |
| 91 | [解码方法](https://leetcode.cn/problems/decode-ways/) | 🟡中等 | DP | ⭐面试高频 |
| 221 | [最大正方形](https://leetcode.cn/problems/maximal-square/) | 🟡中等 | DP | ⭐面试高频 |

#### Day 52: DP综合练习
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 32 | [最长有效括号](https://leetcode.cn/problems/longest-valid-parentheses/) | 🔴困难 | DP/栈 | ⭐经典Hard |
| 10 | [正则表达式匹配](https://leetcode.cn/problems/regular-expression-matching/) | 🔴困难 | DP | 了解即可 |
| 44 | [通配符匹配](https://leetcode.cn/problems/wildcard-matching/) | 🔴困难 | DP | 了解即可 |
| 312 | [戳气球](https://leetcode.cn/problems/burst-balloons/) | 🔴困难 | 区间DP | 了解即可 |

---

## 🎯 第五阶段：模拟面试冲刺 (Day 56-60)

### Day 53-55: 位运算与数学
| 题号 | 题目 | 难度 | 标签 | 备注 |
|------|------|------|------|------|
| 136 | [只出现一次的数字](https://leetcode.cn/problems/single-number/) | 🟢简单 | 位运算 | ⭐⭐面试高频 |
| 191 | [位1的个数](https://leetcode.cn/problems/number-of-1-bits/) | 🟢简单 | 位运算 | |
| 231 | [2 的幂](https://leetcode.cn/problems/power-of-two/) | 🟢简单 | 位运算 | |
| 268 | [丢失的数字](https://leetcode.cn/problems/missing-number/) | 🟢简单 | 位运算/数学 | |
| 50 | [Pow(x, n)](https://leetcode.cn/problems/powx-n/) | 🟡中等 | 快速幂 | ⭐面试高频 |
| 29 | [两数相除](https://leetcode.cn/problems/divide-two-integers/) | 🟡中等 | 位运算 | |
| 7 | [整数反转](https://leetcode.cn/problems/reverse-integer/) | 🟡中等 | 数学 | 注意溢出 |
| 9 | [回文数](https://leetcode.cn/problems/palindrome-number/) | 🟢简单 | 数学 | |

### Day 56-60: 模拟面试 + 复习

#### 每日安排
1. **上午**：限时做2-3道综合题（每题25-30分钟）
2. **下午**：复习错题本，回顾经典题型
3. **晚上**：模拟面试，用语言描述解题思路

#### 高频面试题汇总（必须熟练）
| 题号 | 题目 | 类型 | 频率 |
|------|------|------|------|
| 1 | 两数之和 | 哈希 | ⭐⭐⭐⭐⭐ |
| 3 | 无重复字符的最长子串 | 滑动窗口 | ⭐⭐⭐⭐⭐ |
| 15 | 三数之和 | 双指针 | ⭐⭐⭐⭐⭐ |
| 20 | 有效的括号 | 栈 | ⭐⭐⭐⭐⭐ |
| 21 | 合并两个有序链表 | 链表 | ⭐⭐⭐⭐⭐ |
| 33 | 搜索旋转排序数组 | 二分 | ⭐⭐⭐⭐⭐ |
| 42 | 接雨水 | 双指针/单调栈 | ⭐⭐⭐⭐ |
| 46 | 全排列 | 回溯 | ⭐⭐⭐⭐⭐ |
| 53 | 最大子数组和 | DP | ⭐⭐⭐⭐⭐ |
| 72 | 编辑距离 | DP | ⭐⭐⭐⭐ |
| 76 | 最小覆盖子串 | 滑动窗口 | ⭐⭐⭐⭐ |
| 102 | 二叉树的层序遍历 | BFS | ⭐⭐⭐⭐⭐ |
| 105 | 从前序与中序遍历序列构造二叉树 | 递归 | ⭐⭐⭐⭐ |
| 121 | 买卖股票的最佳时机 | 贪心/DP | ⭐⭐⭐⭐⭐ |
| 141 | 环形链表 | 快慢指针 | ⭐⭐⭐⭐⭐ |
| 146 | LRU 缓存 | 设计 | ⭐⭐⭐⭐⭐ |
| 200 | 岛屿数量 | BFS/DFS | ⭐⭐⭐⭐⭐ |
| 206 | 反转链表 | 链表 | ⭐⭐⭐⭐⭐ |
| 215 | 数组中的第K个最大元素 | 快速选择 | ⭐⭐⭐⭐⭐ |
| 236 | 二叉树的最近公共祖先 | 递归 | ⭐⭐⭐⭐⭐ |
| 300 | 最长递增子序列 | DP | ⭐⭐⭐⭐ |
| 322 | 零钱兑换 | DP | ⭐⭐⭐⭐⭐ |

---

## 📝 学习建议

### 每日学习流程
```
1. 阅读题目，独立思考 10 分钟
2. 如果没有思路，查看提示或题解的思路部分
3. 独立编码实现
4. 对比最优解，学习更优写法
5. 总结题目的解题模板和技巧
6. 一周后复习错题
```

### 刷题原则
1. **质量优先于数量**：每道题都要彻底理解，不要追求数量
2. **分类突破**：同类型题目集中练习，建立解题模式
3. **手写代码**：面试中没有IDE提示，要习惯手写
4. **讲解思路**：练习用语言清晰表达解题过程
5. **记录错题**：建立错题本，定期复习

### 时间管理
- **工作日**：每天 1.5-2 小时，完成 3-4 道题
- **周末**：每天 3-4 小时，完成 5-8 道题 + 复习
- **最后一周**：以模拟面试为主，每天限时做综合题

### 重点掌握的核心模板
1. 二分查找模板（3种边界处理方式）
2. 滑动窗口模板
3. 回溯模板
4. BFS/DFS 模板
5. 动态规划状态转移思路
6. 快速排序/归并排序/堆排序

---

## 📊 进度追踪

```
[ ] 第一阶段：基础数据结构 (Day 1-15)
    [ ] Week 1: 数组与字符串
    [ ] Week 2: 哈希表与链表
[ ] 第二阶段：经典算法技巧 (Day 16-30)
    [ ] Week 3: 双指针与滑动窗口
    [ ] Week 4: 栈、队列与排序
[ ] 第三阶段：树与图 (Day 31-45)
    [ ] Week 5: 二叉树基础
    [ ] Week 6: BFS/DFS与回溯
[ ] 第四阶段：动态规划 (Day 46-55)
    [ ] Week 7: 一维动态规划
    [ ] Week 8: 二维DP与综合
[ ] 第五阶段：模拟面试 (Day 56-60)
```

---

**祝你刷题顺利，面试成功！🚀**

> 💡 提示：每完成一道题后，建议在 LeetCode 上点击"提交记录"查看自己的代码执行效率，并尝试优化。
