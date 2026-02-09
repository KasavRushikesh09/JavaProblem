import java.util.*;
public class palindrome{
    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        String rev = "";

        for(int i=rev.length()-1;i>=0;i--){
            rev = rev+s.charAt(i);
        }

        if(s.equals(rev)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not Palindrome");
        }
    }
}