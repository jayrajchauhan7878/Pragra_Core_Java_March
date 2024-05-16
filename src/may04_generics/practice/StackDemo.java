package may04_generics.practice;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<Integer> stc = new Stack<>();

        System.out.println("Size at beginning "+stc.size());

        stc.push(10);
        stc.push(20);
        stc.push(30);
        stc.push(40);
        stc.push(50);

        System.out.println("Size after adding "+stc.size());
        System.out.println("After adding values"+stc);

        System.out.println("Popping one element ");
        stc.pop();

        System.out.println("After popping one element "+stc);
        System.out.println("Size after popping"+stc.size());

        System.out.println("Peeking Top most element in stack"+stc.peek());

        System.out.println("Size after peeking"+stc.size());



    }
}
