class Solution {
    public int[] solution(int[] answers) {
        //정답이 순서대로 들은 배열 answer 가장 많은 문제를 맞힌 사람이 누구인지 파악
        int[] answer = {};
        
        int[] student0 = {1, 2, 3, 4, 5};
        int[] student1 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student2 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] CorrectArr = new int [3];
        
        for(int i = 0; i < CorrectArr.length; i++) {
            CorrectArr[i] = 0;
        }
        
        for(int i = 0;  i < answers.length; i++) {
            if (student0[i %  student0.length] == answers[i]) {
                CorrectArr[0]++;
            }
            
            if (student1[i %  student1.length] == answers[i]) {
                CorrectArr[1]++;
            }
            
            if (student2[i %  student2.length] == answers[i]) {
                CorrectArr[2]++;
            }
        }
        
        int Max = CorrectArr[0];
        
        for(int i = 0; i < CorrectArr.length; i++) {
            if (Max < CorrectArr[i]) {
                Max = CorrectArr[i];
            }
        }
        
        int sameCount = 0;
        
        for(int i = 0; i < CorrectArr.length; i++) {
            if (Max == CorrectArr[i]) {
                sameCount++;
            }
        }
        
        answer      = new int[sameCount];
        int[] Arr   = new int[sameCount];
        int idx     = 0;
        for(int i = 0; i < CorrectArr.length; i++) {
            if (Max == CorrectArr[i]) {
                Arr[idx++] = i + 1;
            }
        }
        
        answer = Arr;
        
        return answer;
    }
}
