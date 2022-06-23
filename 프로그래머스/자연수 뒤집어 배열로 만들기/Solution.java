class Solution {
    public long[] solution(long n) {
        long[] answer = {};
        
        int count = calNumberCount(n);
        
        answer = new long[count];
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = n % 10;
            n = n / 10;
        }
        return answer;
    }
    
    
    public int calNumberCount(long n) {
        long mul_10 = 1;
        int count = 0;
        
        while(true) {
            if(n < mul_10) {
                break;
            }
            count++;
            mul_10 *= 10;
        }
        return count;
    }
}
