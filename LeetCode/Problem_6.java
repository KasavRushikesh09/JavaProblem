import java.util.*;
public class Problem_6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int numRows = sc.nextInt();
        System.out.print(convert(s,numRows));
    }

    public static String convert(String s, int numRows){
        ArrayList<StringBuilder>list = new ArrayList<>();
        if(numRows == 1 || numRows >= s.length()){
            return s;
        }
        for(int k=0;k<numRows;k++){
            list.add(new StringBuilder());
        }
        int i=0;
        boolean isInc = true;

        while(i<s.length()){
            int j=0;
            //Down Direction
            while(isInc && j<numRows && i<s.length()){
                list.get(j).append(s.charAt(i));
                i++;
                j++;
            }
            //Up Direction

            j=numRows-2;
            while(!isInc && j>0 && i<s.length()){
                list.get(j).append(s.charAt(i));
                i++;
                j--;
            }
            isInc = !isInc;
        }
        String ans = "";
        for(StringBuilder str:list){
            ans = ans+str.toString();
        }
        return ans;
    }
}