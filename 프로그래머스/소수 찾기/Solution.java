class Solution {
    public int solution(int n) {
        int answer = 0;
        
        boolean[] Arr = {};
        Arr = new boolean[n + 1] ;
        
        for(int i = 0; i <= n; i++) {
            Arr[i] = true;
        }
        
        
        for(int i = 2; i <= n; i++) {
            if(Arr[i] == true) {
                for(int j = 2; j*i <= n; j++) {
                    Arr[j*i] = false;
                }    
                answer++;
            }
        
        }
        
        
        return answer;
    }
}
