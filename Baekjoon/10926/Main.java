import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        str = str + "??!";
        System.out.print(str);
        scanner.close();
    }
}
