/**
 * Created by Youmin on 10/16/2016.
 */
public class SinglyLLDemo {
    public static void main(String[] args){
        //create a leaky array stack with given capacity
        LeakLinkedStack<Integer> leakyIntLLStack = new LeakLinkedStack<Integer>(10);

        for(int i = 0; i < 15; i++){
            leakyIntLLStack.push(i+1);
        }

        //prints the top element of the stack and size of the stack before popping
        System.out.println("Top of stack is " + leakyIntLLStack.top() + " with a size of " + leakyIntLLStack.size());

        while(!leakyIntLLStack.isEmpty()){
            System.out.println("[" + leakyIntLLStack.pop() + "]");            //pops top element
        }//end while loop

        //prints the top element of stack and size of the stack after popping
        System.out.println("Top of stack is " + leakyIntLLStack.top() + " with a size of " + leakyIntLLStack.size());
    }//end Main
}
