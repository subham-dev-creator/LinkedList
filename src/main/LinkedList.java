package main;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class LinkedList<T> {
    private Node<T> Head = null;

    private void printList(Node<T> node) {
        while(node!=null) {
            System.out.print(node.getValue() + " -->> ");
            node = node.getNext();
        }
    }

    private void addNode(T value){
        Node<T> temp = new Node<T>(value);
        if(Head==null){
            Head=temp;
        }
        else
        {
            temp.setNext(Head);
            Head=temp;
        }
    }


    public static void main(String[] args) {
        LinkedList<Integer> list =new LinkedList<>();
        list.addNode(56);
        list.addNode(30);
        list.addNode(70);
        list.printList(list.Head);
    }
}
