import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] arr = new int[M];
        
        for(int i = 0; i < M; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int[] answer = calMaxPrice(arr, N);
        
        System.out.print(answer[0] + " " + answer[1]);
        scanner.close();
    }
    //최대이익을 낼 수 있는 달걀의 가격을 출력하는 메소드
    public static int[] calMaxPrice(int[] arr, int N) {
        int maxEggPrice = 0;
        int maxTotalPrice = 0;    
        int BuyPeople = 0;
        int TotalPrice = 0;
        for(int i = 0; i < arr.length; i++) {
            BuyPeople = calBuyPeople(arr, arr[i]);
            
            if (BuyPeople > N) {
                BuyPeople = N;
            }
            
            TotalPrice = BuyPeople * arr[i];
         
            if(maxTotalPrice < TotalPrice) {
                maxEggPrice = arr[i];
                maxTotalPrice = TotalPrice;
            }
        }   
        int[] answer = {maxEggPrice, maxTotalPrice};
        return answer;
    }
    //달걀의 가격으로 살 수 있는 사람들을 계산해주는 메소드
    public static int calBuyPeople(int[] arr, int eggPrice) {
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] >= eggPrice) {
                count++;
            }
        }
        return count;
    }
}
