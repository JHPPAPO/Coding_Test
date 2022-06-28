import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int[] NumArr = makeNumArr(num2);
        
        int num3 = num1 * NumArr[0];
        int num4 = num1 * NumArr[1];
        int num5 = num1 * NumArr[2];
        
        
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        
        int result = num3 + (num4 * 10) + (num5 * 100);
        
        System.out.println(result);
        
    }
    
    public static int[] makeNumArr(int num2) {
      int n = num2;
      int[] NumArr = new int[3];
      for(int i = 0; i < NumArr.length; i++) {
          NumArr[i] = num2 % 10;
          num2 /= 10;
      }
      return NumArr;
    }
}
