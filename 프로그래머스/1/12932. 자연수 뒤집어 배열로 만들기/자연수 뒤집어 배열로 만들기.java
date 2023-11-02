import java.util.ArrayList;

class Solution {
    public int[] solution(long n) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (n / 10 > 0){
            arrayList.add((int) (n % 10));
            n /= 10;
        }
        arrayList.add((int) n);

        return arrayList.stream().mapToInt(i -> i).toArray();
    }
}