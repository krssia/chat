# Task: HashMap

## 学习目标

理解 Java HashMap 的使用方式、核心设计思想和底层实现原理。

## 学习资源

> 每个资源都标了「怎么用」和「重点看哪里」，按顺序看，不要从头到尾硬啃。

**资源关系：**
- 主线：资源1（源码分析）→ 资源3（B站视频，巩固），看完 1 再看 3
- 资源2（面试题）最后用来自测，可跳过

### 1. JavaGuide：HashMap 源码分析
- 链接：https://javaguide.cn/java/collection/hashmap-source-code.html
- 怎么用：通读一遍，重点看 put / get / resize 三个流程
- 重点看：
  - 数据结构：数组 + 链表 + 红黑树
  - put() 完整流程（hash → 定位 → 冲突 → 扩容）
  - resize() 扩容机制
  - 链表转红黑树的条件
- 不用看：红黑树内部旋转细节，理解“为什么用红黑树”即可

### 2. JavaGuide：Java 集合常见面试题总结(上)
- 链接：https://javaguide.cn/java/collection/java-collection-questions-01.html
- 怎么用：学完源码后，只读 HashMap 相关题目，用来检查自己会不会
- 重点看：HashMap 高频面试题（为什么快、为什么线程不安全等）

### 3. B站视频：HashMap面试夺命连环20问
- 链接：https://www.bilibili.com/video/BV1S7pqeiEaz/
- 怎么用：看完源码分析后看，用来巩固和查漏
- 重点看：put 流程、扩容、红黑树、线程安全

## 需要掌握

完成任务后，需要能够解释：

- Map 键值模型
- hash 的作用
- hash 冲突产生原因
- HashMap 的数据结构
- JDK8 中链表转红黑树的原因
- 扩容机制
- equals 与 hashCode 的关系
- HashMap 为什么不是线程安全的

## 学习步骤

### 第一阶段：使用

学习：

- Map 接口常用方法
- put/get/remove 使用场景
- 常见业务中的 Map 使用

实践：

编写简单示例，熟悉 HashMap 基本操作。

### 第二阶段：原理

学习：

- 数组 + 链表结构
- hash 定位过程
- 哈希冲突处理
- 负载因子和扩容
- JDK8 红黑树优化

实践：

画出 HashMap 存储结构，并模拟一次 put 流程。

### 第三阶段：源码理解

阅读 OpenJDK HashMap 源码，重点关注：

- put()
- get()
- resize()

目标不是背源码，而是理解设计选择。

## 实践任务

创建 hashmap-demo：

1. 基础增删改查
2. 自定义对象作为 key
3. equals/hashCode 实验
4. hash 冲突实验
5. 扩容过程观察

## 思考问题

完成后回答：

1. 为什么 HashMap 查询速度快？
2. hash 冲突有哪些解决方式？
3. 为什么 equals 和 hashCode 必须同时正确实现？
4. 为什么 JDK8 使用红黑树优化？

## 完成标准

能够独立向别人解释 HashMap 的工作流程，并完成实践代码。