public class ReverseArray{
    public static void main(String args[]){
        int arr[] = {10,50,39,49,60};
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}