import java.util.Scanner;

/**
 * Demo to run the leaky stack using a circular array as
 * the data structure.
 *
 * Created by Youmin on 10/12/2016.
 */
public class ArrayStackDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the maximum size of the data structure.");
        int MAXIMUM_SIZE = keyboard.nextInt();

        //create a leaky array stack with given capacity
        LeakyArrayStack<Integer> leakyIntStack = new LeakyArrayStack<Integer>(MAXIMUM_SIZE);

        System.out.println("Enter how many items you would like to add to the stack.");
        int addItems = keyboard.nextInt();

        //adds 1~n into the array stack
        for(int i = 0; i < addItems; i++){
            leakyIntStack.push(i+1);
        }

        //prints the top element of the stack and size of the stack before popping
        System.out.println("Top of stack is " + leakyIntStack.top() + " with a size of " + leakyIntStack.size());

        //pops all of the element from the stack until its empty
        while(!leakyIntStack.isEmpty()){
            System.out.println("Popping element: [" + leakyIntStack.pop() + "]");            //pops top element
        }//end while loop

/*      //pops 1~n elements from the stack
        for(int i = 0; i < 10; i++){
            System.out.println("[" + leakyIntStack.pop() + "]");            //pops top element
        }//end for loop*/

        //prints the top element of stack and size of the stack after popping
        System.out.println("Top of stack is " + leakyIntStack.top() + " with a size of " + leakyIntStack.size());
    }//end main
}
