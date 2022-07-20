import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); scanner.nextLine();
        int arr[] = new int[T];         //배열선언
        for(int i = 0; i < T; i++) {    //배열삽입
            arr[i] = scanner.nextInt(); scanner.nextLine();
        }
        //에라토스테네스의 체
        boolean prime[] = new boolean[10001];        //배열 생성
        //배열 초기화
        for(int i = 0; i < prime.length; i++) {
            prime[i] = false;
        }
        //소수 false, 소수가 아닌 숫자 true
        prime[0] = prime[1] = true;
        for(int i = 2; i*i <= 10000; i++) {
            if(!prime[i]) {
                for(int j = i*i; j <= 10000; j+=i) {
                    prime[j] = true;
                }
            }
        }
        int startNum = 2;
        int minDistance = 987654321;
        int firstPrime = 0;
        int secondPrime = 0;
        for(int i = 0; i < arr.length; i++) {
            while(true) {
                if(startNum == arr[i]) {
                    break;
                }
                int rest = arr[i] - startNum;
                if (!prime[startNum] && !prime[rest]) {
                    int distance = Math.abs(rest - startNum);
                    if (minDistance > distance) {
                        minDistance = distance;
                        firstPrime = startNum;
                        secondPrime = rest;
                    }
                }
                startNum++;
            }
            if (firstPrime > secondPrime) {
                System.out.println(secondPrime + " " + firstPrime);
            } else {
                System.out.println(firstPrime + " " + secondPrime);
            }
            startNum = 2;
            minDistance = 987654321;
        }
        scanner.close();
    }
}
