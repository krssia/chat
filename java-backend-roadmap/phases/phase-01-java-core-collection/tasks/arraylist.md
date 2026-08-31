# Task: ArrayList

## 学习目标

理解 ArrayList 的数组存储结构、动态扩容机制和增删查性能特点，能够在实际开发中正确选择和使用 ArrayList。

## 需要掌握

完成任务后，需要能够解释：

- List 接口与 ArrayList 的定位
- 底层使用 Object[] 数组存储
- add / get / set / remove 的底层行为
- 动态扩容机制：默认容量、扩容倍数、复制过程
- 随机访问快，中间插入/删除慢的原因
- 遍历方式与 fail-fast 机制
- ArrayList 为什么不是线程安全的
- ArrayList 与 LinkedList 的核心差异

## 学习步骤

### 第一阶段：使用

学习：

- List 接口常用方法
- ArrayList 基本增删改查
- 构造方法：无参、指定容量、传入集合
- 常见遍历方式：fori、foreach、Iterator

实践：

编写简单示例，熟悉 ArrayList 基本操作。

### 第二阶段：原理

学习：

- 数组存储结构
- size 与 capacity 的区别
- 扩容触发条件
- 扩容计算：新容量 = 旧容量 + (旧容量 >> 1)
- 删除元素时元素前移

实践：

画图展示 ArrayList 的存储结构，并模拟一次 add 触发扩容的过程。

### 第三阶段：源码理解

阅读 OpenJDK ArrayList 源码，重点关注：

- add(E e)
- get(int index)
- remove(int index)
- grow(int minCapacity)
- Iterator 的 modCount 检查

目标不是背源码，而是理解设计选择。

## 实践任务

创建 arraylist-demo：

1. 基础增删改查
2. 指定初始容量和观察扩容
3. 删除中间元素与尾部元素对比
4. 遍历过程中删除元素触发 ConcurrentModificationException 实验
5. ArrayList 与 LinkedList 随机访问性能对比

## 思考问题

完成后回答：

1. 为什么 ArrayList 随机访问是 O(1)？
2. 为什么 ArrayList 中间插入/删除是 O(n)？
3. 频繁在头部插入元素时，ArrayList 是否合适？
4. 为什么每次扩容不是直接翻倍而是 1.5 倍？
5. 如何避免 ArrayList 扩容带来的性能损耗？

## 完成标准

能够独立向别人解释 ArrayList 的存储结构和扩容机制，并完成实践代码。
