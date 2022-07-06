import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int minNum = calMinNum(A, B);
        int maxNum = calMaxNum(A, B);
        System.out.print(minNum + " " + maxNum);
    }
    
    public static int calMinNum(int A, int B) {
        return (changeFive(A) + changeFive(B));
    }
    
    public static int calMaxNum(int A, int B) {
        return (changeSix(A) + changeSix(B));
    }
    
    public static int changeFive(int num) {
        int NumberCount = calNumberCount(num);
        int[] arr = new int[NumberCount];
        
        for(int i = 0; i < NumberCount; i++) {
            arr[i] = num % 10;
            
            if(arr[i] == 6) {
                arr[i] = 5;
            }
            num /= 10;
        }
        
        int sum = 0;
        int n = 1;
        for(int i = 0; i < NumberCount; i++) {
            sum += (arr[i] * n);
            n *= 10;
        }
        return sum;
    }
    
    public static int changeSix(int num) {
        int NumberCount = calNumberCount(num);
        int[] arr = new int[NumberCount];
        
        for(int i = 0; i < NumberCount; i++) {
            arr[i] = num % 10;
            
            if(arr[i] == 5) {
                arr[i] = 6;
            }
            num /= 10;
        }
        
        int sum = 0;
        int n = 1;
        for(int i = 0; i < NumberCount; i++) {
            sum += (arr[i] * n);
            n *= 10;
        }
        return sum;
    }
    
    public static int calNumberCount(int num) {
        int count = 0;
        int n = 1;
        while(true) {
            if(n > num) {
                break;
            }
            n *= 10;
            count++;
        }
        return count;
    }
    
}
