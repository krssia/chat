# Task: HashMap

## Objective

Understand the design, usage and core implementation ideas of Java HashMap.

## Learning Goals

After finishing this task, you should understand:

- Map key-value model
- hash concept
- hash collision handling
- HashMap internal structure
- resize mechanism
- equals and hashCode relationship

## Learning Path

### Level 1: Usage

Learn:

- Map interface
- put/get/remove
- common usage scenarios

### Level 2: Internal Principle

Learn:

- array + linked list structure
- JDK8 treeification
- red-black tree
- load factor
- expansion

### Level 3: Source Reading

Focus on:

- put()
- get()
- resize()

Do not memorize source code. Understand why it is designed this way.

## Resources

### Official

- Java HashMap API documentation
- OpenJDK HashMap source code

### Blog

Resources should be added after verification. Prefer high quality technical articles and source analysis.

### Video

When using videos, record:

- video name
- author/UP
- chapters to watch
- learning purpose

## Practice

Create hashmap-demo:

1. Basic HashMap operations
2. Custom object as key
3. equals/hashCode experiment
4. Hash collision experiment

## Completion Criteria

You can explain:

- Why HashMap is fast
- How hash collision is solved
- Why equals/hashCode matter
- Why JDK8 introduced red-black tree
- Why HashMap is not thread-safe
