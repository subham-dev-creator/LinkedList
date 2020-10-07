package main;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class LinkedList<T> {
    private Node<T> Head = null;
    private Node<T> Tail = null;

    // Function to print the LinkedList
    private void printList() {
        Node<T> iteratorNode = Head;
        while(iteratorNode!=null) {
            System.out.print(iteratorNode.getValue() + " -->> ");
            iteratorNode = iteratorNode.getNext();
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

    // returns the length of the Linked List
    private int length(){
        int len=0;
        Node<T> iteratorNode = Head;
        while(iteratorNode!=null){
            len++;
            iteratorNode = iteratorNode.getNext();
        }
        return len;
    }

    // Add Node in the middle of LinkedList
    private void addNodeMid(T value){
        Node<T> temp = new Node<T>(value);

        if((Tail==null) && (Head==null)){
            Head=temp;
            Tail=temp;
        }
        else
        {
            Node<T> iteratorNode = Head;

            int len = length();
            if(len%2==0)
                len--;
            len=len/2;

            while(len>0){
                iteratorNode = iteratorNode.getNext();
//                System.out.println(iteratorNode.getValue());
                len--;
            }

            temp.setNext(iteratorNode.getNext());
            iteratorNode.setNext(temp);
        }
    }

    // DELETION OF NODE AT THE FRONT OF LINKED LIST
    private void deleteNodeFront(){
        if(Head == null) // if no node is there
            return;
        else if(Head==Tail) // for single element in linked list
        {
            Head = null;
            Tail = null;
        }
        else{
            // Any other case
            Head=Head.getNext();
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> list =new LinkedList<>();
        list.addNodeLast(56);
        list.addNodeLast(70);
        list.addNodeMid(30);
        list.printList();
        System.out.println();
        list.deleteNodeFront();
        list.printList();
    }
}
