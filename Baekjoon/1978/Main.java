import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numOfData = sc.nextInt();
        
        int count = 0;
        for(int i = 0; i < numOfData; i++) {
            int num = sc.nextInt();
            
            if(judgeNum(num)) {        //소수라면
                count++;
            }
        }
        
        System.out.print(count);
        
    }
    
    
    
    public static boolean judgeNum(int num) {
        int n = 1;
        int count = 0;
        
        while(true) {
            if (n == num) {
                count++;
                break;
            }
            
            if (num % n == 0) {
                count++;
            }
            
            n++;
        }
        
        if (count == 2) {
            return true;
        } else {
            return false;
        }
        
    }
}
