import java.util.*;
public class MaxAquaCurtains{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = sc.nextInt();
        int count =0;
        for(int i=0;i<l;i++){
            if(s.charAt(i) == 'a'){
                count++;
            }
        }
        int maxCount = count;
        for(int i=l;i<s.length();i++){
            if(s.charAt(i-l) == 'a'){
                count--;
            }
            if(s.charAt(i) == 'a'){
                count++;
            }
            maxCount = Math.max(maxCount,count);
        }
        System.out.print(maxCount);
    }
}