import java.util.*;
public class Remove{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        String result = "";

        for(int i=0;i<=s.length()-1;i++){
            if(result.indexOf(s.charAt(i)) == -1){
                result = result + s.charAt(i);
            }
        }
        System.out.println(result);
    }
}