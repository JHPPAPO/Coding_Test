import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] xArr = new int[n];
        int[] yArr = new int[n];
        
        for(int i = 0; i < n; i++) {
            xArr[i] = scanner.nextInt();
            yArr[i] = scanner.nextInt();
        }
        int[] areaArr = calAreaArr(xArr, yArr);
        for(int i = 0; i < 4; i++) {
            System.out.println("Q" + (i + 1) + ": " + areaArr[i]);
        }
        System.out.println("AXIS: " + areaArr[4]);
        scanner.close();
    }
    
    public static int[] calAreaArr(int[] xArr, int[] yArr) {
        int[] areaArr = {0,0,0,0,0};
        for(int i = 0; i < xArr.length; i++) {
            if(xArr[i] > 0 && yArr[i] > 0) {
                areaArr[0]++; 
            } else if(xArr[i] < 0 && yArr[i] > 0) {
                areaArr[1]++; 
            } else if(xArr[i] < 0 && yArr[i] < 0) {
                areaArr[2]++; 
            } else if(xArr[i] > 0 && yArr[i] < 0) {
                areaArr[3]++; 
            } else {
                areaArr[4]++; 
            }
        }
        return areaArr;
    }
}
