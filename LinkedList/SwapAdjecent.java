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
        for(int i=0;i<list.size()-1;i+=2){
            int first = list.get(i);
            int second = list.get(i+1);

            list.set(i+1,first);
            list.set(i,second);

        }
        for(int num :list){
            System.out.println(num+" ");
        }
    }

}