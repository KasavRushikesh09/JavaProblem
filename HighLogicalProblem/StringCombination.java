import java.util.*;;
public class StringCombination{
    static void combinations(String s,int k, int index, String current){
        if(current.length() == k){
            System.out.println(current+" ");
            return;
        }
        for(int i=index;i<s.length();i++){
            combinations(s,k,i+1,current+s.charAt(i));
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        combinations(s,k,0,"");
    }
}