import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int k = 0; k < T; k++) {
            int len = scanner.nextInt();
            int arr[] = new int[len];
            for(int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();			//배열 입력
            }
            Arrays.sort(arr);						//오름차순 정렬
            int evenLen = len / 2;
            int oddLen = len / 2;
            if(len % 2 == 1) {
            	evenLen += 1;
            }
            int evenArr[] = new int[evenLen];
            int oddArr[] = new int[oddLen];
            int idx = 0;
            for(int i = 0; i < arr.length; i+=2) {
                if (idx >= evenLen) {
                    break;
                }
                evenArr[idx++] = arr[i];
            }
            Arrays.sort(evenArr);
            
            idx = 0;
            for(int i = 1; i < arr.length; i+=2) {
                if (idx >= oddLen) {
                    break;
                }
                oddArr[idx++] = arr[i];
            }
            Integer oddArr2[] = Arrays.stream(oddArr).boxed().toArray(Integer[]::new);
            Arrays.sort(oddArr2, Collections.reverseOrder());
            int midSortArr[] = new int[len];
            int distanceArr[] = new int[len];
            for(int i = 0; i < evenArr.length; i++) {
                midSortArr[i] = evenArr[i];
            }
            for(int i = 0; i < oddArr2.length; i++) {
                midSortArr[evenArr.length + i] = oddArr2[i];
            } 
            
            distanceArr[0] = midSortArr[distanceArr.length - 1] - midSortArr[0];
            for(int i = 1; i < distanceArr.length; i++) {
                distanceArr[i] = Math.abs(midSortArr[i - 1] - midSortArr[i]);
            }
            int max = 0;
            for(int i = 0; i < distanceArr.length; i++) {
                if(max < distanceArr[i]) {
                    max = distanceArr[i];
                }
            }
            System.out.println(max);
        }
        scanner.close();
    }
}
