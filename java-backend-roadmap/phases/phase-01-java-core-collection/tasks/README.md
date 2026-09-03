# Phase Task Guide

这里的 task 是给学习者执行的学习任务，不是给 AI 生成计划使用的提示词。

每个任务需要明确说明：

1. 学习目标
2. 学习资源（最重要，必须有）
3. 需要掌握的知识点
4. 推荐学习顺序
5. 实践内容
6. 思考问题
7. 完成标准

任务设计原则：

- 一个任务聚焦一个核心知识点
- 学习资源优先使用博客、文档、视频，并给出链接或视频名称
- 每个学习资源要标明「怎么用」和「重点看哪里」，避免看完没学到重点、浪费时间
- 学习资源之间要标明「资源关系」：哪个先看、哪个后看、哪个可以跳过，避免重复浪费时间
- 允许分段学习：一个资源/一篇文档可以分多次看完，不要因为“没一次看完”而焦虑
- 避免使用电子书、实体书作为主要学习资源
- 优先理解原理，再进行代码实践
- 「手写」指看懂后自己写，不是边看视频/资料边抄；流程是：先看 → 自己写 → 对照补漏
- 不要求死记源码，需要理解设计原因
- 学习结果应该能够用于实际开发

完成任务后，需要更新 progress 中的学习状态。

## 推荐学习顺序

> 下面的清单是按类型分组的，**不是学习顺序**。请按下面的顺序学习，从简单到复杂、从基础到应用。

| 顺序  | 任务                                                      | 为什么排这里                             |
| --- | ------------------------------------------------------- | ---------------------------------- |
| 1   | [arraylist.md](./arraylist.md)                          | 最简单，数组结构，先建立“集合是什么”的感觉             |
| 2   | [linkedlist.md](./linkedlist.md)                        | 链表结构，和 ArrayList 对比着学，理解两种存储       |
| 3   | [equals-hashcode.md](./equals-hashcode.md)              | 哈希集合的地基，不先懂它，后面 HashSet/HashMap 会懵 |
| 4   | [hash-algorithm.md](./hash-algorithm.md)                | HashMap 的核心原理，先懂哈希定位               |
| 5   | [hashmap.md](./hashmap.md)                              | 最重要的一个，前面两个基础打好了这里就顺               |
| 6   | [hashset.md](./hashset.md)                              | 基于 HashMap，学完 HashMap 后几乎白送        |
| 7   | [linkedhashmap.md](./linkedhashmap.md)                  | 在 HashMap 基础上加顺序，理解 LRU            |
| 8   | [treemap.md](./treemap.md) 和 [treeset.md](./treeset.md) | 红黑树，相对难，放后面                        |
| 9   | [collection-selection.md](./collection-selection.md)    | 收尾，把前面所有知识串起来做选型                   |

## 当前任务清单

Phase 1 集合部分已建立以下任务文档：

### List

- [arraylist.md](./arraylist.md)：ArrayList 数组结构与扩容机制
- [linkedlist.md](./linkedlist.md)：LinkedList 双向链表与 Deque 使用

### Set

- [hashset.md](./hashset.md)：HashSet 基于 HashMap 的去重实现
- [treeset.md](./treeset.md)：TreeSet 有序 Set 与红黑树

### Map

- [hashmap.md](./hashmap.md)：HashMap 使用、原理与源码理解
- [linkedhashmap.md](./linkedhashmap.md)：LinkedHashMap 顺序维护与 LRU
- [treemap.md](./treemap.md)：TreeMap 有序 Map 与范围查询

### 通用基础

- [equals-hashcode.md](./equals-hashcode.md)：equals/hashCode 约定与正确实现
- [hash-algorithm.md](./hash-algorithm.md)：hash 算法与哈希定位
- [collection-selection.md](./collection-selection.md)：集合选择与性能分析

