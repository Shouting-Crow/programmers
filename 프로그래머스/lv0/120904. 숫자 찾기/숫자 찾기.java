import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while(num / 10 != 0){
            list.add(num % 10);
            num /= 10;
        }
        list.add(num);
        Collections.reverse(list);

        for(int n : list){
            if(n == k){
                answer = list.indexOf(n) + 1;
                break;
            } else answer = -1;
        }
        return answer;
    }
}