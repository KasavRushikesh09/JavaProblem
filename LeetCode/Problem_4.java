import java.util.*;
public class Problem_4{

    static float median(int arr1[],int arr2[]){
        int i=0, j=0, k=0;
        int m[] = new int[arr1.length+arr2.length];

        while(i<arr1.length && j<arr2.length && k<m.length){
            if(arr1[i]<arr2[j]){
                m[k] = arr1[i];
                k++;
                i++;
            }
            else{
                m[k] = arr2[j];
                k++;
                j++;
            }
        }
        while(i<arr1.length){
            m[k] = arr1[i];
            k++;
            i++;
        }
        while(j<arr2.length){
            m[k] = arr2[j];
            k++;
            j++;
        }
        int n = m.length;
        if(n%2 == 0){
            int mid = n/2;
            return (float)(m[mid]+m[mid-1])/2;
        }
        else{
            return m[n/2];
        }
    }
    public static void main(String args[]){
        int arr1[] = {1,3,8,17};
        int arr2[] = {5,6,7,19,21,25};

        System.out.println("Median = "+median(arr1,arr2));

    }
}