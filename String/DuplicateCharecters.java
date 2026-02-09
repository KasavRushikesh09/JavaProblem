import java.util.*;
public class Duplicate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");

        String s = sc.nextLine();
        int [] freq = new int[256];
        for(char ch : s.toCharArray()){
            freq[ch]++;
        }

        for(int i=0;i<256;i++){
            if(freq[i] >1){
                System.out.println((char)i+" : "+freq[i]);
            }
        }

    }
}