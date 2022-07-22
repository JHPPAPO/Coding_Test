import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[7];
        
        for(int i = 0; i < 7; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = 987654321;
        int sum = 0;
        boolean isExist = false;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                sum += arr[i];
                isExist = true;
                if (min > arr[i]) {
                    min = arr[i];
                }
            }
        }
        
        if (isExist) {
            System.out.println(sum);
            System.out.print(min);
        } else {
            System.out.print(-1);
        }
        scanner.close();
    }
}
