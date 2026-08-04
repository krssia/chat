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

理解数据流程：

```
key
 |
hash计算
 |
数组下标
 |
Node节点
 |
value
```

---

## 任务二：学习 HashMap 核心属性

### capacity

数组容量。

默认容量：

```java
static final int DEFAULT_INITIAL_CAPACITY = 1 << 4;
```

即：

```
16
```

### loadFactor

负载因子：

```java
static final float DEFAULT_LOAD_FACTOR = 0.75f;
```

用于平衡空间和性能。

### threshold

扩容阈值：

```
threshold = capacity * loadFactor
```

默认：

```
16 * 0.75 = 12
```

---

# 任务三：理解 resize() 流程

resize主要完成：

```
1. 创建新的数组
2. 容量扩大2倍
3. 重新计算节点位置
4. 数据迁移
```

扩容不是简单复制数组，因为数组长度变化后元素位置可能发生变化。

---

# 任务四：完成 ResizeDemo

创建：

```
ResizeDemo.java
```

代码：

```java
import java.util.HashMap;

public class ResizeDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>(4);

        for(int i = 0; i < 20; i++){
            map.put(i,"value-" + i);
            System.out.println("添加元素:" + i);
        }
    }
}
```

观察容量变化：

```
4 -> 8 -> 16 -> 32
```

---

# AI辅助理解

尝试询问：

```
请解释HashMap中的capacity、loadFactor、threshold三者关系。
```

```
HashMap为什么容量必须设计为2的幂？
请从hash取模和位运算角度解释。
```

```
HashMap resize为什么需要重新计算元素位置？
```

---

# 今日笔记

更新：

```
notes/Java/HashMap.md
```

记录：

- capacity：数组容量
- loadFactor：负载因子，默认0.75
- threshold：capacity * loadFactor
- resize：创建新数组、扩容、重新定位、迁移数据
- 容量为2的幂方便使用 `(hash & (length-1))` 计算位置

---

# Git提交

代码：

```bash
git add .
git commit -m "feat: add hashmap resize demo"
```

笔记：

```bash
git add .
git commit -m "docs: add hashmap resize notes"
```

---

# 今日完成标准 Checklist

- [ ] 理解capacity
- [ ] 理解loadFactor
- [ ] 理解threshold
- [ ] 理解resize整体流程
- [ ] 完成ResizeDemo
- [ ] 更新HashMap学习笔记
- [ ] Git提交

---

# 今日最低学习协议（疲劳版）

如果当天状态不好，完成：

- 阅读HashMap扩容原理20分钟
- 写ResizeDemo并运行
- 更新3句话笔记

即可完成Day02。
