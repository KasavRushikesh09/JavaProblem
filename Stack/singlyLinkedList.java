import java.util.*;
public class singlyLinkedList {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i] = sc.nextInt();
        }

        for(int i=arr1.length;i>=0;i--){
            for(int j=arr2.length;j>=0;j--){
                int res = arr1[i]+arr2[j];
                if(res >9){
                    arr1[i+1]+arr2[j+1]+1;
                }
                System.out.print(res);
            }
        }

    }
}