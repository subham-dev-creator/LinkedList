package main;

public class SortedLinkedList <T>{
    private Node<T> Head = null;

    // Add Node in Sorted Linked List
    public void addNode(T value){
        Node<T> temp = new Node<>(value);
        if(Head==null)
            Head=temp;
        else
        {
            if((int)Head.getValue()>(int)temp.getValue()){
                temp.setNext(Head);
                Head=temp;
            }
            else {
                // take iterator to the Node which is greatest and is small to Value
                Node<T> iterator = Head;
                while (iterator.getNext() != null && (int) iterator.getNext().getValue() < (int) temp.getValue()) {
                    iterator = iterator.getNext();
                }

                temp.setNext(iterator.getNext());
                iterator.setNext(temp);
            }
        }
    }

    // Function to print the LinkedList
    private void printList() {
        Node<T> iteratorNode = Head;
        while(iteratorNode!=null) {
            System.out.print(iteratorNode.getValue() + " -->> ");
            iteratorNode = iteratorNode.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SortedLinkedList<Integer> list = new SortedLinkedList<>();
        list.addNode(56);
        list.printList();
        list.addNode(30);
        list.printList();
        list.addNode(40);
        list.printList();
        list.addNode(70);
        list.printList();
    }
}
