
import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class FindIntersectionPoint {
    static Node build(int arr[]){
        Node head = new Node(arr[0]);
        Node temp = head;

        for(int i=1;i<arr.length;i++){
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }
    static void connect(Node head1, Node head2, int pos){
        if(pos == -1){
            return;
        }
        Node temp1 = head1;
        for(int i=0;i<pos;i++){
            temp1 = temp1.next;
        }
        Node temp2 = head2;
        while(temp2.next != null){
            temp2 = temp2.next;
        }
        temp2.next = temp1;
    }
    public static Node findIntersection(Node head1,Node head2){
        HashSet<Node> set = new HashSet<>();
        while(head1 != null){
            set.add(head1);
            head1 = head1.next;
        }

        while(head2 != null){
            if(set.contains(head2)){
                return head2;
            }
            head2 = head2.next;
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n1 = sc.nextInt();
        int arr1[] = new int [n1];
        for(int i=0;i<n1;i++){
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i] = sc.nextInt();
        }
        int pos = sc.nextInt();

        Node head1 = build(arr1);
        Node head2 = build(arr2);

        connect(head1,head2,pos);
        Node ans = findIntersection(head1,head2);

        if(ans != null){
            System.out.println(ans.data);
        }
        else{
            System.out.println("Null");
        }

    }

}