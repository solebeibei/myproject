package offer;

import java.util.Stack;

public class CheckStackIsEqual {

    public static boolean check(int[] source, int[] desc) {
        if (source == null || desc == null) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();

        int k = 0;
        for (int i = 0; i < source.length; i++) {

            stack.push(source[i]);
            while (!stack.isEmpty() && stack.peek().equals(desc[k])) {
                stack.pop();
                k++;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5};
        int[] desc = {4, 5, 3, 2, 1};
        boolean result = CheckStackIsEqual.check(source, desc);
        System.out.println(result);
    }
}
