import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your solution here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        LinkedList<Integer>list = new LinkedList<>();
        for(int i=0;i<n;i++){
            list.add(scan.nextInt());
        }

        for(int i=0;i<list.size()-1;i+=2){
            int first = list.get(i);
            int second = list.get(i+1);

            list.set(i+1,first);
            list.set(i,second);

        }
        for(int num:list){
            System.out.prin
        }
    }
}