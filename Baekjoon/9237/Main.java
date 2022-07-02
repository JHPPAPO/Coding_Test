import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        int[] arr = new int[N];
        
        for(int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();    
        }
        
        Arrays.sort(arr);
        reverseSort(arr);
        
        int max = -1;
        for(int i = 0; i < N; i++) {
            if(max < i + 1 + arr[i]) {
                max = i + 1 + arr[i];
            }
        }
        
        System.out.print(max + 1);
    }
    
    public static void reverseSort(int[] arr) {
        int temp;
        for(int i = 0; i < (arr.length) / 2; i++) {
            temp = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = temp;
        }
    }
    
    
}
