import java.util.*;
public class SingleElementInSortedArray {

    static void SingleElement(ArrayList<Integer>list){
        HashSet<Integer>set = new HashSet<>();
        for(int num:list){
            if(set.contains(num)){
                set.remove(num);
            }
            else{
                set.add(num);
            }
        }
        for(int num:set){
            System.out.println("Single element is : "+num);
        }
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(scan.nextInt());
        }
        SingleElement(list);
    }
}