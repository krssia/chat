`LinkedList` 是一个基于双向链表实现的集合类，经常被拿来和 `ArrayList` 做比较。关于 `LinkedList` 和 `ArrayList` 的详细对比， [Java 集合常见面试题总结(上)](https://www.javaguide.cn/java/collection/java-collection-questions-01.html)有详细介绍到。![[bidirectional-linkedlist.png]]
不过，我们在项目中一般是不会使用到 `LinkedList` 的，需要用到 `LinkedList` 的场景几乎都可以使用 `ArrayList` 来代替，并且，性能通常会更好！就连 `LinkedList` 的作者约书亚 · 布洛克（Josh Bloch）自己都说从来不会使用 `LinkedList`。
### [LinkedList 插入和删除元素的时间复杂度？](https://www.javaguide.cn/java/collection/linkedlist-source-code.html#linkedlist-%E6%8F%92%E5%85%A5%E5%92%8C%E5%88%A0%E9%99%A4%E5%85%83%E7%B4%A0%E7%9A%84%E6%97%B6%E9%97%B4%E5%A4%8D%E6%9D%82%E5%BA%A6)

- 头部插入/删除：只需要修改头结点的指针即可完成插入/删除操作，因此时间复杂度为 O(1)。
- 尾部插入/删除：只需要修改尾结点的指针即可完成插入/删除操作，因此时间复杂度为 O(1)。
- 指定位置插入/删除：需要先移动到指定位置，再修改指定节点的指针完成插入/删除，不过由于有头尾指针，可以从较近的指针出发，因此需要遍历平均 n/4 个元素，时间复杂度为 O(n)。
### ### [LinkedList 为什么不能实现 RandomAccess 接口？](https://www.javaguide.cn/java/collection/linkedlist-source-code.html#linkedlist-%E4%B8%BA%E4%BB%80%E4%B9%88%E4%B8%8D%E8%83%BD%E5%AE%9E%E7%8E%B0-randomaccess-%E6%8E%A5%E5%8F%A3)

`RandomAccess` 是一个标记接口，用来表明实现该接口的类支持随机访问（即可以通过索引快速访问元素）。由于 `LinkedList` 底层数据结构是链表，内存地址不连续，只能通过指针来定位，不支持随机快速访问，所以不能实现 `RandomAccess` 接口。
## [LinkedList 源码分析](https://www.javaguide.cn/java/collection/linkedlist-source-code.html#linkedlist-%E6%BA%90%E7%A0%81%E5%88%86%E6%9E%90)

`LinkedList` 继承了 `AbstractSequentialList`，而 `AbstractSequentialList` 又继承于 `AbstractList`。
阅读过 `ArrayList` 的源码我们就知道，`ArrayList` 同样继承了 `AbstractList`， 所以 `LinkedList` 会有大部分方法和 `ArrayList` 相似。
`LinkedList` 实现了以下接口：
- `List` : 表明它是一个列表，支持添加、删除、查找等操作，并且可以通过下标进行访问。
- `Deque`：继承自 `Queue` 接口，具有双端队列的特性，支持从两端插入和删除元素，方便实现栈和队列等数据结构。需要注意，`Deque` 的发音为 "deck" [dɛk]，这个大部分人都会读错。
- `Cloneable`：表明它具有拷贝能力，可以进行深拷贝或浅拷贝操作。
- `Serializable` : 表明它可以进行序列化操作，也就是可以将对象转换为字节流进行持久化存储或网络传输，非常方便。
![[linkedlist--class-diagram.png]]