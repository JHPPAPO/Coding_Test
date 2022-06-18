class Solution {
    public int solution(String s) {
        int answer = 0;
        String original = s;
        
        String NumberStr = MakeStringToNumber(original);
        
        answer = Integer.parseInt(NumberStr);
        
        return answer;
    }
    
    public String MakeStringToNumber(String original) {
        String[] strArr =  { "zero", "one", "two", "three", "four"
				,"five", "six", "seven", "eight", "nine"};
		int[] numberArr = {0,1,2,3,4,5,6,7,8,9};
		String CopyOriginal = original;
		String AllNumberString = "";
		for (int i = 0; i < strArr.length; i++) {
			if (original.indexOf(strArr[i]) != -1) {
				AllNumberString = CopyOriginal.replace(strArr[i], String.valueOf(numberArr[i]));
				CopyOriginal = AllNumberString;
			}
			else {
				AllNumberString = CopyOriginal;
			}
		}
		
		return AllNumberString;
    }
}
