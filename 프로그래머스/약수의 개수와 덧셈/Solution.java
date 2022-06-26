class Solution {
    public int solution(int left, int right) {
        int sum = 0;
        
        for(int i = left; i <= right; i++) {
            int divCount = calDivCount(i);
            if (divCount % 2 == 0) {
                sum += i;
            } else if (divCount % 2 == 1) {
                sum -= i;
            }
        }
    
        return sum;
    }
    
    public int calDivCount(int num) {
        
        int count = 0;
        int n = 1;
        
        while(true) {
            if (n == num) {
                count++;
                break;
            }
            
            if (num % n == 0) {
                count++;
            }
            n++;
        }
        
        return count;
        
    }
}
