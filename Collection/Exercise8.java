package Collection;

import java.util.Stack;


/*
Design a Data Structure SpecialStack that supports all the stack operations
 like push(), pop(), isEmpty(), isFull() and an additional
 operation getMin() which should return minimum element from the SpecialStack. (Expected complexity ­ O(1))
 */

public class Exercise8
{

    private Stack<Integer> s = new Stack<>();
    private int min;

    public void push(int x)
    {
        if (s.empty()) {
            s.push(x);
            min = x;
        }
        else if (x > min) {
            s.push(x);
        }
        else {
            s.push(2 * x - min);
            min = x;
        }
    }

    public void pop()
    {
        if (s.empty()) {
            System.out.println("Stack is empty");
        }

        int top = s.peek();
        if (top < min)
            min = 2 * min - top;
        s.pop();
    }

    public int min()
    {
        return min;
    }

    public static void main (String[] args)
    {
        Exercise8 s = new Exercise8();

        s.push(6);
        s.push(7);
        s.push(5);
        System.out.println("Minimum element:" + s.min());

        s.push(3);
        System.out.println("Minimum element:" + s.min());
        s.pop();
        s.pop();
        System.out.println("Minimum element:" + s.min());
    }
}