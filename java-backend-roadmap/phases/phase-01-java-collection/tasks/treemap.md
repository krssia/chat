# Task: TreeMap

## 学习目标

理解 TreeMap 的有序 Map 特性、红黑树底层结构，以及基于 key 排序和范围查询的使用方式。

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
