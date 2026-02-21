import java.util.*;
public class CircularSeatingArrangement{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
            int n = sc.nextInt();
            long answer = 2*fact(n);

            System.out.println(answer);
        }

    static int fact(int n){
           int fact =1;
           for(int i=1;i<n;i++){
               fact *= i;
           }
           return fact;
    }
}