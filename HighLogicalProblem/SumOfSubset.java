import java.util.*;
public class Subset{

    static void Subset(int arr[],int index,List<Integer>current,int currentSum,int target){

        if(currentSum == target){
            for(int num : current){
                System.out.print(num+" ");
            }
            System.out.println();
            return;
        }

        if(currentSum> target || index == arr.length){
            return;
        }

        current.add(arr[index]);
        Subset(arr,index+1,current,currentSum+arr[index],target);

        current.remove(current.size()-1);
        Subset(arr,index+1,current, currentSum,target);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int x= sc.nextInt();
        Arrays.sort(arr);
        Subset(arr,0,new ArrayList<>(),0,x);
    }
}