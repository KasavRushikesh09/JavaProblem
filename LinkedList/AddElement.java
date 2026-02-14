import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Your code here
        int n = scanner.nextInt();
        //read ths element
        LinkedList<Integer>list = new LinkedList<>();
        for(int i=0;i<n;i++){
            list.add(scanner.nextInt());
        }
        int element = scanner.nextInt();
        int position = scanner.nextInt();
        //check valid position
        if(position >= 0 && position <= list.size()){
            list.add(position,element);
        }

        //print list
        for(int num : list){
            System.out.print(num+"->");
        }
        System.out.println("null");
    }
}