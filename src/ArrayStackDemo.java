/**
 * Demo to run the leaky stack using a circular array as
 * the data structure.
 *
 * Created by Youmin on 10/12/2016.
 */
public class ArrayStackDemo {
    public static void main(String[] args) {
        //create a leaky array stack with given capacity
        LeakyArrayStack<Integer> leakyIntStack = new LeakyArrayStack<Integer>(15);

        //adds 1~n into the array stack
        for(int i = 0; i < 120; i++){
            leakyIntStack.push(i+1);
        }
/*      leakyIntStack.push(1);
        leakyIntStack.push(2);
        leakyIntStack.push(3);
        leakyIntStack.push(4);
        leakyIntStack.push(5);
        leakyIntStack.push(6);
        leakyIntStack.push(7);
        leakyIntStack.push(8);
        leakyIntStack.push(9);
        leakyIntStack.push(10);
        leakyIntStack.push(11);
        leakyIntStack.push(12);
        leakyIntStack.push(13);
        leakyIntStack.push(14);
        leakyIntStack.push(15);*/

        //prints the top element of the stack and size of the stack before popping
        System.out.println("Top of stack is " + leakyIntStack.top() + " with a size of " + leakyIntStack.size());

        //pops all of the element from the stack until its empty
        while(!leakyIntStack.isEmpty()){
            System.out.println("[" + leakyIntStack.pop() + "]");            //pops top element
        }//end while loop

/*        //pops 1~n elements from the stack
        for(int i = 0; i < 10; i++){
            System.out.println("[" + leakyIntStack.pop() + "]");            //pops top element
        }//end for loop*/

        //prints the top element of stack and size of the stack after popping
        System.out.println("Top of stack is " + leakyIntStack.top() + " with a size of " + leakyIntStack.size());
    }//end main
}
