import java.util.*;
public class NextGreaterElemnet {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int arr[] = new int[n];

        int i=0;
        while(i<n){
            arr[i] = sc.nextInt();
            i++;
        }
        i=0;

        while(i<n){
            int j = i+1;
            int next = -1;

            while(j<n){
                if(arr[j]>arr[i]) {
                    next = arr[j];
                    break;
                }
                j++;
            }
            System.out.print(next+" ");
            i++;
        }

    }
}