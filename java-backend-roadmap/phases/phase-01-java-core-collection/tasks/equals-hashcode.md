# Task: equals/hashCode 与集合

## 学习目标

理解 equals 与 hashCode 的约定，掌握它们在 HashSet/HashMap 等哈希集合中的关键作用，并能够正确实现。

## 需要掌握

完成任务后，需要能够解释：

- Object 默认 equals 和 hashCode 的行为
- equals 与 hashCode 的约定
- 为什么 hashCode 相等不代表 equals 相等
- 为什么 HashMap/HashSet 先比较 hashCode，再比较 equals
- 正确实现 equals 的步骤
- 正确实现 hashCode 的常见方式
- 可变对象作为 key 的风险
- equals/hashCode 不一致导致的典型问题

## 学习步骤

### 第一阶段：概念

学习：

- 默认 equals 是引用比较
- 默认 hashCode 与对象内存地址相关
- 两个对象 equals 相等时 hashCode 必须相等
- 两个对象 hashCode 相同时 equals 可以不等

实践：

写出这几条约定的代码示例，并说明每条约定的意义。

### 第二阶段：在集合中的作用

学习：

- HashMap 查找流程：hash → 定位桶 → equals 比较
- HashSet 去重流程
- 只重写 equals 不重写 hashCode 的问题
- 只重写 hashCode 不重写 equals 的问题
- 重写 equals 时必须重写 hashCode 的原因

实践：

设计实验，分别观察 hashCode 恒定、equals 恒定等情况下集合行为。

### 第三阶段：正确实现

学习：

- equals 对称性、传递性、一致性
- 使用 getClass 或 instanceof 判断类型
- 使用 Objects.equals 比较字段
- 使用 Objects.hash 或 31 倍乘法生成 hashCode
- 为什么 key 最好使用不可变对象

实践：

实现一个自定义类，正确重写 equals 和 hashCode，并放入 HashSet/HashMap 验证。

## 实践任务

创建 equals-hashcode-demo：

1. 默认 equals/hashCode 行为
2. 只重写 equals 导致 HashSet 去重失效
3. 只重写 hashCode 导致 contains 失效
4. 正确重写 equals/hashCode 后正常去重
5. 使用可变对象作为 key，修改后无法查找
6. 使用 IDE 生成 equals/hashCode 并分析

## 思考问题

完成后回答：

1. 为什么两个 equals 相等的对象 hashCode 必须相等？
2. HashMap 中 hashCode 相同但 equals 不同会发生什么？
3. equals 和 hashCode 不一致会导致哪些 bug？
4. 为什么推荐使用不可变对象作为 Map 的 key？
5. 为什么 hashCode 通常使用 31 作为乘数？

## 完成标准

能够独立向别人解释 equals/hashCode 约定，并在自定义对象中正确实现两者。
