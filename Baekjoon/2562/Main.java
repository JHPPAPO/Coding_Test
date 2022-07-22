import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[9];
        int max = -1;
        int maxIdx = -1;
        for(int i = 0; i < 9; i++) {
            arr[i] = scanner.nextInt();
            if(max < arr[i]) {
                max = arr[i];
                maxIdx = i;
            }
        }
        System.out.println(max);
        System.out.println(maxIdx + 1);
        scanner.close();
    }
}
