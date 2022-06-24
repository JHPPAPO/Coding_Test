class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        answer = new int[2];
        answer[0] = calMaxDivNum(n,m);
        answer[1] = calMinMulNum(n,m);
        return answer;
    }
    
    public int calMaxDivNum(int n, int m) {
        int result = 0;
        int MaxDivNum = 1;
        while(true) {
            //두수와 같아진다면 빠져나오게함.
            if (MaxDivNum == n || MaxDivNum == m) {
                                
                if(n % MaxDivNum == 0 && m % MaxDivNum == 0) {
                    result = MaxDivNum;
                }
                
                break;
            }
            
            if(n % MaxDivNum == 0 && m % MaxDivNum == 0) {
                result = MaxDivNum;
            }
            
            MaxDivNum += 1;
            
        }
        return result;
    }
    
    
    public int calMinMulNum(int n, int m) {
        int n1 = n;
        int m1 = m;
        int result = 0;
        
        int i = 1;
        while(true) {
            if(n1 % n == 0 && n1 % m == 0) {
                result = n1;
                break;
            }
            
            if(m1 % n == 0 && m1 % m == 0) {
                result = m1;
                break;
            }
            
            n1 = n * i;
            m1 = m * i;
            i++;
        }   
        
        return result;
    }
}
