import java.util.*;
public class CommanElement{
    public static void main(String args[]){
        ArrayList<Integer> list1 = new ArrayList<>(
                Arrays.asList(1,2,3,4,5,6,7)
                );
        ArrayList<Integer> list2 = new ArrayList<>(
                Arrays.asList(4,5,6,7,8,9)
                );
        ArrayList<Integer> comman = new ArrayList<>(list1);
        comman.retainAll(list2);
        System.out.println(comman);
    }
}