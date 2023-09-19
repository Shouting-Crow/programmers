import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        int divideNum = 2;

        while(n > 1){
            if (n % divideNum == 0){
                list.add(divideNum);
                n /= divideNum;
            } else {
                divideNum++;
            }
        }

        answer =  list.stream().sorted().distinct().mapToInt(i -> i).toArray();

        return answer;
    }
}