import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        // a: 1 ~ 99
        // b : 1 ~ 999999
        // pow를 사용하면 int형으로 벗어날 수 있는 범위를 벗어나서 다른 값을 출력하게
        // 된다.
        
        //테스트 케이스의 개수 입력
        int T = scanner.nextInt();
        
       
        int n = 1, a, b;
        for(int i = 0; i < T; i++) {
            
            //정수 a, b 입력
            a = scanner.nextInt();
            b = scanner.nextInt();
            n = 1;
            
            //끝자리만 생각한다.
            for(int k = 0; k < b; k++) {
                n = (n * a) % 10;
            }
            
            //0번인 컴퓨터는 없으므로, 10번
            if (n == 0) {
                n = 10;
            }
            
            //출력
            System.out.println(n);

        }
        scanner.close();
    }
}
