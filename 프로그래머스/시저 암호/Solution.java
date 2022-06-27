class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        int len = s.length();
        
        char[] arr = new char[len];
        
        for(int i = 0; i < len; i++) {
            arr[i] = changeChar(s.charAt(i), n);
            System.out.println(arr[i]);
        }
        
        
        answer = String.valueOf(arr);
        
        
        return answer;
    }
    
    public char changeChar(char c, int n) {
        char result = ' ';
        if ('a' <= c && c <= 'z') {         //소문자일 경우
            result = (char) (c + n);
            if (result > 'z') {
                int d = (int)(result - 'z');
                result = (char) (('a' - 1) + d);
            }
            
        } else if ('A' <= c && c <= 'Z') {  //대문자일 경우
            result = (char) (c + n);
            if (result > 'Z') {
                int d = (int)(result - 'Z');
                result = (char) (('A' - 1) + d);
            }
        } 
        return result;
    }
}
