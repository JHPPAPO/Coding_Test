import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        String[] strArr = new String[T];
        for(int i = 0; i < T; i++) {
            strArr[i] = scanner.next();
            System.out.println(calScore(strArr[i]));
        }
        scanner.close();
    }
    public static int calScore(String str) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'O') {
                count++;
                sum += count;
            } else {
                count = 0;
            }
        }
        return sum;
    }
}
