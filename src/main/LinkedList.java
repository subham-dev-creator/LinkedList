package main;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class LinkedList<T> {
    private Node<T> Head = null;
    private Node<T> Tail = null;

    // Function to print the LinkedList
    private void printList(Node<T> node) {
        while(node!=null) {
            System.out.print(node.getValue() + " -->> ");
            node = node.getNext();
        }
    }

    // Add node in linkedList in the front
    private void addNodeFront(T value){
        Node<T> temp = new Node<T>(value);
        if((Tail==Head) && (Head==null)){
            Head=temp;
            Tail=temp;
        }
        else
        {
            temp.setNext(Head);
            Head=temp;
        }
    }

    // Add node in LinkedList at the end
    private void addNodeLast(T value){
        Node<T> temp = new Node<T>(value);

        if((Tail==null) && (Head==null)){
            Head=temp;
            Tail=temp;
        }
        else
        {
            Tail.setNext(temp);
            Tail=temp;
        }

    }


    public static void main(String[] args) {
        LinkedList<Integer> list =new LinkedList<>();
        list.addNodeLast(56);
        list.addNodeLast(30);
        list.addNodeLast(70);
        list.printList(list.Head);
    }
}
