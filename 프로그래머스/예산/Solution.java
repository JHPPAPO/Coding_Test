import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        //배열을 정렬시킨다.
        Arrays.sort(d);
        
        int len = d.length;
        
        int sum = 0;
        
        for(int i = 0; i < len; i++) {
            sum += d[i];
            if (sum <= budget) {
                answer++;    
            } else {
                break;       
            }
        }
        
        return answer;
    }
}
