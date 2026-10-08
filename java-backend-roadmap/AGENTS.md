# AI Agent Context

## Context

Repository: java-backend-roadmap

Purpose: Maintain a milestone-based roadmap for a fresh-grad Java developer preparing to switch to **Server Development (Netty/RPC/High-performance)** as the primary direction and **Agent Development** as the secondary direction.

This file is used by AI agents to understand repository background, learning strategy, current state, and maintenance rules.

---

## Goal

Help the learner:

1. Move from “AI writes the code” to “I can independently design, explain, and modify code.”
2. Learn Netty and build a real server project as the jump-switch milestone.
3. Prepare both Server and Agent development directions, with Server as the main track.

---

## User Profile

Role:
- Fresh graduate, already working as Java backend developer

Background:
- Work stack: Spring Boot, MySQL, Dameng database, Redis
- Responsible for real tasks, but most code is AI-generated
- Understands some usage, but lacks systematic foundation
- Next job target: Server Development or Agent Development
- Jump milestone: after finishing Netty and a Netty server project

AI usage goal:
- Use AI as a reviewer and explainer, not as the primary code writer
- Avoid depending on AI-generated black-box solutions

---

## Long Term Direction

### Server Development (Primary)

Focus:
- Computer networks
- TCP/UDP
- Netty
- RPC
- High performance servers

### AI Agent Engineering (Secondary)

Focus:
- LLM fundamentals
- RAG
- Tool Calling
- Agent Frameworks
- MCP
- AI application engineering

---

## Learning Rules

Learning model:
- **Project-driven**: the Netty mini RPC project is the main line; learn foundations on demand
- Milestone-based, not calendar-based
- Server is the main line; Agent is the side line
- Minimum daily habit is more important than a fixed schedule
- Segmented learning is allowed: one resource can be split across sessions

Each phase should contain:

1. Learning goal
2. Learning resources with how-to-use and focus guidance
3. Core concepts
4. Practice / demo
5. Review summary

Additional rules for this learner:

- 核心代码自己写：AI 只做讲解、review、出题，不代写核心类
- 参考官方示例的正确流程：先看 → 自己写 → 对照 → 删掉重写
- 加班或状态差时，15～30 分钟复习也算完成当天学习
- 不背源码，要能解释设计原因

---

## Current Roadmap

### Phase 0
Topic: 习惯与现状盘点
Status: Completed

Goal:
Build a minimum daily learning habit and inventory the learner's current work stack and weak points. Completed with all areas treated as beginner / semi-entry level.

### Phase 1
Topic: Java 核心与集合
Status: Deferred（改为项目驱动后按需回查）

Goal:
Collection knowledge is learned on demand when the Netty project needs it (connection management needs Map, equals/hashCode).

### Phase 2
Topic: 并发与 JVM
Status: Deferred（按需回查）

Goal:
Concurrency is learned when the project hits request-response pairing and thread pools.

### Phase 3
Topic: 网络、操作系统与 IO 模型
Status: Deferred（按需回查）

Goal:
Network and IO knowledge is learned when the project needs custom protocol and packet framing.

### Phase 4
Topic: Netty 深入与服务器项目
Status: In Progress

Goal:
Build the Netty mini RPC project (M0～M10) as the main line. **This is the jump milestone.**
Task doc: phases/phase-04-netty-server/tasks/netty-mini-rpc.md

### Phase 5
Topic: RPC 与高性能服务扩展
Status: Planned

Goal:
Extend the Netty project into RPC / gateway / high-performance server experience.

### Phase 6
Topic: Agent 开发基础
Status: Planned

Goal:
Build LLM / RAG / Tool Calling / Agent demos as the secondary direction.

### Phase 7
Topic: 项目复盘与面试准备
Status: Planned

Goal:
Prepare Server and Agent projects, resume, and mock interviews.

---

## Current Progress

Completed:
- Roadmap restructuring (v2 → v4)
- Repository structure design
- Phase learning model design
- Phase 1 collection task docs created
- Roadmap v4 (Server main + Agent side) designed
- Phase 0 task created
- Phase 0 inventory created
- Phase 0 completed（按初学者/半入门水平确认薄弱点）
- Phase 4 switched to project-driven approach
- Netty mini RPC milestone plan created (M0～M10)

Current Phase:
Phase 4 - Netty 深入与服务器项目（项目驱动）

Next Tasks:
1. M0：新建工程，跑通最小 Echo 服务端 + 客户端
2. M1：读懂自己写的 Echo，能讲出来
3. M2：自定义协议 + 编解码 + 粘包拆包
4. Update progress status after each milestone

---

## Agent Rules

When maintaining this repository:

1. Read README.md first.
2. Read this AGENTS.md for context.
3. Read progress/status.md for current state.
4. Continue existing work instead of creating unrelated plans.
5. Keep plans suitable for fragmented learning time.
6. Do not skip foundational knowledge.
7. Design the next phase only after the current phase is completed.
8. Directly commit and push changes after finishing work; do not wait for confirmation.
9. Do not commit unrelated personal files (e.g. root-level temporary text files).

---

## Output Format Preference

AI-generated workflow documents should use:

- Context
- Goal
- Rules
- Input
- Output
- Constraints
- Current Progress
