public class Main {
    public static void main(String[ ] args) {
        boolean selfNumberArr[] = new boolean[10001];
        for(int i = 0; i < selfNumberArr.length; i++) {
            selfNumberArr[i] = false;
        }
        int number = 0;
        for(int i = 1; i <= 10000; i++) {
            number = i;
            while(true) {
                number = calConstructor(number);
                if(number > 10000) {
                    break;
                } else {
                    selfNumberArr[number] = true;    
                }
            }
        }
        for(int i = 1; i <= 10000; i++) {
            if(!selfNumberArr[i]) {
                System.out.println(i);
            }
        }
    }
    
    public static int calConstructor(int num) {
        //int를 String으로 변환
        String numberStr = Integer.toString(num);  
        int sum = 0;
        for(int i = 0; i < numberStr.length(); i++) {
            sum += (int) (numberStr.charAt(i) - '0');
        }
        int totalSum = sum + num;
        return totalSum;
    }
}
