# Git 提交规范

> 目标：让学习仓库的提交记录清晰，方便半年、一年后回顾自己的成长过程。

---

# 核心原则

每次提交说明：

```
我完成了什么变化
```

不要使用无意义描述：

```
update
修改
test
代码更新
```

---

# Commit 格式

统一使用：

```
类型: 内容
```

例如：

```
feat: add hashmap demo

docs: update hashmap notes

fix: fix redis connection issue
```

---

# 常用类型

## feat（新增）

用于：

- 新增 Demo
- 新增功能
- 新增项目模块

示例：

```
feat: add redis cache demo
```

---

## docs（文档）

用于：

- 学习笔记
- README
- 设计文档

示例：

```
docs: add week01 summary
```

---

## fix（修复）

用于：

- 修复 Bug
- 修复配置问题

示例：

```
fix: fix thread pool demo bug
```

---

## refactor（重构）

用于：

- 优化代码结构
- 提升可读性

示例：

```
refactor: improve demo structure
```

---

# 学习 Demo 提交建议

例如学习 HashMap：

```
feat: add hashmap demo

feat: add hashmap resize demo

feat: add hashmap collision demo

docs: add hashmap notes
```

---

# 项目提交建议

不要一次提交整个项目。

不推荐：

```
feat: finish project
```

推荐按照功能提交：

```
feat: add user module

feat: implement jwt login

feat: add redis cache layer
```

---

# 提交前检查

提交前确认：

- [ ] 代码可以运行
- [ ] 删除无用文件
- [ ] 文档是否需要更新
- [ ] Commit 信息是否清晰

---

# Git 学习目标

GitHub 不只是保存代码。

它应该记录：

```
学习过程
    ↓
代码实践
    ↓
问题修复
    ↓
能力成长
```

半年后回看，可以清晰看到自己的技术成长轨迹。
