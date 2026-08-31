# Java Backend Roadmap v4

> 目标：应届生已入职，当前代码主要依赖 AI 编写；以 **Netty / 高性能服务器开发为主线**，同时准备 **Agent 开发**，学完 Netty 并完成服务器项目后开始跳槽。

## 当前状态

- 应届生，已经上班
- 工作技术栈：Spring Boot、MySQL、达梦数据库、Redis
- 实际负责了一些任务，但代码基本都是由 AI 写出来的
- 下一份工作目标：**服务器开发（Server Development）** 或 **Agent 开发**
- 主攻方向：**Server 为主线，Agent 为副线**
- 跳槽节点：**以学完 Netty 并完成 Netty 项目为节点**，不严格按时间卡

## 学习原则

- 每天学一点，加班日 15～30 分钟也算坚持
- 上班空闲时间用于读文档、整理笔记、看代码
- 先自己写 / 自己讲，再让 AI 检查
- 不背源码，要能解释设计原因
- 优先使用工作里的真实任务做练习
- 本仓库修改后直接提交，不需要每次询问

## 路线总览

| 阶段 | 主题 | 周期参考 | 核心产出 |
|---|---|---|---|
| Phase 0 | 习惯与现状盘点 | 1～2 周 | 每日最低学习习惯；工作技术清单 |
| Phase 1 | Java 核心与集合 | 3～4 周 | 独立完成 ArrayList / HashMap / HashSet Demo |
| Phase 2 | 并发与 JVM | 4～5 周 | 线程池 / 锁 / GC 笔记与 Demo |
| Phase 3 | 网络、操作系统与 IO 模型 | 4～5 周 | TCP/IP / IO 多路复用笔记与实验 |
| Phase 4 | Netty 深入与服务器项目 | 5～6 周 | 完成一个 Netty 服务器项目 |
| Phase 5 | RPC 与高性能服务扩展 | 4～5 周 | RPC / IM / 网关等项目 |
| Phase 6 | Agent 开发基础 | 4～6 周 | LLM / RAG / Tool Calling / Agent Demo |
| Phase 7 | 项目复盘与面试准备 | 4～6 周 | 简历、项目讲解、模拟面试 |

## 跳槽节点

**Phase 4 完成后即可开始投递。**

- 最低跳槽标准：能讲清 Netty 核心原理，并有一个能演示的 Netty 服务器项目
- 加分项：继续完成 Phase 5 RPC / 高性能扩展，或 Phase 6 Agent 项目
- 投递期间可以边面试边补 Phase 5～7

## 阶段详情

### Phase 0：习惯与现状盘点

- 建立“每天多少学一点”的最低学习习惯
- 盘点工作技术栈和薄弱点
- 明确 Server / Agent 双方向目标
- 输出：工作技术清单 + 个人薄弱点清单

### Phase 1：Java 核心与集合

- 重点：ArrayList、LinkedList、HashMap、HashSet、equals/hashCode、集合选型
- 每个知识点完成：理解 → Demo → 总结
- 目标：能独立写出常见集合代码，并解释 HashMap 基本流程

### Phase 2：并发与 JVM

- 并发：Thread、synchronized、volatile、Lock、ThreadPool
- JVM：内存区域、类加载、GC、JVM 参数、OOM 排查思路
- 目标：为 Netty 的线程模型和高性能服务打底

### Phase 3：网络、操作系统与 IO 模型

- 网络：TCP/IP、HTTP、Socket 编程
- 操作系统：进程 / 线程、上下文切换、零拷贝
- IO 模型：BIO、NIO、IO 多路复用（select / poll / epoll）
- 目标：能解释“为什么 Netty 用 NIO / 多路复用”

### Phase 4：Netty 深入与服务器项目

- Reactor 线程模型
- EventLoop、Channel、ChannelPipeline
- ByteBuf 与内存管理
- 编解码、粘包拆包
- 心跳、断线重连
- 实践：实现一个简单 RPC / IM / 网关 / 推送服务器
- **跳槽节点：完成此阶段后开始投递**

### Phase 5：RPC 与高性能服务扩展

- 序列化协议
- 自定义协议设计
- 服务注册与发现
- 负载均衡
- 高并发参数调优
- 实践：把 Phase 4 项目扩展成更完整的 RPC 或网关

### Phase 6：Agent 开发基础

- LLM 基础与模型调用
- Prompt 设计
- RAG：向量化、检索、增强生成
- Tool Calling
- Agent Framework（LangChain4j / Spring AI 等）
- 实践：做一个 Java Agent Demo

### Phase 7：项目复盘与面试准备

- 选择 Server 项目 + Agent 项目各 1 个
- 梳理：业务背景、技术架构、核心流程、难点、优化
- 整理高频八股：Netty、并发、JVM、网络、Redis、MySQL
- 优化简历，进行模拟面试

## 工作技术栈处理建议

- Spring Boot、MySQL、Redis 仍然是你日常工作的基础，但不再是跳槽主路线
- MySQL / Redis 在 Phase 7 面试准备中集中补高频考点即可
- 工作中遇到的数据库问题继续记录，不单独占用主路线时间

## 长期方向（跳槽后继续）

- Server Development：RPC、高性能服务器、网络协议、分布式系统
- AI Agent：LLM 应用工程、RAG、Agent Framework、MCP
