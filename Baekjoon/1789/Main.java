import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long S = scanner.nextLong();
        long max = calMaxNumCount(S);
        System.out.print(max);
    }
    
    public static long calMaxNumCount(long S) {
        long count = 0;
        long sum = 0;
        for(long i = 1; i <= S; i++) {
            sum += i;
            count++;
            if (S - sum <= i) {            //숫자가 겹친다는 의미
                break;
            }
        }
        return count;
    }
}
