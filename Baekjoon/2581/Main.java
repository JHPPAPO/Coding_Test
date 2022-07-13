import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();        //M 입력
        int N = scanner.nextInt();        //N 입력
        int sum = 0;
        int min = 987654321;
        boolean primeExist = false;
        for(int i = M; i <= N; i++) {
            if(isPrime(i)) {                     //소수라면
               sum += i;                         //합을 구하고
               if(min > i) {                     //최솟값이 i보다 더 작다면
                   min = i;
               }
               primeExist = true;
            }
        }
        if(primeExist) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }
        scanner.close();
    }
    
    public static boolean isPrime(int num) {
        if(num == 1) {
            return false;
        }
        
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
