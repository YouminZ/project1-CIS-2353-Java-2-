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
    public LeakySinglyLLStack(){
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
        head = new Node<>(e, head);
        if (size == 0){
            tail = head;
        }
        size++;
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
}
