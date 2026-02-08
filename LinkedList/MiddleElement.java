import java.util.*;
public class MiddleElement {
    public static void main(String args[]){
        LinkedList<Integer>list = new LinkedList<>(
                Arrays.asList(1,2,3,4,5,6,7)
        );

        System.out.println(list);
        MiddleElement(list);
    }

    static void MiddleElement(LinkedList<Integer>list){
        int slow = 0;
        int fast = 0;

        while(fast<list.size() && fast+1<list.size()){
            slow++;
            fast+=2;
        }
        System.out.println("middle element is : "+list.get(slow));
    }
}