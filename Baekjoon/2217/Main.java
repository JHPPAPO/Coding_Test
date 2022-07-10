import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] RopeArr = new int[N];
        //로프가 버틸 수 있는 최대 중량 입력
        for(int i = 0; i < N; i++) {
           RopeArr[i] = scanner.nextInt();
        }
        Arrays.sort(RopeArr);
        int MaxWeight = calMaxWeight(RopeArr);
        System.out.print(MaxWeight);
        scanner.close();
    }
    
    public static int calMaxWeight(int[] RopeArr) {
        int numofRope = RopeArr.length;
        int max = 0;
        for(int i = 0; i < RopeArr.length; i++) {
            int weight = RopeArr[i] * (numofRope - i);
            if (max < weight) {
                max = weight;
            }
        }
        return max;
    }
}
