import java.util.*;
public class Program_7{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int x =-123;
        int lastEle;
        while(x>0){

            lastEle = x%10;
            System.out.print(lastEle);
            x = x/10;

        }
    }
}