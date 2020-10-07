package main;

public class Node<T> {

    private int Value;
    private Node<T> next;

    public Node(int value){
        this.Value=value;
        this.next=null;
    }

    public int getValue() {
        return Value;
    }

    public void setValue(int value) {
        Value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
