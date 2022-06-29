import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        int num = scanner.nextInt();
        int min, max;
        
        min = num;
        max = num;
        
        for(int i = 1; i < N; i++) {
            num = scanner.nextInt();
            if(min > num) {
                min = num;
            }
            
            if (max < num) {
                max = num;
            }
            
        }
       
        System.out.print(min + " " + max);
    }
}
