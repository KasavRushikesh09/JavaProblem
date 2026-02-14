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
        int target = scan.nextInt();

        Iterator<Integer>it = list.iterator();
        while(it.hasNext()){
            if(it.next()>target){
                it.remove();
            }
        }
        if(list.isEmpty()){
            System.out.print("null");
        }
        else{
            for(int num:list){
                System.out.print(num+" ");
            }
        }
    }
}