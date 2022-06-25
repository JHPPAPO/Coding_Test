import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        int len = s.length();
        char[] arr = new char[len];
        
        for(int i = 0; i < len; i++) {
            arr[i] = s.charAt(i);
        }
        
        int idx = 0;
        
        for(int i = 0; i < len; i++) {
            if (arr[i] == ' ') {
                idx = -1; 
            }
            
            if (idx % 2 == 0) {         //짝수일때,
                arr[i] = makeUpper(arr[i]);
            } else if (idx % 2 == 1) {  //홀수일때,
                arr[i] = makeLower(arr[i]);
            }
            
            idx++;
        }
        
        
        answer = String.valueOf(arr);
        
        return answer;
    }
    
    public char makeUpper(char element) {       //대문자로 변환하는 메소드
        if ('a' <= element && element <= 'z') {
            element = (char) (element - 32);
        }             
        return element;
    }
    
    public char makeLower(char element) {
        if ('A' <= element && element <= 'Z') {
            element = (char) (element + 32);
        }             
        return element;
    }      
    
}
