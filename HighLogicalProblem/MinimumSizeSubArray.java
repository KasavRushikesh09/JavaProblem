import java.util.*;
public class Minimum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int minLength = n+1;
        int sum = 0;

        for(int right=0;right<n;right++){
            sum = sum+arr[right];
            while(sum >=s){
                minLength = Math.min(minLength,right-left+1);
                sum = sum-arr[left];
                left++;
            }
        }
        if(minLength == n-1){
            System.out.println(0);
        }
        else{
            System.out.println(minLength);
        }
    }
}