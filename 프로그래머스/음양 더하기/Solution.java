class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        
        int length = absolutes.length;
        
        
        
        for(int i = 0; i < length; i++) {
            if(signs[i]) {
                sum += absolutes[i];
            } else {
                sum += (absolutes[i] * -1);
            }
        }
        
        
        
        
        return sum;
    }
}
