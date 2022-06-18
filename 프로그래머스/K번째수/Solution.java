import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        //[i, j, k]
        int[] answer = {};
        int[] Array  = array;
        answer = new int [commands.length];
        System.out.println(commands.length);
        for(int i = 0; i < commands.length; i++) {
            answer[i] = FindTarget(Array, commands[i][0], commands[i][1], commands[i][2]);
        }
        
        return answer;
    }
    
    public int FindTarget(int[] Array, int start, int end, int orderNum) {
        int length  = end - start + 1;
        int[] Arr   = new int[length];
        int idx     = 0;
        
        for(int i = start - 1; i <= end - 1; i++) {
            Arr[idx++] =  Array[i];
        }
        
        Arrays.sort(Arr);
        
        return  Arr[orderNum - 1];
    }
}
