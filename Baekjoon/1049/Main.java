import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        int[] packageArr = new int[M];
        int[] oneStringArr = new int[M];
        
        for(int i = 0; i < M; i++) {
            packageArr[i] = scanner.nextInt();
            oneStringArr[i] = scanner.nextInt();
        }
        
        Arrays.sort(packageArr);
        Arrays.sort(oneStringArr);
        
        int numofPackage = (N / 6);
        int numofString = (N % 6);
        
        
        int minPrice = (packageArr[0] * numofPackage) + (oneStringArr[0] * numofString);
        
        
        
        numofPackage = (N / 6);
        
        if (N % 6 > 0) {
            numofPackage++;
        }
        
        numofString = N;
        
        
        
        
        int loopPrice = 0;
        for(int i = 0; i < M; i++) {
            
            if (packageArr[i] * numofPackage > oneStringArr[i] * numofString) {
                  loopPrice = oneStringArr[i] * numofString;
            } else {
                  loopPrice = packageArr[i] * numofPackage;
            }
            
            if(minPrice > loopPrice) {
                minPrice = loopPrice;
            }
        }
        
        System.out.print(minPrice);
        
    }
}
