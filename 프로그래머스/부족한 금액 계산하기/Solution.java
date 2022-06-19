class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        
        long sum = 0;
        
        
        for(int i = 1; i <= count; i++) {
            sum += (price * i);
        }
        
        if(sum <= money) {          //금액이 부족하지 않은 경우
            answer = 0;
            return answer;
        } else {                    //금액이 부족한 경우
            answer = sum - money;
        }
        
        
        
        return answer;
    }
}
