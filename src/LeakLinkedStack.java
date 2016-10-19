/**
 * LeakStack interface adapter for Leaky Singly Linked List
 * Stack implementation
 * Created by Youmin on 10/16/2016.
 */
public class LeakLinkedStack<E> implements LeakStack<E>{

    public LeakySinglyLLStack list;

    public LeakLinkedStack(int capacity){
        list = new LeakySinglyLLStack<>(capacity);
        System.out.println("The capacity is " + capacity);
    }

    public int size(){
        return list.size();
    }//end size

    public boolean isEmpty(){
        return list.isEmpty();
    }//end isEmpty

    public void push(E element){
        list.addFirst(element);
    }//end push

    public E top(){
        return (E) list.first();
    }//end top

    public E pop(){
        return (E) list.removeFirst();
    }//end pop
}
