/**
 * LeakStack interface adapter for Leaky Singly Linked List
 * Stack implementation
 *
 * Created by Youmin on 10/16/2016.
 */
public class LeakLinkedStack<E> implements LeakStack<E>{

    //declare the Leaky Singly Linked-List Stack
    public LeakySinglyLLStack list;

    /**
     * Constructor for Leaky Singly Linked-List Stack
     *
     * @param capacity the MAXIMUM_SIZE of the Linked List Data Structure
     */
    public LeakLinkedStack(int capacity){
        list = new LeakySinglyLLStack<>(capacity);              //initiate the linked list
        System.out.println("The maximum data size is set to " + capacity);
    }//end constructor

    //adapter for size interface
    public int size(){
        return list.size();
    }//end size

    //adapter for isEmpty interface
    public boolean isEmpty(){
        return list.isEmpty();
    }//end isEmpty

    //adapter for push interface
    public void push(E element){
        list.addFirst(element);
    }//end push

    //adapter for top interface
    public E top(){
        return (E) list.first();
    }//end top

    //adapter for pop interface
    public E pop(){
        return (E) list.removeFirst();
    }//end pop
}
