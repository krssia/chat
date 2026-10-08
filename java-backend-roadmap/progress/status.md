# Learning Progress

## Current State

phase:
Phase 4 - Netty 深入与服务器项目（项目驱动）

status:
In Progress

topic:
Netty 迷你 RPC 项目 - M0 环境搭建 + 最小 Echo

target:
Server Development（Netty/RPC/高性能）为主线，Agent Development 为副线

jump_milestone:
完成 Netty 迷你 RPC 项目（M0～M10）后开始投递

---

## Repository Progress

completed:
- Roadmap structure created
- AI context file created
- Phase based learning structure created
- Task format created
- Phase 1 collection task docs created
- Roadmap v4 (Server main + Agent side) designed
- Phase 0 completed（按初学者/半入门水平确认薄弱点）
- Phase 4 switched to project-driven approach
- Netty mini RPC milestone plan created (M0～M10)

---

## Task Status

current_task:
Netty 迷你 RPC - M0 环境搭建 + 最小 Echo

checklist:

- [ ] M0 环境搭建 + 最小 Echo
- [ ] M1 读懂自己写的 Echo
- [ ] M2 自定义协议 + 编解码 + 粘包拆包
- [ ] M3 连接管理（集合实战）
- [ ] M4 心跳与空闲检测
- [ ] M5 请求-响应模型
- [ ] M6 业务线程池
- [ ] M7 客户端动态代理
- [ ] M8 服务注册与路由
- [ ] M9 序列化 + 超时重试
- [ ] M10 断线重连 + 压测 + 文档

---

## Approach Change

从「先学完基础再做项目」改为「项目驱动」：

- 理由：纯读基础文档没有输出、反馈慢、容易忘、上班用不上
- 做法：用 Netty 迷你 RPC 项目倒逼基础，用到什么补什么
- 铁律：核心代码自己写，AI 只做讲解 / review / 出题

Phase 1～3 不再按顺序硬推，改为项目卡住时回查：

- 连接管理 → 集合
- 请求响应 / 线程池 → 并发
- 自定义协议 / 粘包拆包 → 网络与 IO

---

## Next Action

priority:
1

action:
开始 M0：新建 Maven 工程，跑通最小 Echo 服务端 + 客户端。

following_tasks:
- M1 读懂 Echo
- M2 自定义协议
- M3 连接管理

---

## Agent Instruction

Continue from current phase.
Do not create unrelated learning plans.
Update this file after each milestone.
修改仓库后直接 commit 并 push，不需要询问。
