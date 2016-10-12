import java.util.Random;
import java.util.Scanner;

public class Main {
/*    static Random rand = new Random();
    static Scanner keyboard = new Scanner(System.in);*/

    public static void main(String[] args) {
        LeakyArrayStack<Integer> leakyIntStack = new LeakyArrayStack<Integer>(10);

        leakyIntStack.push(1);
        leakyIntStack.push(2);
        leakyIntStack.push(3);
        leakyIntStack.push(4);
        leakyIntStack.push(5);
        leakyIntStack.push(6);
        leakyIntStack.push(7);
        leakyIntStack.push(8);
        leakyIntStack.push(9);
        leakyIntStack.push(10);

        System.out.println("Top of stack is " + leakyIntStack.top());

        while (!leakyIntStack.isEmpty()){
            int num = leakyIntStack.pop();
            System.out.print("[" + num + "]");
        }



    }//end main
}




/*        for(int i = 0; i <= n-1; i++){
            leakyIntStack.push(rand.nextInt(50));
        }

        while (!leakyIntStack.isEmpty()){
            //System.out.println("Stack size before pop is " + leakyIntStack.size());
            int num = leakyIntStack.pop();
            System.out.print("[" + num + "]");
            //System.out.println("------------------------------------------------------------");
        }*/

/*    public static int takeSize(){
        System.out.println("How big of array would you like to test?");
        int size = keyboard.nextInt();

        return size;
    }//end takeSize*/