import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String rev = "";
        for(int i=input.length()-1;i>=0;i--){
            rev = rev+ input.charAt(i);
        }
        if(input.equals(rev)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}