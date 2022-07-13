import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[2];
        arr = makeArr(N);
        int cycleLength = 0;
        int OriginalFirstNumber = arr[0];
        int OriginalSecondNumber = arr[1];
        while(true) {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = (temp + arr[1]) % 10;
            cycleLength++;
            if(OriginalFirstNumber == arr[0] && OriginalSecondNumber == arr[1]) {
                break;
            }
        }
        System.out.print(cycleLength);
        scanner.close();
    }
    
    public static int[] makeArr(int N) {
        int[] arr = new int[2];
        if (N < 10) {
            arr[0] = 0;
            arr[1] = N;
            return arr;
        }
        arr[0] = N / 10;
        arr[1] = N % 10;
        return arr;
    }
}
