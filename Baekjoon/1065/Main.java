import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        int count = 0;
        for(int i = 1; i <= N; i++) {
            if(isHanSu(i)) {
                count++;
            }
        }
        
        
        System.out.print(count);
    }
    
    
    public static boolean isHanSu(int N) {
        int[] NumArr = makeNumArr(N);
        int len = NumArr.length;
        
        
        int[] distanceArr = new int[len - 1];    
        
        if (len == 1) {
            return true;
        }
        
        
        //각 수의 거리를 계산
        for(int i = 1; i < len; i++) {
            distanceArr[i - 1] = NumArr[i - 1] - NumArr[i];
        }
        
        boolean result = true;
        
        for(int i = 1; i < distanceArr.length; i++) {
            if (distanceArr[i - 1] != distanceArr[i]) {
                result = false;
            }
        }
        return result;
    }
    
    public static int[] makeNumArr(int N) {
        int num = 1;
        
        int NumCount = 0;
        while(true) {
            if (num > N) {
                break;
            }
            num *= 10;
            NumCount++;
        }
        
       
        //각 자리의 수를 넣을 배열
        int[] NumArr = new int[NumCount];
        
        
        for(int i = 0; i < NumCount; i++ ) {
            NumArr[i] = N % 10;
            N /= 10;
        }
        
        
        
        
        
        return NumArr;
        
    }
    
}
