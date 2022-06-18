class Solution {
    
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        //출력할 문자열, 왼쪽, 오른손 엄지손가락 위치 지정
        String leftStr = "L", rightStr = "R";
        int leftThumbPos = 10, rightThumbPos = 12;
        
        //0이면 구분하기 힘드므로 11로 다시 초기화해주는 작업
        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                numbers[i] = 11;
            }
        }
        
        for(int i = 0; i < numbers.length; i++) {
            
            if (numbers[i] % 3 == 0) {          //오른손 엄지손가락으로 누르면 되는경우
                rightThumbPos = numbers[i];
                answer += rightStr;
            } else if (numbers[i]  % 3 == 1) {  //왼손 엄지손가락으로 누르면 되는경우
                leftThumbPos = numbers[i];
                answer += leftStr;
            } else {                            //2,5,8,0일 경우
                /*
                    1. 왼쪽, 오른쪽 엄지손가락으로부터 거리를 계산 (메소드 하나 생성)
                        거리가 같을 경우(손잡이 우선)
                        
                    2. 위치에서 더 가까운 경우
                */
                int lDistance = calDistance(leftThumbPos, numbers[i]);
                int rDistance = calDistance(rightThumbPos, numbers[i]);
                
                if (lDistance < rDistance) {
                    leftThumbPos = numbers[i];
                    answer += leftStr;
                } else if (lDistance > rDistance) {
                    rightThumbPos = numbers[i];
                    answer += rightStr;
                } else {
                    if(hand.equals("left")) {
                        leftThumbPos = numbers[i];
                        answer += leftStr;
                    } else if (hand.equals("right")) {
                        rightThumbPos = numbers[i];
                        answer += rightStr;
                    }
   
                }
            }   
        }
        return answer;
    }
    
    
    public int calDistance(int start, int end) {
        
        int Distance = 0;
        int bigPos, smallPos;
                

        if(start > end) {
            bigPos = start;
            smallPos = end;
        } else {
            bigPos =  end;
            smallPos = start;
        }
    
        
        int diffPos = bigPos - smallPos;
        
        if(diffPos < 3 && diffPos > 0) {
            Distance = diffPos;
            return Distance;
        } else {
            Distance += (diffPos / 3);
            Distance += (diffPos % 3);
        }
        return Distance;
        
        
    }
    
    
}
