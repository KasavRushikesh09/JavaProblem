import java.util.*;
public class StackCollection {

    public static void ElementAtBottom(int data,Stack<Integer>s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        ElementAtBottom(data,s);
        s.push(top);
    }
    public static void main(String[] args){
        Stack<Integer>s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        ElementAtBottom(8,s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}