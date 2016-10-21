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
    }//end constructor

    //access methods
    public int size(){
        return size;
    }//end size

    //check to see if the Linked List is empty
    public boolean isEmpty(){
        return size == 0;
    }//end isEmpty

    //returns the top element of the stack but does not delete
    public E first(){
        if(isEmpty()){
            return null;
        }
        return head.getElement();
    }//end first

    //adds a element to the top of the stack
    public void addFirst(E e){
        if(size == MAXIMUM_SIZE){
            head = new Node<>(e, head);
            removeLast();
        }//if stack is full the bottom of the stack will be deleted
        else{
            head = new Node<>(e, head);
            size++;
        }//adds a element to the top of the stack and increase size
    }//end addFirst

    //pops the top element of the stack and return it
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

    //private utility for removing the bottom of the stack to make it leaky
    private void removeLast(){
        if(head == tail){
            head = null;
            tail = null;
        }//end if there is only 1 element in the list sets both tail and head to null, empty list
        else{
            //starts the walker for previous to tail with the head node
            Node<E> prevToTail = head;
            //walker to find the node previous to tail
            while(prevToTail.getNext() != tail){
                prevToTail = prevToTail.getNext();
            }
            tail = prevToTail;      //sets the new tail as previous to tail
            tail.setNext(null);     //sets the new tail next element to null for garbage collection
        }
    }//end removeLast
}
