import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int L = scanner.nextInt();
        int R = scanner.nextInt(); 
        
        int minEightNum = calEightMinNum(L, R);
        
        System.out.print(minEightNum);
        scanner.close();
    }
    
    public static int calEightMinNum(int L, int R) {   
        int min = calEightCount(L);
        int eightCount = min;
        for(int i = L + 1; i <= R; i++) {
            eightCount = calEightCount(i);
            if(eightCount < min) {
                min = eightCount;
            }
            if(min == 0) {
                return 0;
            }
        }
        return min;
    }
    
    public static int calEightCount(int num) {
        String str = Integer.toString(num);
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '8') {
                count++;
            }
        }
        return count;
    }
}
