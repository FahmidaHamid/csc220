package linkedlist;

public class Node<T> {

    private T data;
    private Node<T> next;

    public Node() {
        data = null;
        next = null;
    }
    public Node(T data) {
        this.data = data;
        next = null;    
    }
    public T getData() {
        return data;
    }
    public Node<T> getNext() {
        return next;
    }
    public void setData(T newData) {
        data = newData;
    }
    public void setNext(Node<T> newNext) {
        next = newNext;
    }

    public static void main(String[] args) {

        Node<String> aStrNode = new Node<>("This is a String Node");

        System.out.println(aStrNode.getData());
        System.out.println(aStrNode.getNext());


        Node<Integer> anIntNode = new Node<>(442323);

        System.out.println(anIntNode.getData());
        System.out.println(anIntNode.getNext());
    }

}

