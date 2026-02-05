public class SecondLargest{
    public static void main(String args[]){
        int arr[] = {10,80,90,55,37};
        int largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                SecondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > SecondLargest && arr[i] != largest){
                SecondLargest = arr[i];
            }
        }
        System.out.println(SecondLargest);
    }
}