# Task: HashSet

## 学习目标

理解 HashSet 基于 HashMap 的实现原理、元素唯一性机制，以及 equals/hashCode 对去重结果的影响。

## 学习资源

> 每个资源都标了「怎么用」和「重点看哪里」，按顺序看，不要从头到尾硬啃。

### 1. JavaGuide：Java 集合常见面试题总结(上)
- 链接：https://javaguide.cn/java/collection/java-collection-questions-01.html
- 怎么用：先读 HashSet 相关题目，建立整体印象
- 重点看：HashSet 为什么能去重、和 HashMap 的关系

### 2. 博客：HashSet 核心源码解析
- 链接：https://cloud.tencent.com/developer/article/1612981?from=15425
- 怎么用：通读一遍，重点看 add() 和 PRESENT 对象
- 重点看：
  - HashSet 内部持有 HashMap
  - 元素作为 key，value 用固定 PRESENT
  - equals/hashCode 如何决定去重
- 不用看：HashMap 的 put 细节（那是 HashMap 任务的内容）

### 3. B站视频：黑马 Java 基础教程 - 集合框架
- 链接：https://www.bilibili.com/video/BV1fG4y1g76v/
- 怎么用：只看 HashSet 相关小节，作为补充理解
- 重点看：HashSet 去重演示

## 需要掌握

完成任务后，需要能够解释：

- HashSet 底层是 HashMap
- 添加元素时 value 使用固定 PRESENT 对象
- add / contains / remove 的底层行为
- 元素唯一性由 hashCode 和 equals 共同决定
- HashSet 为什么不保证迭代顺序
- HashSet 允许 null
- 为什么可变对象放入 HashSet 后可能造成问题
- HashSet、LinkedHashSet、TreeSet 的基本差异

## 学习步骤

### 第一阶段：使用

学习：

- Set 接口常用方法
- add / contains / remove
- 使用 HashSet 去重
- 遍历方式

实践：

编写简单示例，验证 HashSet 的基本去重行为。

### 第二阶段：原理

学习：

- HashSet 内部持有 HashMap
- 元素作为 HashMap 的 key
- 哈希定位与冲突
- equals/hashCode 如何决定是否重复
- 迭代顺序不稳定的原因

实践：

画图展示 HashSet 如何通过 HashMap 存储元素。

### 第三阶段：源码理解

阅读 OpenJDK HashSet 源码，重点关注：

- add(E e)
- contains(Object o)
- remove(Object o)
- 内部 HashMap 的初始化方式

同时结合 HashMap 的 put 过程理解去重逻辑。

## 实践任务

创建 hashset-demo：

1. 基本去重
2. 存储自定义对象
3. 只重写 equals 不重写 hashCode 实验
4. 重写 equals 和 hashCode 后正确去重
5. 使用可变对象作为 HashSet 元素并修改字段，观察问题

## 思考问题

完成后回答：

1. HashSet 为什么能保证元素不重复？
2. 为什么 HashSet 的迭代顺序不稳定？
3. 如果两个对象 equals 相等但 hashCode 不同，会发生什么？
4. 为什么放入 HashSet 的对象应该尽量不可变？
5. HashSet 和 List 去重相比有什么优缺点？

## 完成标准

能够独立向别人解释 HashSet 的存储原理，并正确处理自定义对象去重问题。
