public class CountPositiveNegetiveZero{
    public static void main(String args[]){
        int arr[] = {0,1,2,3,-1,-4,7,0,-3};

        int Negative = 0;
        int Positive = 0;
        int Zeros = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] < 0){
                Negative++;
            }
            else if(arr[i] == 0) {
                Zeros++;
            }
            else{
                Positive++;
            }
        }
        System.out.println("Positives value: "+Positive);
        System.out.println("Negative value: "+Negative);
        System.out.println("Zeros value: "+Zeros);
    }
}