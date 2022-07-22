import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int T = scanner.nextInt();
        for(int i = 0; i < T; i++) {
            int arr[] = new int[10];
            for(int k = 0; k < arr.length; k++) {
                arr[k] = scanner.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[arr.length - 3]);
        }
        scanner.close();
    }
}
