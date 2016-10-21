/**
 * A collection of objects that are inserted and removed according
 * to the last-in first-out principle. Although similar in purpose,
 * this interface differs from java.util.Stack.
 *
 * Created by Youmin on 10/12/2016.
 */
public class LeakyArrayStack<E> implements LeakStack<E> {

    public static final int CAPACITY = 50;          //default array capacity
    private E[] data;                               //generic array ready to be used as storage
    private int s = 0;                              //holds the size of the array
    private int t = -1;                             //index for the top of the stack

    //constructor to make a leaky array stack with default capacity
    public LeakyArrayStack() {
        this(CAPACITY);
    }//end constructor

    //constructor to make a array stack with given capacity
    public LeakyArrayStack(int capacity){
        System.out.println("The maximum data size is set to " + capacity);
        data = (E[]) new Object[capacity];
    }//end constructor

    @Override
    public int size(){
        return (s);
    }//end size

    @Override
    public boolean isEmpty(){
        return (s == 0);
    }//end isEmpty

    @Override
    public void push(E e){
        data[t = (t+1)%data.length] = e;            //algorithm to make the array a circular array wrap around the length of the array
        if(s < data.length){                        //maxes the sizes counter to the maximum array size
            s++;
        }
    }//end push

    @Override
    public E top(){
        if(isEmpty()){
            return null;
        }
        return data[t];
    }//end top

    @Override
    public E pop(){
        if(isEmpty()){
            return null;
        }
        E temp = data[t];
        data[t] = null;
        t = ((((t-1)%data.length) + data.length) % data.length);        //all this just to get modulus to work with negative numbers
        s--;                                        //decrement size
        return temp;
    }//end pop
}
