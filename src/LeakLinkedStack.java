/**
 * Created by Youmin on 10/16/2016.
 */
public class LeakLinkedStack<E> implements LeakStack<E>{
    int MAX_SIZE = 5;
    public LeakySinglyLLStack list = new LeakySinglyLLStack<>(MAX_SIZE);

    public LeakLinkedStack(int capacity){
        System.out.println("The capacity is " + capacity);
        MAX_SIZE = capacity;
        System.out.println("The maxi is " + MAX_SIZE);
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
