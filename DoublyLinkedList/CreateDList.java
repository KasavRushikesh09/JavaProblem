import java.util.*;
public class CreateDList{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer>list = new LinkedList<>();

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        if(n == 0){
            System.out.println("Doubly LinkedList is empty");
        }
        else{
            System.out.println("ENter Elements: ");
            for(int i=0;i<n;i++){
                list.add(sc.nextInt());
            }
        }
        // Display doubly linked list (forward)

        System.out.print("Forward Display: ");
        for(int x: list){
            System.out.print(x +"<->");
        }
        System.out.println("Null");

        // Display doubly linked list (backward)
        System.out.print("Backward Display: ");
        Iterator<Integer> it = list.descendingIterator();
        while(it.hasNext()){
            System.out.print(it.next()+"<->");
        }
        System.out.println("Null");
        sc.close();
    }
}