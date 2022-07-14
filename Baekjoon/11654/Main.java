import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char c = str.charAt(0);
        int charInteger = (int) c;
        System.out.print(charInteger);
        scanner.close();
    }
}
