import java.util.Scanner;

/**
 * Demo to run the leaky stack using a singly linked list as
 * the data structure.
 *
 * Created by Youmin on 10/16/2016.
 */
public class SinglyLLDemo {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the maximum size of the data structure.");
        int MAXIMUM_SIZE = keyboard.nextInt();

        //create a leaky array stack with given capacity
        LeakLinkedStack<Integer> leakyIntLLStack = new LeakLinkedStack<Integer>(MAXIMUM_SIZE);

        System.out.println("Enter how many items you would like to add to the stack.");
        int addItems = keyboard.nextInt();

        //adds item to the top of the stack
        for(int i = 0; i < addItems; i++){
            leakyIntLLStack.push(i+1);
        }

        //prints the top element of the stack and size of the stack before popping
        System.out.println("Top of stack is " + leakyIntLLStack.top() + " with a size of " + leakyIntLLStack.size());

        //pops the top element of the stack until its emepty
        while(!leakyIntLLStack.isEmpty()){
            System.out.println("Popping element: [" + leakyIntLLStack.pop() + "]");            //pops top element
        }//end while loop

/*        //pops 1~n elements from the stack
        for(int i = 0; i < 10; i++){
            System.out.println("[" + leakyIntLLStack.pop() + "]");            //pops top element
        }//end for loop*/

        //prints the top element of stack and size of the stack after popping
        System.out.println("Top of stack is " + leakyIntLLStack.top() + " with a size of " + leakyIntLLStack.size());
    }//end Main
}
