package linkedlist;

public class MyLinkedList<T>{
    
    private Node<T> head;
    private int total_node;
    
    public MyLinkedList(){
        head = null; // empty linked list
        total_node = 0;
    }
    
    public Node<T> getHead(){
        return head;
    }

    public void insert(Node<T> newNode){

        if (head == null){
            head = newNode; // when the head node was null
        }
        else{
            newNode.setNext(head); // insert 
            head = newNode; // then adjust
        }
        total_node++;
    }


    public boolean isEmpty() {
        
        return (head == null)? true: false;
    }

    public void printList(){

        Node<T> temp = head;

        if(isEmpty())
        {
            System.out.println("The list is empty");
            return;
        }

        while(temp != null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

   }
