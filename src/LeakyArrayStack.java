/**
 * Created by Youmin on 10/12/2016.
 */
public class LeakyArrayStack<E> implements LeakStack<E> {

    public static final int CAPACITY = 50;
    private E[] data;
    private int f = -1;
    public LeakyArrayStack() {
        this(CAPACITY);
    }//end constructor to make default array size

    public LeakyArrayStack(int capacity){
        data = (E[]) new Object[capacity];
    }//end constructor taking args


    @Override
    public int size(){
        return (f+1);
    }//end size

    @Override
    public boolean isEmpty(){
        return (f == -1);
    }//end isEmpty

    @Override
    public void push(E e) throws IllegalStateException{
        if (size() == data.length){
            throw new IllegalStateException("Stack is Full");
        }
        data[f = (f+1)%data.length] = e;
    }//end push

    @Override
    public E top(){
        if(isEmpty()){
            return null;
        }
        return data[f];
    }//end top

    @Override
    public E pop(){
        if(isEmpty()){
            return null;
        }
        E temp = data[f];
        data[f] = null;
        f--;
        return temp;
    }//end pop
}
