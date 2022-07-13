import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int sameCount = calSameCount(arr);
        int price = 0;
        if(sameCount == 0) {        //모두 다른 눈
            int maxNumber = calMaxNumber(arr);
            price = maxNumber * 100;
        } else if (sameCount == 1) {    //같은 눈 2개
            int sameNumber = calSameNumber(arr);
            price = (sameNumber * 100) + 1000;
        } else if (sameCount == 3) {    //같은 눈 3개
            int sameNumber = calSameNumber(arr);
            price = (sameNumber * 1000) + 10000;
        }
        
        System.out.print(price);
        
        scanner.close();
    }
    
    
    public static int calSameCount(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int k = i + 1; k < arr.length; k++) {
                if(arr[i] == arr[k]) {
                    count++;
                }
            }
        }
        return count;
    }
    
    public static int calMaxNumber(int[] arr) {
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    
    public static int calSameNumber(int[] arr) {
        int SameNumber = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int k = i + 1; k < arr.length; k++) {
                if(arr[i] == arr[k]) {
                    SameNumber = arr[i];
                }
            }
        }
        return SameNumber;
    }
    
    
}
