# LinkedLists

- **motivation**: We don't need one contiguous block, the structure can grow node-by-node, and insertion/deletion can be performed by changing links rather than shifting a whole sequence.

- Linked lists solve a **memory-organization problem**: they allow a data structure to grow and change without requiring all of its elements to occupy one contiguous block of memory or requiring elements to be shifted when the structure changes.

- Arrays and linked lists represent **two different strategies** for organizing memory. Arrays favor contiguous storage and fast indexed access. Linked lists sacrifice that contiguous organization to make structural changes possible through links between independently allocated nodes. Each choice creates different costs.

# Compile:
- javac -d bin $(find src -name "*.java")

# Run:
- java -cp bin Demo
