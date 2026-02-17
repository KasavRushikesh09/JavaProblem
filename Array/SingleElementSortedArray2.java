import java.util.*;
public class SingleElementSortedArray2 {
    static int SingleElement(int arr[]){
        int left = 0;
        int right = arr.length-1;

        while(left<right){
            int mid = (left+right)/2;

            if(mid%2 == 1){
                mid--;
            }
            if(arr[mid] == arr[mid+1]){
                left = mid+2;
            }
            else{
                right = mid;
            }
        }
        return arr[left];
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(SingleElement(arr));
    }
}