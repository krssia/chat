`ArrayList` 的底层是==数组队列==[^1]，相当于动态数组。与 Java 中的数组相比，它的容量能动态增长。

`ArrayList` 继承于 `AbstractList`，实现了 `List`, `RandomAccess`, `Cloneable`, `java.io.Serializable` 这些接口。
```
public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable{ }
```
- `List` : 表明它是一个列表，支持添加、删除、查找等操作，并且可以通过下标进行访问。
- `RandomAccess`：这是一个标志接口，表明实现这个接口的 `List` 集合是支持 **快速随机访问** 的。在 `ArrayList` 中，我们就可以通过元素的序号快速获取元素对象，这就是快速随机访问。
- `Cloneable`：表明它支持通过 `clone()` 方法进行拷贝，`ArrayList#clone()` 返回的是浅拷贝[^2]。
- `Serializable` : 表明它可以进行序列化操作，也就是可以将对象转换为字节流进行持久化存储或网络传输，非常方便。
![[Pasted image 20260902093803.png]]

### Arraylist 与 LinkedList 区别？
- **是否保证线程安全**： `ArrayList` 和 `LinkedList` 都是不同步的，也就是不保证线程安全
- **底层数据结构：** `ArrayList` 底层使用的是 **`Object` 数组**；`LinkedList` 底层使用的是 **双向链表** 数据结构
- **插入和删除是否受元素位置的影响**:
	- `ArrayList` 采用数组存储，所以插入和删除元素的时间复杂度受元素位置的影响。 比如：执行 `add(E e)` 方法的时候， `ArrayList` 会默认将指定的元素追加到此列表的末尾，这种情况时间复杂度就是 O(1)。但是如果要在指定位置 i 插入和删除元素的话（`add(int index, E element)`），时间复杂度就为 O(n)。因为在进行上述操作的时候集合中第 i 和第 i 个元素之后的(n-i)个元素都要执行向后位/向前移一位的操作。
	- `LinkedList` 采用链表存储，所以在头尾插入或者删除元素不受元素位置的影响（`add(E e)`、`addFirst(E e)`、`addLast(E e)`、`removeFirst()`、 `removeLast()`），时间复杂度为 O(1)，如果是要在指定位置 `i` 插入和删除元素的话（`add(int index, E element)`，`remove(Object o)`,`remove(int index)`）， 时间复杂度为 O(n)，因为需要先移动到指定位置再插入和删除。
- **是否支持快速随机访问：** `LinkedList` 不支持高效的随机元素访问，而 `ArrayList`（实现了 `RandomAccess` 接口） 支持。快速随机访问就是通过元素的序号快速获取元素对象(对应于 `get(int index)` 方法)。
- **内存空间占用：**`ArrayList` 的空间浪费主要体现在在list 列表的结尾会预留一定的容量空间，而 LinkedList 的空间花费则体现在它的每一个元素都需要消耗比 ArrayList 更多的空间（因为要存放直接后继和直接前驱以及数据）。

## [ArrayList 扩容机制分析](https://javaguide.cn/java/collection/arraylist-source-code.html#arraylist-%E6%89%A9%E5%AE%B9%E6%9C%BA%E5%88%B6%E5%88%86%E6%9E%90)

### [先从 ArrayList 的构造函数说起](https://javaguide.cn/java/collection/arraylist-source-code.html#%E5%85%88%E4%BB%8E-arraylist-%E7%9A%84%E6%9E%84%E9%80%A0%E5%87%BD%E6%95%B0%E8%AF%B4%E8%B5%B7)
`ArrayList` 有三种方式来初始化
1. 第一种为默认无参构造，会构造一个初始容量为10的空列表
```
/** 
* 默认构造函数，使用初始容量10构造一个空列表(无参数构造) 
*/ 
public ArrayList() { 
	this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA; 
}
```
2. 第二种为带有初始容量的构造函数
```
/** 
* 带初始容量参数的构造函数。（用户自己指定容量） 
*/ 
public ArrayList(int initialCapacity) { 
	if (initialCapacity > 0) {//初始容量大于0 
		//创建initialCapacity大小的数组
		this.elementData = new Object[initialCapacity]; 
	} else if (initialCapacity == 0) { //初始容量等于0 
		//创建空数组 
		this.elementData = EMPTY_ELEMENTDATA; 
	} else {//初始容量小于0，抛出异常 
		throw new IllegalArgumentException("Illegal Capacity: " +
		initialCapacity); 
	} 
}
```
3. 构造包含指定collection元素的列表，这些元素利用该集合的迭代器按顺序返回 如果指定的集合为null，throws NullPointerException。
### add方法
```
/**
* 将指定的元素追加到此列表的末尾。
*/
public boolean add(E e) {
    // 加元素之前，先调用ensureCapacityInternal方法
    ensureCapacityInternal(size + 1);  // Increments modCount!!
    // 这里看到ArrayList添加元素的实质就相当于为数组赋值
    elementData[size++] = e;
    return true;
}
```
- 当我们要 `add` 进第 1 个元素到 `ArrayList` 时，`elementData.length` 为 0（因为还是一个空的 list），因为执行了 `ensureCapacityInternal()` 方法，所以 `minCapacity` 此时为 10。此时，`minCapacity - elementData.length > 0` 成立，所以会进入 `grow(minCapacity)` 方法。
- 当 `add` 第 2 个元素时，`minCapacity` 为 2，此时 `elementData.length`（容量）在添加第一个元素后扩容成 `10` 了。此时，`minCapacity - elementData.length > 0` 不成立，所以不会进入（执行）`grow(minCapacity)` 方法。
- 添加第 3、4···到第 10 个元素时，依然不会执行 grow 方法，数组容量都为 10。

直到添加第 11 个元素，`minCapacity`（为 11）比 `elementData.length`（为 10）要大。进入 `grow` 方法进行扩容。
[^1]: 翻译上的遗留问题，实际准确称呼为动态数组或可变长数组

[^2]: 只复制“**对象本身**”和“**对象里的基本类型**”，对于“**引用类型**”数据，只复制引用地址（即指针），不复制引用的对象本身。而深拷贝对 “**引用类型**” 则会新建一个对象。
