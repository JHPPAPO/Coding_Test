class Solution {
    public int solution(int num) {
        int answer = 0;
        
        if (num == 1) {
            return answer;
        }
        
        
        while(true) {
            
            if(num == 1) {
                break;
            }
            
            if(answer == 500) {
                answer = -1;
                return answer;
            }
            
            if(num % 2 == 1) {
                num = (num * 3) + 1;
            } else if(num % 2 == 0) {
                num = num / 2;
            }
            
            
            

            answer++;
        }
        
        
        
        return answer;
    }
}
