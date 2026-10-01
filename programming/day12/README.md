# Serialization and DeSerialization

- In Java, **serialization** is the process of converting an object's state into a byte stream, allowing it to be saved to a file, stored in a database, or transmitted over a network. 

- **Deserialization** is the exact reverse process, where the byte stream is used to reconstruct the original Java object in memory.

# Why is serialization important or useful?

- Serialization is essential because standard Java objects only live inside a computer’s temporary volatile memory (RAM).

    - When the Java Virtual Machine (JVM) shuts down, those objects are permanently destroyed.
    
    - Serialization solves this problem by turning complex objects into a universal format that can be stored or moved. 

    - It is useful for persistence, networking, and state preservation.

# Primary Use Cases

1) Deep Persistence (Saving State)
        
    - **File Storage:** Saves the exact state of an application or user session to a physical file (e.g., a .ser file).
        
    - **Game Saves:** Captures the complex state of a video game—characters, levels, inventory, and health—so a user can close the game and resume exactly where they left off later.
        
    - **Database Storage:** Allows developers to store complex object graphs inside a database binary large object (BLOB) column without mapping every single field to individual relational columns.

2) Network Communication (Data Transfer)
	
    - **Remote Procedure Calls (RPC):** Enables frameworks like Java Remote Method Invocation (RMI) to send an object from one JVM across a network to be processed by a completely different machine.

	- **Clustered Microservices:** Allows web servers to sync user sessions across multiple servers in a cluster. If Server A crashes, Server B can deserialize the session data and continue serving the user without interrupting their experience.

3) Caching and Performance Optimization

	- **Memory Offloading:** Moves idle or low-priority objects out of the fast, expensive RAM memory and temporarily stores them serialized on a slower hard drive. When the application needs them again, it deserializes them back into memory.

	- **Distributed Caching:** Works behind the scenes in enterprise caching tools (like Redis or Hazelcast) to share pre-calculated objects across independent worker nodes to speed up application performance.

4) Deep Cloning

	- **Object Duplication:** Provides a simple workaround to create a perfect, independent copy (deep clone) of a complex object graph. By serializing an object into a byte array in memory and immediately deserializing it, you get a fresh duplicate that shares no memory references with the original.

## Modern Context: Java Serialization vs. Alternatives

- While native Java serialization (Serializable) is powerful, modern development heavily favors text-based or schema-based serialization alternatives for web development and microservices due to cross-language support and security:

- **JSON (JavaScript Object Notation):** Using libraries like Jackson or Google's Gson to convert Java objects into plain text. This allows Java applications to talk seamlessly to applications written in Python, JavaScript, or C#.

- **Protocol Buffers (Protobuf):** Developed by Google for high-performance, compact binary serialization.

## Question: We could have stored the student information in a csv file with the field name and read it back instead of the FileOutputStream. What's the big deal?

| CSV | Java object serialization |
|---|---|
| We choose columns and write field values | Java writes the serializable object state |
| We parse values and call constructors to rebuild objects | Java reconstructs objects from the stream |
| Easy to inspect and exchange with other tools | Primarily intended for compatible Java applications |
| Relationships require our own representation | Can preserve relationships within an object graph |

# Final Takeaway:

- Serialization is useful because it automates saving and reconstructing object structures. 
- Whether it is the best choice depends on the data and who needs to read it. For one simple record, CSV may be the better choice.

# Stream:

- A stream is a sequence of data that a program reads or writes over time. 
- Think of **water flowing through a pipe**: the program receives or sends data through that connection, without needing to handle the entire file at once.
- Input and output are named from the program’s perspective:
    - Input stream: data flows into the program from a source, such as a file.
    - Output stream: data flows out of the program to a destination, such as a file.
- FileInputStream and FileOutputStream work with bytes.


