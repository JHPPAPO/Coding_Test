import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        
        //에라토스테네스의 체
        boolean prime[] = new boolean[N + 1];        //배열 생성
        //배열 초기화
        for(int i = 0; i < prime.length; i++) {
            prime[i] = false;
        }
        //소수 false, 소수가 아닌 숫자 true
        prime[0] = prime[1] = true;
        for(int i = 2; i*i <= N; i++) {
            if(!prime[i]) {
                for(int j = i*i; j <= N; j+=i) {
                    prime[j] = true;
                }
            }
        }
        for(int i = M; i <= N; i++) {
            if (!prime[i]) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
