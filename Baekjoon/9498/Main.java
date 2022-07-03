import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int Score = scanner.nextInt(); 
        
        char grade = calGrade(Score);
        System.out.print(grade);
        scanner.close();
    }
    
    
    public static char calGrade(int score) {
        
        char grade;
        
        if(90 <= score && score <= 100) {
            grade = 'A';
        } else if (80 <= score && score <= 89) {
            grade = 'B';
        } else if (70 <= score && score <= 79) {
            grade = 'C';
        } else if (60 <= score && score <= 69) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        return grade;
    }
    
    
}
