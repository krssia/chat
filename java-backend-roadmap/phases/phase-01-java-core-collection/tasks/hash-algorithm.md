# Task: hash 算法与哈希定位

## 学习目标

理解哈希表的核心思想，掌握 HashMap/HashSet 中 hashCode 到桶下标（bucket index）的定位过程，以及冲突处理方式。

## 学习资源

> 每个资源都标了「怎么用」和「重点看哪里」，按顺序看，不要从头到尾硬啃。

**资源关系：**
- 主线：资源1（HashMap 源码，核心）→ 资源2（面试题，自测）
- 资源3（B站视频）作为补充，可跳过

### 1. JavaGuide：HashMap 源码分析
- 链接：https://javaguide.cn/java/collection/hashmap-source-code.html
- 怎么用：只读「hash 方法」和「桶下标计算」相关小节
- 重点看：
  - hash() 扰动：高 16 位异或低 16 位
  - 桶下标：(n - 1) & hash
  - 为什么容量是 2 的幂
  - 扩容后元素重新分布
- 不用看：put / get 完整流程（那是 HashMap 任务的内容）

### 2. JavaGuide：Java 集合常见面试题总结(上)
- 链接：https://javaguide.cn/java/collection/java-collection-questions-01.html
- 怎么用：只读 hash 相关题目，用来检查自己会不会
- 重点看：为什么用 (n-1)&hash、为什么容量是 2 的幂

### 3. B站视频：HashMap面试夺命连环20问
- 链接：https://www.bilibili.com/video/BV1S7pqeiEaz/
- 怎么用：只看涉及 hash 定位和冲突的题目
- 重点看：hash 扰动、冲突处理

## 需要掌握

完成任务后，需要能够解释：

- 哈希表为什么查询快
- hashCode 的作用
- hash 扰动：HashMap 中高 16 位与低 16 位异或的原因
- 桶下标计算：(n - 1) & hash
- 为什么 HashMap 容量是 2 的幂
- 哈希冲突产生原因
- 冲突解决：链表与红黑树
- 负载因子与扩容阈值
- 哈希质量对查询性能的影响

## 学习步骤

### 第一阶段：哈希思想

学习：

- 数组 + 哈希函数
- 理想情况下 O(1) 定位
- 冲突不可避免
- 哈希函数质量影响分布

实践：

用简单的取模方式模拟哈希定位过程。

### 第二阶段：HashMap 定位

学习：

- Object.hashCode()
- HashMap.hash() 扰动算法
- (n - 1) & hash 替代 hash % n
- 容量为 2 的幂的原因
- 扩容后元素重新分布

实践：

手动计算几个 hashCode 在容量 16 下的桶下标，再模拟扩容到 32。

### 第三阶段：冲突处理

学习：

- 哈希冲突时链表追加
- 链表长度达到阈值后转红黑树
- 红黑树退化为链表的条件
- 负载因子 0.75 的含义
- 冲突过多时性能退化

实践：

设计一个 hashCode 很差的自定义类，制造大量冲突，观察 HashMap 性能变化。

## 实践任务

创建 hash-algorithm-demo：

1. 输出若干字符串的 hashCode 和桶下标
2. 模拟 hash 扰动前后分布差异
3. 制造 hashCode 恒定的冲突场景
4. 观察扩容后元素重新分布
5. 统计冲突数量并对比查询性能

## 思考问题

完成后回答：

1. 为什么 HashMap 查询平均是 O(1)？
2. 为什么用 (n - 1) & hash 而不是 hash % n？
3. 为什么 HashMap 容量必须是 2 的幂？
4. 哈希冲突太多会发生什么？
5. JDK8 为什么引入红黑树优化？

## 完成标准

能够独立向别人解释 HashMap 的哈希定位过程，并说明冲突和扩容对性能的影响。
