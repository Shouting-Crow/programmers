import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int temp = arr[0];
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (temp == arr[i]){
                continue;
            } else {
                temp = arr[i];
                arrayList.add(arr[i]);
            }
        }

        return arrayList.stream().mapToInt(i -> i).toArray();
    }
}