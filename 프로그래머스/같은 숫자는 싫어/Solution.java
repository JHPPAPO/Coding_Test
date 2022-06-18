import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer    = {};
        int[] Arr       = arr;
        
        int checkNum    = -1;
        int numofKind   = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if (checkNum != arr[i]) {
                checkNum    = arr[i];
                numofKind++;
            }
        }
        
        answer      = new int [numofKind];
        checkNum    = -1;
        int idx     = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if (checkNum != arr[i]) {
                checkNum        = arr[i];
                answer[idx++]   = arr[i];
            }
        }
        
        return answer;
    }
}
