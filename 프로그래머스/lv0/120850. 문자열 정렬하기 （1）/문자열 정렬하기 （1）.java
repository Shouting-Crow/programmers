import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        ArrayList<Integer> lists = new ArrayList<>();

        char[] chars = my_string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (48 <= chars[i] && chars[i] <= 57){
                lists.add(Integer.parseInt(chars[i] + ""));
            }
        }
        answer = lists.stream().sorted().mapToInt(i -> i).toArray();

        return answer;
    }
}