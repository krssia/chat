# Phase 4 - Netty 深入与服务器项目

## 目标

掌握 Netty 核心原理，独立完成一个 Netty 服务器项目。**这是跳槽节点：完成本阶段后开始投递。**

## 内容

### Netty 核心

- Reactor 线程模型
- EventLoop 与 EventLoopGroup
- Channel 与 ChannelPipeline
- ChannelHandler 与 ChannelHandlerContext
- ByteBuf 与内存管理
- 编解码器与粘包拆包
- 心跳机制与断线重连
- 空闲检测

### 项目实践

**主线项目：Netty 迷你 RPC**，任务文档见 [tasks/netty-mini-rpc.md](./tasks/netty-mini-rpc.md)。

做法是**项目驱动**：不先学完理论再做，而是直接做项目，用到什么补什么。

- 里程碑 M0～M10：Echo → 自定义协议 → 连接管理 → 心跳 → 请求响应 → 线程池 → 动态代理 → 服务注册 → 序列化 → 断线重连
- 项目会逼你用上集合、并发、网络、IO、反射等基础技术
- 卡住时回查 Phase 1～3 的对应知识

其他可选方向（做完主线后）：

- IM 即时通讯服务端
- 网关 / 代理服务
- 消息推送服务

## 完成标准

- 能画出 Netty 的线程模型
- 能解释 EventLoop、ChannelPipeline、ByteBuf 的作用
- 能解决粘包拆包问题
- 能实现心跳和断线重连
- 完成一个可演示的 Netty 项目
- 能独立向别人讲清楚项目架构和核心流程

## 学习建议

- 不要只看理论，至少写一个完整项目
- 每个 Demo 先自己写，卡住再让 AI 解释
- 项目要记录：业务场景、协议设计、线程模型、遇到的问题
