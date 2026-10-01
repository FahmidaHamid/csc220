import linkedlist.MyLinkedList;
import linkedlist.Node;

public class Demo {

    public static void main(String[] args) {
        
        MyLinkedList<Integer> llst = new MyLinkedList<>();
        
        System.out.println("Printing the linked list");
        llst.printList();

        Node<Integer> aNode = new Node<>(12);

        llst.insert(aNode);
        System.out.println("Printing the linked list, after inserting 12");
        llst.printList();

        Node<Integer> anotherNode = new Node<>(100);
        llst.insert(anotherNode);
        System.out.println("Printing the linked list, after inserting 100");
        llst.printList();

        Node<Integer> bNode = new Node<>(103);
        llst.insert(bNode);
        System.out.println("Printing the linked list, after inserting 103");
        llst.printList();

    }

}