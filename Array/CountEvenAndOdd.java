import java.util.*;

public class CountEvenOdd{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elemnts: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        int even = 0;
        int odd = 0;
        for(int i=0;i<n;i++){
            if(arr[i]%2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even number is: "+even);
        System.out.println("Odd number is: "+odd);
        sc.close();
    }
}