import java.util.*;

public class MaxAquaCurtains {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
            String s = sc.next();
            int n = sc.nextInt();
            int maxCount =0;
            //transver the string
        for(int i=0;i<s.length();i+=n){
            int count = 0;
            //count the current a
            for(int j=i;j<i+n&&j<s.length();j++){
                if(s.charAt(j) == 'a'){
                    count++;
                }
            }
            if(count>maxCount){
                maxCount= count;
            }
        }
        System.out.println(maxCount);
    }
}