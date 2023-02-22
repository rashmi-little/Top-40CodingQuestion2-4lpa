import java.util.Scanner;

public class OccuranceOfChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string ");
        String string = scanner.nextLine();
        System.out.println("Enter the character you want to search for");
        char ch = scanner.nextLine().charAt(0);
        int size = string.length();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (string.charAt(i) == ch) {
                count++;
            }
        }

        System.out.println("The number of occurance of the given character in the string is " + count);
    }
}
