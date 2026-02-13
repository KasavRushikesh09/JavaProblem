import java.util.*;
public class RotateArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int k = sc.nextInt();
        List<Integer>list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        k = k%n;
        List<Integer>result = new ArrayList<>();
        result.addAll(list.subList(n-k,n));
        result.addAll(list.subList(0,n-k));
        for(int num: result){
            System.out.print(num+ " ");
        }
    }
}