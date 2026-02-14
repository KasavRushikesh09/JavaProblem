import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Your code here
        int n = scanner.nextInt();
        //read elemenet
        LinkedList<Integer>list1 = new LinkedList<>();
        for(int i=0;i<n;i++){
            list1.add(scanner.nextInt());
        }

        int a = scanner.nextInt();
        LinkedList<Integer>list2 = new LinkedList<>();
        for(int i=0;i<a;i++){
            list2.add(scanner.nextInt());
        }

        list1.addAll(list2);
        //print
        for(int num: list1){
            System.out.print(num+"->");
        }
        System.out.println("null");
    }
}