import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};

        ArrayList<Integer> arrayList = new ArrayList<>();

        int min = Arrays.stream(arr).min().orElse(-1);

        for (int i : arr) {
            if (min == i) continue;
            arrayList.add(i);
        }

        if (arrayList.size() == 0) arrayList.add(-1);

        return arrayList.stream().mapToInt(i -> i).toArray();
    }
}