# Phase 3 - 网络、操作系统与 IO 模型

## 目标

为 Netty 和高性能服务器开发打下网络与操作系统基础，能够解释“为什么 Netty 使用 NIO / IO 多路复用”。

## 内容

### 网络基础

- TCP/IP 分层模型
- TCP 三次握手 / 四次挥手
- TCP 粘包拆包
- HTTP / WebSocket 基础
- Socket 编程

### 操作系统基础

- 进程与线程
- 上下文切换
- 用户态与内核态
- 零拷贝
- 文件描述符

### IO 模型

- BIO：阻塞 IO
- NIO：非阻塞 IO
- IO 多路复用：select / poll / epoll
- Reactor 模型
- 对比：为什么 NIO 适合高并发

## 完成标准

- 能画出 TCP 三次握手和四次挥手
- 能解释 BIO、NIO、IO 多路复用的区别
- 能说明 epoll 相比 select/poll 的优势
- 能说出 Netty 采用 NIO 的原因
- 完成 Socket / NIO 实验笔记

## 学习建议

- 先写一个最简单的 Socket 服务端/客户端
- 再改成 NIO 多路复用
- 最后再进入 Netty，这样能理解 Netty 解决的是什么问题
