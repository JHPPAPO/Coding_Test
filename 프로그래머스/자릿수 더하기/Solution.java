import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int N  	   = n;
        
        while(true) {
        	if (N / 10 == 0) {
        		answer += (N % 10);
        		break;
        	}
        	
        	answer += (N % 10);
        	N /= 10;
        }

        return answer;
    }
}
