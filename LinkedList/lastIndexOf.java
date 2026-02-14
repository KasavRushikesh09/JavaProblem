


import java.util.Sca;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Your code here
        int n = scanner.nextInt();
        LinkedList<Integer>list = new LinkedList<>();
        for(int i =0;i<n;i++){
            list.add(scanner.nextInt());
        }

        int target = scanner.nextInt();
        int result = list.lastIndexOf(target);
        System.out.println(result);
    }
}