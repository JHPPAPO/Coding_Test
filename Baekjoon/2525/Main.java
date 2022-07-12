import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        int RequiredMinutes = scanner.nextInt();
        
        int hour = H + calHour(RequiredMinutes);
        int minute = M + calMinutes(RequiredMinutes);
        
        if(minute > 59) {
            hour += 1;
            minute -= 60;
        }
        
        if(hour > 23) {
            hour -= 24;
        }
        
        
        
        System.out.print(hour + " " + minute);
        scanner.close();
    }
    
    public static int calHour(int minute) {
        int hour = 0;
        while(true) {
            if(minute < 60) {
                break;
            }
            minute -= 60;
            hour++;
        }
        return hour;
    }
    
    public static int calMinutes(int minute) {
        return (minute % 60);
    }
}
