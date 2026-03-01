import java.util.*;
public class Problem_1 {

    public static void RomanToInteger(String s){
        HashMap<Character,Integer> hash = new HashMap<>();
        hash.put('I',1);
        hash.put('V',5);
        hash.put('X',10);
        hash.put('L',50);
        hash.put('C',100);
        hash.put('D',500);
        hash.put('M',1000);

        int total = 0;
        for(int i=0;i<s.length();i++){
            int current = hash.get(s.charAt(i));

            if(i<s.length()-1 && current<hash.get(s.charAt(i+1))){
                total = total - current;
            }
            else{
                total = total + current;
            }
        }
        System.out.print(total);
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        RomanToInteger(s);

    }
}