import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        int len = completion.length;
        
        int i;
        for(i = 0; i < len; i++) {
            if(!participant[i].equals(completion[i])) {
                break;
            }
        }
        answer = participant[i];
        
        
        
        
        
        return answer;
    }
}
