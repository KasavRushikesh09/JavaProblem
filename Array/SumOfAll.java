import java.util.*;
public class sumofall{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Numbers for Arrays: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("your Array is :");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        int res = 0;
        for (int i=0;i<n;i++){
            res +=arr[i];
        }
        System.out.println("Total Sum is : "+res);


    }
}