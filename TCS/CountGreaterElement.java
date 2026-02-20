import java.util.*;
public class CountGreaterElement{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count =1;
        int current =arr[0];
        for(int i=1;i<n;i++){
            if(current <arr[i]) {
                count++;
                current = arr[i];
            }
        }
        System.out.print(count);
    }
}