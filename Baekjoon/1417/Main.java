import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if(N == 1) {
            System.out.print(0);
            return;
        }
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        int dasomPeople = arr[0];        //다솜이를 지지하는 사람들의 수
        int neededPeople = 0;
        while(true) {
            int maxIdx = calMaxIdx(arr);
            if(dasomPeople > arr[maxIdx]) {
                break;
            }
            arr[maxIdx] -= 1;
            dasomPeople += 1;
            neededPeople += 1;
        }
        System.out.print(neededPeople);
        scanner.close();
    }
    
    public static int calMaxIdx(int[] arr) {
        int max = 0;
        int maxIdx = 0;
        for(int i = 1; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
                maxIdx = i;
            }
        }
        return maxIdx;
    }
}
