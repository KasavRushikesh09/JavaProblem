import java.util.*;
public class Main {

    static int MinimumArray(int arr[]){
        int left = 0;
        int right = arr.length-1;

        while(left<right){
            int mid = (left+right)/2;
            if(arr[mid] > arr[right]){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
        return arr[left];
    }
    public static void main(String[] args) {
        // Write your solution here
        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(MinimumArray(arr));
    }
}