import java.util.Scanner;

public class PalindromeString {
       public static void main(String[] args) {
        System.out.println("Enter the String to check the string is palindrome or not");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        if (Checker.doReverse(string).equals(string)) {
            System.out.println("The string is a palindrome string");
        }
        else {
            System.out.println("This is not a palindromic string");
        }
    }
}
