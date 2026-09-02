# Task: TreeMap

## 学习目标

理解 TreeMap 的有序 Map 特性、红黑树底层结构，以及基于 key 排序和范围查询的使用方式。

## 学习资源

> 每个资源都标了「怎么用」和「重点看哪里」，按顺序看，不要从头到尾硬啃。

**资源关系：**
- 主线：资源1（源码分析）→ 资源2（面试题，自测）
- 资源3（B站视频）作为补充，可跳过

### 1. 博客：Java 集合框架 TreeMap 源码分析
- 链接：https://www.cnblogs.com/zebt/articles/17625965.html
- 怎么用：通读一遍，重点看「有序性」和「范围查询」
- 重点看：
  - 红黑树如何保证有序
  - key 比较（自然顺序 / Comparator）
  - subMap / headMap / tailMap 范围查询
- 不用看：红黑树旋转细节，理解“为什么 O(log n)”即可

### 2. JavaGuide：Java 集合常见面试题总结(下)
- 链接：https://javaguide.cn/java/collection/java-collection-questions-02.html
- 怎么用：学完博客后，只读 TreeMap 相关题目，用来检查自己会不会
- 重点看：TreeMap 和 HashMap 的区别、为什么 key 不能为 null

### 3. B站视频：黑马 Java 基础教程 - 集合框架
- 链接：https://www.bilibili.com/video/BV1fG4y1g76v/
- 怎么用：只看 TreeMap 相关小节，作为补充理解
- 重点看：TreeMap 排序和范围查询演示

## 需要掌握

完成任务后，需要能够解释：

- TreeMap 按键自然顺序或 Comparator 排序
- 底层使用红黑树实现
- key 不允许为 null，value 可以为 null
- 基本操作复杂度为 O(log n)
- firstKey / lastKey / lowerKey / higherKey 等导航方法
- subMap / headMap / tailMap 范围视图
- Comparable 与 Comparator 的选择
- 与 HashMap、LinkedHashMap 的差异
- compareTo 与 equals 的一致性要求

## 学习步骤

### 第一阶段：使用

学习：

- 自然顺序构造与 Comparator 构造
- put / get / remove
- firstKey / lastKey
- subMap / headMap / tailMap
- 遍历顺序

实践：

编写示例，使用 TreeMap 完成按 key 排序的基本操作。

### 第二阶段：原理

学习：

- 红黑树的基本性质
- key 比较决定插入位置
- 为什么 key 不能为 null
- 范围视图如何工作
- 有序性带来的额外开销

实践：

画图展示几个 key 插入 TreeMap 后的排序结构。

### 第三阶段：源码理解

阅读 OpenJDK TreeMap 源码，重点关注：

- put(K key, V value)
- getEntry(Object key)
- comparator()
- subMap / headMap / tailMap 的视图实现
- 红黑树旋转与平衡（了解即可）

目标不是背源码，而是理解有序 Map 的设计取舍。

## 实践任务

创建 treemap-demo：

1. 自然排序基本操作
2. 自定义 Comparator 排序
3. 自定义对象作为 key 并实现 Comparable
4. 范围查询：subMap / headMap / tailMap
5. 使用 lowerKey / higherKey / floorKey / ceilingKey
6. 与 HashMap 的遍历顺序对比

## 思考问题

完成后回答：

1. TreeMap 为什么能按键有序遍历？
2. TreeMap 与 HashMap 的时间复杂度分别是什么？
3. 什么场景下必须使用 TreeMap？
4. key 为 null 时会发生什么？为什么？
5. compareTo 和 equals 不一致会有什么问题？

## 完成标准

能够独立向别人解释 TreeMap 的排序和范围查询机制，并根据排序需求正确选择 Map。
