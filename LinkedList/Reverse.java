import java.util.*;
public class reverse{
    public static void main(String args[]) {
        LinkedList<Integer> list = new LinkedList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6)
        );
        System.out.println("Original list: "+ list);
        reverseList(list);
        System.out.println("Reverse list: "+ list);
    }
        static void reverseList(LinkedList<Integer>list){
            int left = 0;
            int right = list.size()-1;

            while(left<right){
                int temp = list.get(left);
                list.set(left,list.get(right));
                list.set(right,temp);
                left++;
                right--;
        }
    }
}