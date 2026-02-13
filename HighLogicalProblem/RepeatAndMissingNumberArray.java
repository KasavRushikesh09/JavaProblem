import java.util.*;
public class RepeatMissing{

    static void RepeatMissing(int arr[]){

        HashSet<Integer> set = new HashSet<>();
        int repeating = -1;
        int missing = -1;
        for(int num:arr){
            if(set.contains(num)){
                repeating = num;
            }
            else{
                set.add(num);
            }
        }
        for(int i=1;i<=arr.length;i++){
            if(!set.contains(i)){
                missing =i;
                break;
            }
        }
        System.out.println("["+repeating+", "+missing+"]");

    }
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        RepeatMissing(arr);
    }
}