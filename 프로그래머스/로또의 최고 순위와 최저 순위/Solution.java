import java.util.Arrays;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        answer = new int[2];
        
        int MaxCount = 0;
        int MinCount = 0;
        
        int Lstart_Idx = 0;
        int Wstart_Idx = 0;
        
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        
        for(int lotto : lottos) {
        	if (lotto == 0) 	MaxCount++;
        	else 				break;
        }
        
        System.out.println(MaxCount);
        Lstart_Idx = MaxCount;
        
        while(true) {
        	if (Lstart_Idx >= 6 || Wstart_Idx >= 6) {
        		break;
        	}
        	
        	if (lottos[Lstart_Idx] == win_nums[Wstart_Idx]) {
        		MaxCount += 1;
        		MinCount += 1;
        		Lstart_Idx += 1;
        		Wstart_Idx += 1;
        	} else if (lottos[Lstart_Idx] > win_nums[Wstart_Idx] ) {
        		Wstart_Idx += 1;
        	} else {
        		Lstart_Idx += 1;
        	}
        }
        System.out.println(MinCount);
        int MaxLevel = judge(MaxCount);
        int MinLevel = judge(MinCount);
        
        
        
        answer[0] = MaxLevel;
        answer[1] = MinLevel;
        
        for(int num : answer) {
        	System.out.print(num + " ");
        }
        
        
        return answer;
    }
    
    public int judge(int Count) {
       int LevelNum = 0;
    	switch (Count) {
    	
    	case 0: case 1:	
		LevelNum = 6;
		break;
		
		case 2:	
		LevelNum = 5;
		break;
		
		case 3:
		LevelNum = 4;
		break;
		
		case 4:
		LevelNum = 3;
		break;
		
		case 5:	
		LevelNum = 2;
		break;
		
		default:
		LevelNum = 1;
		break;
		
		}
    	
    	return LevelNum;
    }
}
