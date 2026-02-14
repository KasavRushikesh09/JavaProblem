import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Your code here
        int n = scanner.nextInt();
        //read element
        LinkedList<Integer>list = new LinkedList<>();
        for(int i=0;i<n;i++){
            list.add(scanner.nextInt());
        }
        int element = scanner.nextInt();

        // check valid condition

        list.addFirst(element);
        //print
        for(int num:list){
            System.out.print(num+"->");
        }
        System.out.println("null");


    }
}