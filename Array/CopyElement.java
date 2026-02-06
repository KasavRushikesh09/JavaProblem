import java.util.*;
public class CompyElemenet{
    public static void main(String args[]){
        int arr1[] = {2,4,3,5,7,5,8,7};
        int arr2[] = new int[arr1.length];

        for(int i=0;i<arr1.length;i++){
            arr2[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }
}