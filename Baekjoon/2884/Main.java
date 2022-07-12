import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        
        if(M - 45 < 0) {
            H -= 1;
        }
        
        if(H == -1) {        //-1이라는 시간은 없으므로, 23
            H = 23;
        }
        
        M = M + 15;
        if(M > 59) {
            M = M - 60;
        }
        
        System.out.print(H + " " + M);
        scanner.close();
    }
}
