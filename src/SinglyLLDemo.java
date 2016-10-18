/**
 * Created by Youmin on 10/16/2016.
 */
public class SinglyLLDemo {
    public static void main(String[] args){
        //create a leaky array stack with given capacity
        LeakLinkedStack<Integer> leakyIntLLStack = new LeakLinkedStack<Integer>();

        for(int i = 0; i < 12; i++){
            leakyIntLLStack.push(i+1);
        }

        while(!leakyIntLLStack.isEmpty()){
            System.out.println("[" + leakyIntLLStack.pop() + "]");            //pops top element
        }//end while loop

    }
}
