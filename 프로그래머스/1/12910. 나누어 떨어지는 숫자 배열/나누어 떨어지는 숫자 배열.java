import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i : arr) {
            if (i % divisor == 0) arrayList.add(i);
        }

        if (arrayList.isEmpty()) arrayList.add(-1);

        return arrayList.stream().sorted().mapToInt(i -> i).toArray();
    }
}