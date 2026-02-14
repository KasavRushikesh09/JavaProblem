import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Your code here
        int n = scanner.nextInt();
        LinkedList<Integer>list = new LinkedList<>();

        for(int i=0;i<n;i++){
            list.add(scanner.nextInt());
        }

        list.removeLast();
        for( int num: list){
            System.out.print(num+"->");
        }
        System.out.print("null");
    }
}