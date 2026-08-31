# Task: LinkedList

## 学习目标

理解 LinkedList 的双向链表结构、作为 List 和 Deque 的双重身份，以及插入删除和随机访问的性能特点。

## 需要掌握

完成任务后，需要能够解释：

- LinkedList 底层双向链表结构
- Node 节点的组成：item、prev、next
- first / last 指针的作用
- add / remove / get 的底层行为
- 为什么头部插入和尾部插入是 O(1)
- 为什么按下标访问是 O(n)
- LinkedList 同时实现 List 和 Deque
- 与 ArrayList 的适用场景差异
- LinkedList 为什么不是线程安全的

## 学习步骤

### 第一阶段：使用

学习：

- 作为 List 使用：add、get、remove
- 作为 Deque/Queue 使用：addFirst、addLast、pollFirst、pollLast
- 栈操作：push / pop

实践：

编写示例，分别用 List 和 Deque 的方式操作 LinkedList。

### 第二阶段：原理

学习：

- 双向链表节点结构
- 链表如何连接和断开节点
- 头尾插入不需要移动其他元素
- 按下标查找时从头尾双向查找
- 内存占用：每个元素额外保存两个指针

实践：

画图展示 LinkedList 的节点结构，模拟一次头部插入和一次中间删除。

### 第三阶段：源码理解

阅读 OpenJDK LinkedList 源码，重点关注：

- linkFirst / linkLast
- unlink(Node<E> x)
- node(int index)
- add(int index, E element)

目标不是背源码，而是理解链表操作的代价来源。

## 实践任务

创建 linkedlist-demo：

1. List 基本操作
2. 使用 LinkedList 实现队列
3. 使用 LinkedList 实现栈
4. 头部插入与 ArrayList 性能对比
5. 随机访问与 ArrayList 性能对比
6. 遍历时删除元素对比

## 思考问题

完成后回答：

1. 什么场景下 LinkedList 比 ArrayList 更合适？
2. LinkedList 的随机访问为什么慢？
3. 既然 LinkedList 实现了 Deque，为什么实际开发中队列更常用 ArrayDeque？
4. 为什么说 LinkedList 的内存占用通常比 ArrayList 高？
5. 遍历 LinkedList 时用 get(i) 为什么性能很差？

## 完成标准

能够独立向别人解释 LinkedList 的双向链表结构，并根据场景判断是否应该使用 LinkedList。
