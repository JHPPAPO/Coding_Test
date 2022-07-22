import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        String answer;
        if (A > B) {
            answer = ">";
        } else if (A < B) {
            answer = "<";
        } else {
            answer = "==";
        }
        System.out.print(answer);
    }
}
