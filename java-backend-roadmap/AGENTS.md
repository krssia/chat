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
- Milestone-based, not calendar-based
- Server is the main line; Agent is the side line
- One major knowledge topic per phase
- Minimum daily habit is more important than a fixed schedule

Each phase should contain:

1. Learning goal
2. Core concepts
3. Notes
4. Demo experiments
5. Review summary

Additional rules for this learner:

- 先自己写 / 自己讲，再让 AI 检查
- 加班或状态差时，15～30 分钟复习也算完成当天学习
- 优先使用工作里的真实任务做练习
- 不背源码，要能解释设计原因

---

## Current Roadmap

### Phase 0
Topic: 习惯与现状盘点
Status: In Progress

Goal:
Build a minimum daily learning habit and inventory the learner's current work stack and weak points. Complete this quickly and move to Phase 1.

### Phase 1
Topic: Java 核心与集合
Status: Next

Goal:
Independently complete collection tasks and explain core collection mechanisms.

### Phase 2
Topic: 并发与 JVM
Status: Planned

Goal:
Understand Java concurrency and JVM basics to prepare for Netty's threading model.

### Phase 3
Topic: 网络、操作系统与 IO 模型
Status: Planned

Goal:
Understand TCP/IP, Socket, and IO multiplexing so the learner can explain why Netty uses NIO.

### Phase 4
Topic: Netty 深入与服务器项目
Status: Planned

Goal:
Learn Netty core concepts and complete a server project. **This is the jump milestone.**

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

Current Phase:
Phase 0 - 习惯与现状盘点

Next Tasks:
1. Complete Phase 0: work stack inventory
2. Complete Phase 0: weak point list
3. Confirm minimum daily learning habit
4. Enter Phase 1 and start HashMap task

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
