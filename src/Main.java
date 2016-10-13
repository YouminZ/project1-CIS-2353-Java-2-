/**
 * Created by Youmin on 10/12/2016.
 */
public class Main {
    public static void main(String[] args) {
        LeakyArrayStack<Integer> leakyIntStack = new LeakyArrayStack<Integer>(10);

        //adds 1~n into the array stack
        for(int i = 0; i < 15; i++){
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


        System.out.println("Top of stack is " + leakyIntStack.top() + " with a size of " + leakyIntStack.size());

        for(int i = 0; i < 10; i++){
            //System.out.println(leakyIntStack.size());
            System.out.println(leakyIntStack.pop());            //pops top element
        }

        System.out.println("Top of stack is " + leakyIntStack.top() + " with a size of " + leakyIntStack.size());
    }//end main
}
