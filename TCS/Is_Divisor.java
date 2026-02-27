import java.util.*;
public class Is_Divisor {

    public static boolean isDivisors(int num, int i){
        boolean isDiv = false;
            return num%i == 0;

    }
    public static boolean perfectNumber(int num, int sum){
        boolean isPerfect = false;
            return num == sum;
    }

    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        int num = 28;
        int sum = 0;
        for(int i=1;i<=num/2;i++){
            if(isDivisors(num,i)){
//                System.out.print(i+" ");
                sum= sum+i;
            }
        }
        if(perfectNumber(num,sum)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }



    }
}