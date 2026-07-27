\# Day01：HashMap 入门（90 分钟版）



> 日期：第一周 Day1

>

> 今日目标：掌握 HashMap 基本使用，完成第一个 Demo，并形成第一篇学习笔记。



\---



\# 今日任务



\## 任务一：阅读 JavaGuide（20 分钟）



学习内容：



\- HashMap 基本介绍

\- HashMap 与 Hashtable 的区别

\- HashMap 底层结构（整体了解即可）



完成标准：



能够回答：



\- HashMap 是什么？

\- 为什么大家都用 HashMap？

\- HashMap 的底层结构是什么？



\---



\## 任务二：观看视频（20 分钟）



仅观看：



HashMap 章节。



要求：



\- 不连续观看整套课程

\- 看完本章节即可



\---



\## 任务三：编写 Demo（40 分钟）



创建项目：



```

collection-demo

```



创建：



```

HashMapDemo.java

```



完成以下功能：



\- put()

\- get()

\- remove()

\- containsKey()

\- containsValue()

\- putIfAbsent()

\- replace()



示例数据：



```java

HashMap<String, Integer> map = new HashMap<>();



map.put("Tom", 18);

map.put("Jerry", 20);



System.out.println(map.get("Tom"));



map.putIfAbsent("Tom", 99);



System.out.println(map.containsKey("Jerry"));



System.out.println(map.containsValue(20));



map.replace("Jerry", 21);



map.remove("Tom");



System.out.println(map);

```



扩展要求：



自己新增两组数据，并观察输出结果。



\---



\## 任务四：AI 辅助理解（15 分钟）



向 AI 提问：



问题一：



```

为什么 HashMap 底层采用数组 + 链表 + 红黑树？



请用生活中的例子解释，不要讲源码。

```



问题二：



```

为什么 HashMap 查询速度快？



请画一个简单流程帮助理解。

```



目标：



理解设计思想，而不是背源码。



\---



\## 任务五：整理学习笔记（10 分钟）



创建：



```

notes/Java/HashMap.md

```



记录：



\- 今天学到了什么

\- 哪些内容还没理解

\- 明天准备继续学习什么



\---



\## Git 提交



代码：



```

feat: add hashmap demo

```



笔记：



```

docs: add hashmap learning notes

```



\---



\# 今日完成标准（Checklist）



\- \[ ] 阅读 JavaGuide HashMap

\- \[ ] 完成 HashMap 视频章节

\- \[ ] 编写 HashMapDemo

\- \[ ] 掌握 put/get/remove 等基本 API

\- \[ ] 完成第一篇学习笔记

\- \[ ] Git Commit



\---



\# 今日最低学习协议（疲劳版）



如果今天工作很累，只需完成以下三项：



\- \[ ] 阅读 JavaGuide 15 分钟

\- \[ ] 运行 HashMapDemo

\- \[ ] 写一句学习总结



完成以上内容，今天也算学习成功。

