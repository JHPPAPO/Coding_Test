import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        
        int num = A * B * C;
        int[] arr = makeArr(num);
        
        for(int n : arr) {
            System.out.println(n);
        }
        
    }
    
    public static int[] makeArr(int num) {
        int[] arr = {0,0,0,0,0,0,0,0,0,0};
        while(true) {
            if (num <= 0) {
                break;
            }
            arr[num % 10]++;
            num /= 10;
        }
        return arr;
    }
}
