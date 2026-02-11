import java.util.*;
public class PairSum {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int target = scan.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();

        }
        int left = 0;
        int right = n-1;
        boolean Found = false;
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                Found = true;
                break;
            }
            else if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }
        if(Found){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }



    }
}