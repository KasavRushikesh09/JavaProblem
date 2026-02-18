import java.util.*;
public class TwoSum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        int count =0;
        while(i<j){

            if(arr[i]+arr[j] == target){
                count++;
                i++;
                j--;
            }
            else if(arr[i]+arr[j]<target){
                i++;
            }
            else{
                j--;
            }

        }
        System.out.println(count);
    }
}