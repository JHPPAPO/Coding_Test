import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int n = 0;
        int sum = 0;
        int endNum = 0;
        int beforeSum = 0;
        while(true) {
            if(sum >= X) {
                endNum = n;
                beforeSum = sum - n;
                break;
            }
            n += 1;
            sum += n;
        }
        int distance = X - beforeSum;
        int start = 1;
        int end = endNum;
        for(int i = 1; i < distance; i++) {
            start += 1;
            end -= 1;
        }
        if (endNum % 2 == 1) {
            System.out.print(end + "/" + start);
        } else {
            System.out.print(start + "/" + end);
        }
        scanner.close();
    }
}
