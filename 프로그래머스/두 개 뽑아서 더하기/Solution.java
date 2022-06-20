import java.util.*;


class Solution {
    public int[] solution(int[] numbers) {
        
        
        TreeSet<Integer> ts = new TreeSet<>();
    
        for(int i = 0; i < numbers.length; i++) {
            for(int k = i + 1; k < numbers.length; k++) {
                int sum = numbers[i] + numbers[k];
                ts.add(sum);
            }
        }
        
        Integer[] arr = ts.toArray(new Integer[0]);
        
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }

        return answer;
    }
}
