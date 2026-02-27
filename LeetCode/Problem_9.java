import java.util.*;
public class Problem_9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of nums1: ");
        int n1 = sc.nextInt();
        int nums1[] = new int[n1];
        System.out.println("Enter the nums1 element: ");

        for(int i=0;i<n1;i++){
            nums1[i] = sc.nextInt();
        }

        System.out.println("Size of nums2: ");
        int n2 = sc.nextInt();
        int nums2[] = new int[n2];
        System.out.println("Enter the nums2 element: ");

        for(int i=0;i<n2;i++){
            nums2[i] = sc.nextInt();
        }
        System.out.println("Numbers we have to take in nums1 : ");
        int m = sc.nextInt();
        System.out.println("Numbers we have to take in nums2 : ");

        int n = sc.nextInt();
        SortedArray(nums1, m, nums2, n);
    }

    public static void SortedArray(int nums1[], int m, int nums2[], int n){
        int i=m-1, j=n-1, k=m+n-1;

        while(i>=0 && j>=0){
            if(nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }
            else{
                nums1[k--] = nums2[j--];
            }
        }
        while(j>=0){
            nums1[k--] = nums2[j--];
        }
        for(int num:nums1){
            System.out.print(num+" ");
        }
    }
}