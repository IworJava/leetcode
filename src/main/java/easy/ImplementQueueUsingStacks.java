package easy;

import java.util.Deque;
import java.util.LinkedList;

public class ImplementQueueUsingStacks {

    private final Deque<Integer> stack1;
    private final Deque<Integer> stack2;

    public ImplementQueueUsingStacks() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        move();
        return stack2.pop();
    }

    public int peek() {
        move();
        return stack2.peek();
    }

    public boolean empty() {
        return stack2.isEmpty() && stack1.isEmpty();
    }

    private void move() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }
}
