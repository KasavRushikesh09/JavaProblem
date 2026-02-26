import java.util.*;
public class Problem_8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = "1101";

        int steps =0;
        int carry = 0;

        for(int i=s.length()-1;i>0;i--){
            int bit = s.charAt(i)-'0'+carry;

            if(bit == 1){
                //odd
                steps+=2;
                carry = 1;
            }
            else{
                steps+=1;
            }
        }
        System.out.print(steps+carry);
    }
}