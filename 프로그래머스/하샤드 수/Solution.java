class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int numofNum = 0;
        int x1 = x;
        int x2 = x;
        while(true) {
            if (x1 / 10 == 0) {
            	numofNum += 1;
                break;
            }
            x1 /= 10;
            numofNum += 1;
        }
        
        System.out.println(numofNum);
        
        int [] numArr = new int [numofNum];
        int idx = 0;
        while(true) {
            if (x2 / 10 == 0) {
            	numArr[idx++] = x2 % 10;
                break;
            }
            
            numArr[idx++] = x2 % 10;
            x2 /= 10;
        }
        
        int sum = 0;
        
        for (int num : numArr) {
        	sum += num;
        	System.out.println(num);
        }
        
        System.out.println(sum);
        
        
        if (x % sum == 0) {
            answer = true;
        } else {
            answer = false;
        }
        
        return answer;
    }
}
