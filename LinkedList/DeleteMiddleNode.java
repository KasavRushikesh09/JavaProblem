import java.util.*;

class Main {
    public static void main(String[] args) {
        // Code to read input and create linked list
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        LinkedList<Integer>list = new LinkedList<>();

        for(int i=0;i<num;i++){
            list.add(scan.nextInt());
        }
        if(list.size() <=1){

        }
        int mid = list.size()/2;
        list.remove(mid);
        for(int n:list){
            System.out.print(n+" ");
        }
    }
}