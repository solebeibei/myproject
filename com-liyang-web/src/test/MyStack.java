import java.util.Stack;

public class MyStack {

    private Stack<Integer> stack, stackExample;

    public MyStack() {
        stack = new Stack<Integer>();
        stackExample = new Stack<Integer>();
    }

    public void push(int data) {
        if (stack.size() == 0) {
            stack.push(data);
            stackExample.push(data);
        } else {
            stack.push(data);
            if (data > (int) stackExample.peek()) {
                stackExample.push(stackExample.peek());
            } else {
                stackExample.push(data);
            }
        }

    }

    public void pop() {

        stackExample.pop();
        stack.pop();
    }

    public Integer min() {
        if (stack.size() == 0) {
            return null;
        }
        return stackExample.peek();

    }

    public static void main(String[] args) {

        MyStack myStack=new MyStack();
        myStack.push(3);
        myStack.push(4);
        myStack.push(2);
        System.out.println(myStack.min());
        myStack.pop();
        System.out.println(myStack.min());
    }
}
