import java.util.*;
public class Main {

    static void NumberArray(int arr[]){
        int n = arr.length;
        HashSet<Integer>set = new HashSet<>();

        int missing = -1;
        int repeating = -1;
        for(int num: arr){
            if(set.contains(num)){
                repeating = num;
            }
            else{
                set.add(num);
            }
        }

        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                missing = i;
                break;
            }
        }
        System.out.println("["+repeating+", "+missing+"]");
    }
    public static void main(String[] args) {
        // Write your solution here
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        NumberArray(arr);
    }
}