/**
 * Created by Youmin on 10/16/2016.
 */
public class LeakySinglyLLStack<E>{
    //------------------- nested Node class -------------------
    private static class Node<E>{
        private E element;
        private Node<E> next;
        public Node(E e, Node<E> n){
            element = e;
            next = n;
        }//end node

        public E getElement(){
            return element;
        }//end getElement

        public Node<E> getNext(){
            return next;
        }//end getNext

        public void setNext(Node<E> n){
            next = n;
        }//end setNext
    }//---------- end of nested Node class ----------

    //instance variable of the LeakySinglyLLStack
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;
    private int MAXIMUM_SIZE;
    public LeakySinglyLLStack(int capacity){
        MAXIMUM_SIZE = capacity;
        System.out.println("The maximum is " + MAXIMUM_SIZE);
    }//end constructor

    //access methods
    public int size(){
        return size;
    }//end size

    public boolean isEmpty(){
        return size == 0;
    }//end isEmpty


    public E first(){
        if(isEmpty()){
            return null;
        }
        return head.getElement();
    }//end first

    public void addFirst(E e){
        if(size == MAXIMUM_SIZE){
            head = new Node<>(e, head);
            removeLast();
        }
        else{
            head = new Node<>(e, head);
            size++;
        }
    }//end addFirst

    public E removeFirst(){
        if(isEmpty()){
            return null;
        }
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if(size == 0){
            tail = null;
        }
        return answer;
        }//end removeFirst

    private void removeLast(){
        if(head == tail){
            head = null;
            tail = null;
        }
        else{
            Node<E> previousToTail = head;
            while(previousToTail.getNext() != tail){
                previousToTail = previousToTail.getNext();
            }
            tail = previousToTail;
            tail.setNext(null);
        }
    }//end removeLast
}
