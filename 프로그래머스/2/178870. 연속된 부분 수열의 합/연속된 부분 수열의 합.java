import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] sequence, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int start = 0, end = 0;
        int currentSum = 0;

        while (end < sequence.length){
            currentSum += sequence[end];

            while (currentSum > k){
                currentSum -= sequence[start];
                start++;
            }

            if (currentSum == k){
                if (arrayList.isEmpty() || (end - start) < (arrayList.get(1) - arrayList.get(0))){
                    arrayList.clear();
                    arrayList.add(start);
                    arrayList.add(end);
                }
            }
            end++;
        }

        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }
    //슬라이딩 윈도우 방법 (GPT 이용)
}