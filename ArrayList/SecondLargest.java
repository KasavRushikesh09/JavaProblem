import  java.util.*;
public class SecondLargest{
    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>(
                Arrays.asList(10,30,40,20,89,79)
        );

        int Largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num: list){
            if(num > Largest){
                secondLargest = Largest;
                Largest       = num;
            }
            else if(num > secondLargest && num != Largest){
                secondLargest = num;
            }
        }
        if(secondLargest == Integer.MIN_VALUE){
            System.out.println("There is no second largest number");
        }
        else{
            System.out.println("The second largest number is :"+secondLargest);
        }
    }
}