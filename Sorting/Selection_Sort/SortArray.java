import java.util.*;
public class SortArray{

    static void SortArray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(j=i+1;j<n;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[j];
            arr[j] = temp;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int(n);
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        SortArray(arr);
        System.out.print(Arrays.toString(arr));
    }
}