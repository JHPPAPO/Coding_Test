import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        String[] strArr = new String[N];
        for(int i = 0; i < N; i++) {
            strArr[i] = scanner.next();
        }
        String answer = makeChangeStr(strArr);
        System.out.print(answer);
    }
    
    public static String makeChangeStr(String[] strArr) {
        String answer = strArr[0];
        int len = strArr.length;
        int strlen = answer.length();
        Set<Integer> idxset = new TreeSet<Integer>();
        for(int i = 0; i < len; i++) {
            for(int k = i + 1; k < len; k++) {
                for(int j = 0; j < strlen; j++) {
                    if (strArr[i].charAt(j) != strArr[k].charAt(j)) {
                         idxset.add(j);
                    }   
                }
            }
        }
        
        char[] charArr = new char[strlen];
        
        for(int i = 0; i < strlen; i++) {
            charArr[i] = answer.charAt(i);
        }
        
        
        Iterator<Integer> itr = idxset.iterator();
        while(itr.hasNext()) {
            charArr[itr.next()] = '?';
        }
        
        answer = String.valueOf(charArr);
        return answer;
    }
}
