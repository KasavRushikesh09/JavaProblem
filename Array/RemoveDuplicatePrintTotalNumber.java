import java.util.*;
public class RemoveDuplicatePrintTotalNumber {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
//        HashSet<Integer>set = new HashSet<>();
//        int count=0;
//        for(int num:arr){
//            if(set.contains(num)){
//                set.remove(num);
//            }
//            else{
//
//                set.add(num);
//                count++;
//
//            }
//        }
//
//        System.out.print(count);


        int rd=1;
        int count = 1;
        for(int i=0;i<arr.length;i++){
            if(arr[rd] != arr[i]) {
                rd++;
                arr[rd] = arr[i];
                count++;
            }
        }
        System.out.println(count,"nums = ["+i);


    }
}