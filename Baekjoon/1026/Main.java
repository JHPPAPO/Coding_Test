import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
       
        int[] A = new int[N];
        int[] B = new int[N];
        
        for(int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        
        for(int i = 0; i < N; i++) {
            B[i] = scanner.nextInt();
        }
        
        Arrays.sort(A);
        reverseSort(B);
        
        
        int sum = 0;
        for(int i = 0; i < N; i++) {
            sum += (A[i] * B[i]);
        }
        
        System.out.print(sum);
        
        
    }
    
    
    public static void reverseSort(int [] arr) {
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }   
    }
}
