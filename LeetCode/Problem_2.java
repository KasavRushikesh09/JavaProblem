import java.util.*;
public class Problem_2 {


    public static void IntToRoman(int num) {
        LinkedHashMap<Integer, String> hash = new LinkedHashMap<>();
        hash.put(1000, "M");
        hash.put(900, "CM");
        hash.put(500, "D");
        hash.put(400, "CD");
        hash.put(100, "C");
        hash.put(90, "XC");
        hash.put(50, "L");
        hash.put(40, "XL");
        hash.put(10, "X");
        hash.put(9, "IX");
        hash.put(5, "V");
        hash.put(4, "IV");
        hash.put(1, "I");

        StringBuilder result = new StringBuilder();

        for(int key:hash.keySet()){
            while(num>= key){
                result.append(hash.get(key));
                num -= key;
            }
        }
        System.out.print(result.toString());
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        IntToRoman(num);
    }
}