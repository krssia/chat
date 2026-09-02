# Task: TreeSet

## 学习目标

理解 TreeSet 的有序 Set 特性、底层红黑树结构，以及 Comparable/Comparator 在排序中的作用。

## 学习资源

> 每个资源都标了「怎么用」和「重点看哪里」，按顺序看，不要从头到尾硬啃。

### 1. JavaGuide：Java 集合常见面试题总结(上)
- 链接：https://javaguide.cn/java/collection/java-collection-questions-01.html
- 怎么用：先读 TreeSet 相关题目，建立整体印象
- 重点看：TreeSet 的有序性、和 HashSet 的区别

### 2. 博客：TreeSet 源码解析以及与 HashSet 和 HashMap 的区别
- 链接：https://juejin.cn/post/6869395553571209223
- 怎么用：通读一遍，重点看 TreeSet 底层和排序
- 重点看：
  - TreeSet 底层是 TreeMap
  - 自然排序 vs Comparator
  - 为什么不允许 null
- 不用看：红黑树旋转细节（了解即可）

### 3. B站视频：黑马 Java 基础教程 - 集合框架
- 链接：https://www.bilibili.com/video/BV1fG4y1g76v/
- 怎么用：只看 TreeSet 相关小节，作为补充理解
- 重点看：TreeSet 排序演示

## 需要掌握

完成任务后，需要能够解释：

- TreeSet 底层是 TreeMap（NavigableMap）
- 元素默认按自然顺序排序
- 可以通过 Comparator 定制排序
- 为什么 TreeSet 不允许 null 元素
- first / last / lower / higher / floor / ceiling 等导航方法
- 红黑树保证基本操作 O(log n)
- compareTo / compare 与 equals 的一致性要求
- TreeSet、HashSet、LinkedHashSet 的差异

## 学习步骤

### 第一阶段：使用

学习：

- 自然排序与 Comparator 排序
- add / remove / contains
- 有序遍历
- first / last / subSet / headSet / tailSet

实践：

编写示例，分别使用自然排序和自定义排序创建 TreeSet。

### 第二阶段：原理

学习：

- TreeSet 内部持有 TreeMap
- 元素作为 TreeMap 的 key
- 红黑树的有序性和平衡性
- 比较结果决定元素位置
- 不允许 null 的原因

实践：

画图展示一个简单有序集合的树形结构，模拟插入几个元素的排序过程。

### 第三阶段：源码理解

阅读 OpenJDK TreeSet/TreeMap 源码，重点关注：

- add(E e)
- comparator()
- first() / last()
- subSet / headSet / tailSet
- TreeMap.put 中的比较逻辑

目标不是背源码，而是理解有序集合的设计思路。

## 实践任务

创建 treeset-demo：

1. 自然排序基本操作
2. 自定义 Comparator 排序
3. 自定义对象实现 Comparable
4. 范围查询：subSet / headSet / tailSet
5. 使用 lower / higher / floor / ceiling
6. 与 HashSet 的迭代顺序对比

## 思考问题

完成后回答：

1. TreeSet 和 HashSet 的核心区别是什么？
2. 为什么 TreeSet 不允许 null 元素？
3. compareTo 和 equals 不一致会带来什么问题？
4. 什么场景下应该使用 TreeSet？
5. TreeSet 的 add/remove/contains 复杂度是多少？为什么？

## 完成标准

能够独立向别人解释 TreeSet 的排序机制，并正确使用 Comparator/Comparable 解决排序需求。
