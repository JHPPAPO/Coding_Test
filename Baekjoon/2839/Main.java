import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int totalWeight = N; 
        int weight = N;
        boolean isExist = false;
        int count = -1;
        if (totalWeight % 3 == 0) {
            count = totalWeight / 3;
            isExist = true;
        }
        int count3 = 0;
        int count5 = 0;
        while(true) {
            if (weight % 5 == 0) {
                isExist = true;
                break;
            }
            if (weight <= 0) {
                isExist = false;
                break;
            }
            weight -= 3;
            count3 += 1;
        }
        if (weight % 5 == 0) {
            count5 = weight / 5;
        }
        if(isExist) {
            count = count3 + count5;
        }
        if (totalWeight % 5 == 0) {
            count = totalWeight / 5;
            isExist = true;
        }
        if(isExist) {
            System.out.print(count);
        } else {
            System.out.print(-1);
        }
        scanner.close();
    }
}
