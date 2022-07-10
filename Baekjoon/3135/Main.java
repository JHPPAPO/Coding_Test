import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Start = scanner.nextInt();                //시작 주파수
        int End = scanner.nextInt();                  //끝 주파수
        int numofButtons = scanner.nextInt();         //버튼의 수 입력
        int[] buttonArr = new int[numofButtons];        //버튼 배열 동적할당
        
        //누르면 이동할 수 있는 주파수를 입력.
        for(int i = 0; i < numofButtons; i++) {
            buttonArr[i] = scanner.nextInt();
        }
        
        int minPressButton = calMinPressButton(Start, End, buttonArr);
        System.out.print(minPressButton);
        scanner.close();
    }
    
    public static int calMinPressButton(int Start, int End, int[] buttonArr) {
        int PressButtonNum = 0;
        //첫 시작 버튼에서 시작할 경우
        boolean isStart = true;
        int minDistance = Math.abs(End - Start);
        
        for(int i = 0; i < buttonArr.length; i++) {
            if(minDistance > Math.abs(End - buttonArr[i])) {
                minDistance = Math.abs(End - buttonArr[i]);
                isStart = false;
            }
        }
        
        if (isStart) {
           PressButtonNum = minDistance;
        } else {
           PressButtonNum = minDistance + 1;
        }
        return PressButtonNum;
    }
}
