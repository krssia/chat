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

选择并实现一个：

- 简易 RPC 服务端
- IM 即时通讯服务端
- 网关 / 代理服务
- 消息推送服务
- 自定义协议服务器

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
