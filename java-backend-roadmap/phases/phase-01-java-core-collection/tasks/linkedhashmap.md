# Task: LinkedHashMap

## 学习目标

理解 LinkedHashMap 如何保持插入顺序或访问顺序，并掌握基于它实现 LRU 缓存的基本方法。

## 学习资源

- JavaGuide：[Java 集合常见面试题总结(下)](https://javaguide.cn/java/collection/java-collection-questions-02.html)
- JavaGuide：[LinkedHashMap 源码分析](https://javaguide.cn/java/collection/linkedhashmap-source-code.html)
- B站视频：黑马 Java 基础教程 - 集合框架（https://www.bilibili.com/video/BV1fG4y1g76v/）
- 必看内容：accessOrder、afterNodeAccess、removeEldestEntry 与 LRU

## 需要掌握

完成任务后，需要能够解释：

- LinkedHashMap 继承自 HashMap
- 内部额外使用双向链表维护顺序
- 默认按插入顺序遍历
- accessOrder=true 时按访问顺序遍历
- removeEldestEntry 的作用
- 为什么适合实现 LRU 缓存
- 与 HashMap、TreeMap 的顺序差异
- 额外维护链表带来的性能开销

## 学习步骤

### 第一阶段：使用

学习：

- 构造方法中的 accessOrder 参数
- 插入顺序遍历
- 访问顺序遍历
- get / put 对顺序的影响

实践：

编写示例，对比默认 LinkedHashMap 和 accessOrder=true 的遍历顺序。

### 第二阶段：原理

学习：

- 继承 HashMap 的哈希结构
- 双向链表连接所有 Entry
- 插入时如何加入链表尾部
- 访问时如何移动到链表尾部
- removeEldestEntry 如何淘汰最久未使用元素

实践：

画图展示 LinkedHashMap 的哈希表与双向链表如何同时存在。

### 第三阶段：源码理解

阅读 OpenJDK LinkedHashMap 源码，重点关注：

- newNode / afterNodeInsertion / afterNodeAccess / afterNodeRemoval
- accessOrder 的作用
- removeEldestEntry 的调用时机

目标不是背源码，而是理解顺序维护和 LRU 淘汰的设计思路。

## 实践任务

创建 linkedhashmap-demo：

1. 默认插入顺序遍历
2. accessOrder=true 访问顺序遍历
3. 实现一个容量有限的 LRU 缓存
4. 验证缓存淘汰顺序
5. 与 HashMap 的遍历顺序对比

## 思考问题

完成后回答：

1. LinkedHashMap 为什么能保持插入顺序？
2. 插入顺序和访问顺序有什么区别？
3. 如何用 LinkedHashMap 实现 LRU 缓存？
4. LinkedHashMap 和 TreeMap 的“有序”有什么区别？
5. LinkedHashMap 比 HashMap 慢在哪里？

## 完成标准

能够独立向别人解释 LinkedHashMap 的顺序维护机制，并实现一个简单的 LRU 缓存。
