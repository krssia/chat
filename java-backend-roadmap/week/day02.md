# Day02：HashMap 扩容机制（Resize）

> 第一周 Day2

> 今日目标：理解 HashMap 扩容机制，掌握 capacity、loadFactor、threshold 的关系，并完成 ResizeDemo。

---

# 今日目标

完成后能够回答：

- HashMap 为什么需要扩容？
- 什么是 capacity？
- 什么是 loadFactor？
- 什么是 threshold？
- 为什么 HashMap 默认容量是 16？
- 为什么 HashMap 容量设计为 2 的幂？
- resize() 扩容过程中发生了什么？

---

# 今日任务

## 任务一：复习 HashMap 基础结构

JDK8 HashMap 底层结构：

```
数组 + 链表 + 红黑树
```

## 任务二：学习 HashMap 核心属性

capacity：数组容量。

默认容量：16。

loadFactor：负载因子，默认 0.75。

threshold：扩容阈值。

公式：

```
threshold = capacity * loadFactor
```

## 任务三：理解 resize() 流程

```
1. 创建新的数组
2. 容量扩大2倍
3. 重新计算节点位置
4. 数据迁移
```

## 任务四：完成 ResizeDemo

观察容量变化：

```
4 -> 8 -> 16 -> 32
```

## 今日完成标准 Checklist

- [ ] 理解capacity
- [ ] 理解loadFactor
- [ ] 理解threshold
- [ ] 理解resize整体流程
- [ ] 完成ResizeDemo
- [ ] 更新HashMap学习笔记
- [ ] Git提交
