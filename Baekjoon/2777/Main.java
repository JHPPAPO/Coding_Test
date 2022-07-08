import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //테스트 케이스 입력
        int T = scanner.nextInt();
        int[] arr = new int[T];
        int minNum = 0;
        //입력
        for(int i = 0; i < T; i++) {
            arr[i] = scanner.nextInt();
            minNum = calMinCount(arr[i]);
            System.out.println(minNum);
        }
        //scanner 종료
        scanner.close();
    }
    
    public static int calMinCount(int num) {
        int[] numArr = {0,1,2,3,4,5,6,7,8,9};
        int[] numCountArr = {0,0,0,0,0,0,0,0,0,0};
        
        if(0 < num && num < 10) {
        	return 1;
        }
        
        for(int i = 9; i >= 2; i--) {
             while(true) {
                if(num % numArr[i] != 0) {
                    break;
                }
                 num /= numArr[i];
                 numCountArr[i]++;
             }
        }
        
        //다 나누었는데, num이 1이 아닐경우,
        if (num != 1) {
            return -1;
        }
        
        int sum = 0;
        for(int i = 2; i <= 9; i++) {
            sum += numCountArr[i];
        }
        return sum;
    }
}
