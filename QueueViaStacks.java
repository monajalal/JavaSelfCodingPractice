/**
 * Created by mona on 5/26/16.
 */
import java.util.Stack;
//Implement queue using two stacks
public class QueueViaStacks {

    private int size=0;
    private Stack<Integer> firstStack = new Stack<>();
    private Stack<Integer> secondStack = new Stack<>();

    public void add(int item) {
        while (!firstStack.isEmpty()) {
            secondStack.push(firstStack.pop());
        }
        secondStack.push(item);
        while (!secondStack.isEmpty()) {
            firstStack.push(secondStack.pop());
        }
        size++;
    }

    public int remove() {
        size--;
        return firstStack.pop();

    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        QueueViaStacks queue = new QueueViaStacks();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue.remove());
        System.out.println(queue.size());
        System.out.println(queue.remove());
        System.out.println(queue.size());
    }

}
