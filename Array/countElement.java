import java.util.*;
public class countElement{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
       }
        int target = scan.nextInt();
        Arrays.sort(arr);

       int i = 0;
       int j = arr.length-1;
       int count  = 0;
       while (i < j) {
           if(arr[i] + arr[j] == target){
               count++;
           }
           i++;
           j--;
       }

       System.out.print(count);




        }
    }