public class DoublyLinkedList<T> {
    private Node headNode;
    private Node tailNode;
    private int size;

    private class Node {
        T data;
        Node next;
        Node previous;

        Node(T data) {
            this.data = data;
        }
    }

    public DoublyLinkedList() {
        headNode = tailNode = null;
        size = 0;
    }

    // overloaded constructor
    public DoublyLinkedList(T data) {
        Node newNode = new Node(data);
        headNode = tailNode = newNode;
        size = 1;
    }

}