class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int big = 0, small = 0;
        for(int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > sizes[i][1]) {
                big = sizes[i][0];
                small = sizes[i][1];
                sizes[i][0] = big;
                sizes[i][1] = small;
                
            } else {
                big = sizes[i][1];
                small = sizes[i][0];
                sizes[i][0] = big;
                sizes[i][1] = small;
            }
        }
        
        
        int[] maxArray = {0, 0};
        
        for(int i = 0; i < sizes.length; i++) {
            if (maxArray[0] < sizes[i][0])  {
                maxArray[0] = sizes[i][0];
            }
            
            if (maxArray[1] < sizes[i][1]) {
                maxArray[1] = sizes[i][1];
            }
        }
        
        answer = maxArray[0] * maxArray[1];
        
        return answer;
    }
}
