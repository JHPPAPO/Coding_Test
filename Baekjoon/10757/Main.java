import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger A = new BigInteger(scanner.next());
		BigInteger B = new BigInteger(scanner.next());
        System.out.print(A.add(B));
        scanner.close();
    }
}
