import java.util.ArrayList;
import java.util.Arrays;


class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                arrayList.add(numbers[i]+numbers[j]);
            }
        }

        answer = arrayList.stream().sorted().distinct().mapToInt(i -> i).toArray();

        return answer;
    }
}