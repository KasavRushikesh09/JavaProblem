import java.util.*;
public class removeEven{
    public static void main(String args[]){
        Arraylist<Integer> list  = new ArrayList<>(
                Arrays.asList(1,2,3,4,5,6,7,8,9)
        );

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            int num = it.next()
            if(num%2 == 0){
                it.remove();
            }
        }
        System.out.println(list);
    }
}