import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        System.out.println("Enter a string to reverse it");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(Checker.doReverse(string));
        
    }
}
class Checker {
    public static String doReverse(String str) {
        String result = "";
        int size = str.length() -1;
       for (int i = size; i >= 0; i--) {
         result += str.charAt(i);
       }
       return result;
    }
}
