import java.util.*;
public class StringPermutation{

    static void Permutations(char arr[],int fi){
        if(fi == arr.length-1){
            System.out.println(arr);
            return;
        }
        Set<Character> used = new HashSet<>();
        for(int i=fi;i<arr.length;i++){

            if(used.contains(arr[i])) continue;
            used.add(arr[i]);
            swap(arr,i,fi);
            Permutations(arr,fi+1);
            swap(arr,i,fi);
        }
    }
    static void swap(char[]arr,int i ,int fi){
        char temp = arr[i];
        arr[i] = arr[fi];
        arr[fi] = temp;
    }


    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = scan.next();
        Permutations(s.toCharArray(),0);
    }
}