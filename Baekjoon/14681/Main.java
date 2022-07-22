import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int areaNumber = calAreaNumber(X, Y);
        System.out.print(areaNumber);
        scanner.close();
    }
    public static int calAreaNumber(int X, int Y) {
        int result = 0;
        if (X > 0 && Y > 0) {
            result = 1;
        } else if (X < 0 && Y > 0) {
            result = 2;
        } else if (X < 0 && Y < 0) {
            result = 3;
        } else if (X > 0 && Y < 0) {
            result = 4;
        }
        return result;
    }
}
