import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance = 2541 - 1998;
        int y = scanner.nextInt();
        System.out.print(y - distance);
        scanner.close();
    }
}
