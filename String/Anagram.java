import java.util.*;
public class Anagram{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the string 1: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the string 2: ");
        String s2 = sc.nextLine();

        char[]a = s1.toCharArray();
        char[]b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

//        System.out.println(Arrays.equals(a,b));

        if(Arrays.equals(a,b) == true){
            System.out.println("Both string is Anagram");
        }
        else{
            System.out.println("Both string is not Anagram");
        }
    }
}