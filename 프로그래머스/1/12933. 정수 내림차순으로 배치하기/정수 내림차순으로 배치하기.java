import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        String value = "";

        while (n / 10 > 0) {
            arrayList.add((int) (n % 10));
            n /= 10;
        }
        arrayList.add((int) n);

        int size = arrayList.size();

        for (int i = 0; i < size; i++) {
            int max = arrayList.stream().max(Comparator.comparing(num -> num)).orElse(0);
            value += String.valueOf(max);
            arrayList.remove((Integer) max);
        }

        return Long.parseLong(value);
    }
}