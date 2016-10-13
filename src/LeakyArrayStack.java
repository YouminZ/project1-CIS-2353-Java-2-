/**
 * Created by Youmin on 10/12/2016.
 */
public class LeakyArrayStack<E> implements LeakStack<E> {

    public static final int CAPACITY = 50;
    private E[] data;
    private int s = 0;
    private int t = -1;
    public LeakyArrayStack() {
        this(CAPACITY);
    }//end constructor to make default array size

    public LeakyArrayStack(int capacity){
        data = (E[]) new Object[capacity];
    }//end constructor taking args


    @Override
    public int size(){
        return (s);
    }//end size

    @Override
    public boolean isEmpty(){
        return (size() == 0);
    }//end isEmpty

    @Override
    public void push(E e){
        data[t = (t+1)%data.length] = e;
        if(s < data.length){
            s++;
        }
    }//end push

    @Override
    public E top(){
        if(isEmpty()){
            return null;
        }
        else if(t == -1){
            t = data.length-1;
            return data[t];
        }
        return data[t];
    }//end top

    @Override
    public E pop(){
        if(isEmpty()){
            return null;
        }
        else if (t == -1){
            t = data.length-1;
            E temp = data[t];
            data[t] = null;
            t--;
            s--;
            return temp;
        }
        else{
            E temp = data[t];
            data[t] = null;
            t = (t-1)%data.length;
            s--;
            return temp;
        }
    }//end pop
}
