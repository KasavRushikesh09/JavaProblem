import java.util.*;
public class Count{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");

        String s = sc.nextLine();
        int v= 0;
        int c =0;

        for(char ch : s.toCharArray()){
            if("aeiuoAEIUO".indexOf(ch) != -1){
                v++;
            }
            else if(Character.isLetter(ch)){
                c++;
            }
        }
        System.out.println("Vovels: "+v+" "+"Consonants: "+c );
    }
}