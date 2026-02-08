import java.util.*;

public class NthNode{
    public static void main(String args[]){
        LinkedList<Integer>list = new LinkedList<>(
                Arrays.asList(1,2,3,4,5,6,7)
                );
        System.out.println(list);
        Node(list,3);
    }
    static void Node(LinkedList<Integer>list,int n){
        int size = list.size();

        if(n <= 0 || n > size){
            System.out.println("Invalid N");
            return;
        }

        int index = size - n;
        System.out.println("Nth Node from End: "+list.get(index));
    }
}