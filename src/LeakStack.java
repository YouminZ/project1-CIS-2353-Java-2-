/**
 * Created by Youmin on 10/12/2016.
 */
public interface LeakStack<E> {

    int size();

    boolean isEmpty();

    void push(E e);

    E top();

    E pop();
}
