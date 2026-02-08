import java.util.*;
public class CheckEmpty{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        LinkedList<Integer>list = new LinkedList<>();

        System.out.println("Enter the size:");
        int size = sc.nextInt();

        if(size == 0){
            System.out.println("Invalid input");
        }
        else{
            System.out.println("Enter the Element: ");
            for(int i=0;i<size;i++){
                list.add(sc.nextInt());
            }
        }
        if(list.isEmpty()){
            System.out.println("List Is Empty");
        }
        else{
            System.out.println("Not empty :"+list);
        }
    }
}