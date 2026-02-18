import java.util.*;
public class SearchInsertPosition {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }

        int target = scan.nextInt();

        int left =0;
        int right = arr.length-1;

        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid] == target){
                System.out.println(mid);
                return;
            }
            else if(target<arr[mid]){
                right = mid-1;
            }
            else{
                left=mid+1;
            }

        }
        System.out.println(left);

    }
}