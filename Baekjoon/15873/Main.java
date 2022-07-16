import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        int A = N / 10;
        int B = N % 100;
        
        if(A > 10) {
            A /= 10;
        }
        if (B > 10) {
            B = N % 10;
        }
        System.out.print(A + B);
        scanner.close();
    }
}
