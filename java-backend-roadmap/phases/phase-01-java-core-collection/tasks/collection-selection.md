# Task: 集合选择与性能

## 学习目标

能够根据业务场景选择合适的 Java 集合，理解常用集合的时间复杂度、内存特点和线程安全问题。

## 学习资源

> 每个资源都标了「怎么用」和「重点看哪里」，按顺序看，不要从头到尾硬啃。

### 1. JavaGuide：Java 集合常见面试题总结(上)
- 链接：https://javaguide.cn/java/collection/java-collection-questions-01.html
- 怎么用：通读一遍，重点看「集合选型」相关题目
- 重点看：ArrayList vs LinkedList、HashSet vs TreeSet

### 2. JavaGuide：Java 集合常见面试题总结(下)
- 链接：https://javaguide.cn/java/collection/java-collection-questions-02.html
- 怎么用：通读一遍，重点看「Map 选型」相关题目
- 重点看：HashMap vs LinkedHashMap vs TreeMap

### 3. B站视频：黑马 Java 基础教程 - 集合框架
- 链接：https://www.bilibili.com/video/BV1fG4y1g76v/
- 怎么用：作为整体回顾，把前面所有集合串起来
- 重点看：集合框架整体结构、选型思路

## 需要掌握

完成任务后，需要能够解释：

- List / Set / Map 的选择依据
- ArrayList 与 LinkedList 的选择
- HashSet / LinkedHashSet / TreeSet 的选择
- HashMap / LinkedHashMap / TreeMap 的选择
- 常用集合操作的时间复杂度
- 哈希集合与有序集合的性能差异
- 集合的线程安全问题
- 常见业务场景下的集合选型

## 学习步骤

### 第一阶段：建立选择框架

学习：

- 是否需要允许重复 → List vs Set
- 是否需要 key-value → Map
- 是否需要有序 → LinkedXxx / TreeXxx
- 是否需要排序 → TreeXxx / Comparator
- 是否需要随机访问 → ArrayList
- 是否需要频繁头尾操作 → Deque/ArrayDeque

实践：

整理一张集合选择决策表。

### 第二阶段：性能对比

学习：

- 常见操作复杂度：
  - ArrayList get/set O(1)，中间插入/删除 O(n)
  - LinkedList 头尾操作 O(1)，随机访问 O(n)
  - HashMap/HashSet 平均 O(1)
  - TreeMap/TreeSet O(log n)
- 内存占用差异
- 遍历性能
- 扩容和哈希冲突的影响

实践：

对 ArrayList、LinkedList、HashSet、TreeSet 做简单的插入/查询性能对比实验。

### 第三阶段：场景应用

学习：

- 去重：HashSet / LinkedHashSet
- 排序：TreeSet / TreeMap / Collections.sort
- 缓存：LinkedHashMap LRU
- 索引查询：HashMap
- 范围查询：TreeMap / TreeSet
- 线程安全：Collections.synchronizedXxx、ConcurrentHashMap、CopyOnWriteArrayList

实践：

为几个典型业务场景选择合适集合，并说明理由。

## 实践任务

创建 collection-selection-demo：

1. 写一个集合选型决策表/笔记
2. 对 List、Set、Map 常见实现做简单性能测试
3. 实现一个去重场景，比较 HashSet 与 List 的差别
4. 实现一个排序场景，比较 TreeSet 与排序 List
5. 实现一个简单缓存场景，比较 HashMap 与 LinkedHashMap

## 思考问题

完成后回答：

1. 什么时候选 ArrayList，什么时候选 LinkedList？
2. 什么时候选 HashSet，什么时候选 TreeSet？
3. HashMap、LinkedHashMap、TreeMap 有什么区别？
4. 为什么默认大多数场景选择 ArrayList 和 HashMap？
5. 并发环境下应该如何使用集合？

## 完成标准

能够根据具体业务需求独立完成集合选型，并解释性能和内存上的取舍。
