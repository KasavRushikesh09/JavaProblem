import java.util.Scanner;
import java.util.*;
class Main {
    static void SumArray(int array[],int n){
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=array[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        // Your code here
        SumArray(array,n);
    }
}